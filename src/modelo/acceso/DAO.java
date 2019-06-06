package modelo.acceso;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class DAO<T> {

	private File file;

	public DAO(String path, boolean create) {
		if (create) {
			this.file = createFile(path);
		} else {
			this.file = new File(path);
		}
	}

	public T getOne() {
		T obj = null;
		try (ObjectInputStream bufferR = objectOpenFlowR()) {
			obj = (T) bufferR.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("");
		}
		return obj;
	}

	public ArrayList<T> getAll() {
		ArrayList<T> list = new ArrayList<>();
		boolean finArchivo = false;
		try (ObjectInputStream bufferR = objectOpenFlowR()) {
			while (!finArchivo) {
				try {
					list.add((T) bufferR.readObject());
				} catch (EOFException e) {
					finArchivo = true;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return list;
	}
	
	
	public T get(T buscado) {
		T obj = null;
		T auxiliar = null;
		boolean encontrado = false, finArchivo = false;
		try (ObjectInputStream bufferR = objectOpenFlowR()) {
			while (!encontrado && !finArchivo) {
				try {
					auxiliar = (T) bufferR.readObject();
					if (auxiliar.equals(buscado)) {
						obj = auxiliar;
						encontrado = true;
					}
				} catch (EOFException e) {
					finArchivo = true;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return obj;
	}

	public boolean delete(T obj) {
		boolean flag = true;
		boolean finArchivo = false;
		T objeto = null;
		File mock = createFile(file.getPath().toString() + ".mock");
		try (ObjectInputStream bufferR = objectOpenFlowR(); ObjectOutputStream bufferW = objectOpenFlowW(mock, true)) {
			while (!finArchivo) {
				try {
					objeto = (T) bufferR.readObject();
					if (!objeto.equals(obj)) {
						bufferW.writeObject(objeto);
					}
				} catch (EOFException e) {
					finArchivo = true;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			flag = false;
		}
		if (flag) {
			try {
				Files.move(mock.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				flag = false;
			}
		}
		return flag;
	}

	public boolean modify(T object) {
		return this.delete(object) && save(object, true);
	}

	public boolean exists(String path) {
		return this.file.exists();
	}

	public boolean delete() {
		return this.file.delete();
	}

	public boolean save(T object) {
		return this.save(object, true);
	}
	
	public boolean override(T object) {
		return this.save(object, false);
	}
	
	public List<String> listarElementosPorNombre(){
		List<String> lista= new ArrayList<>();
		if(!file.isDirectory()) {
			return lista;
		}
		for (File archivo : file.listFiles()) {
			lista.add(archivo.getName());
		}
		return lista;
		
	}

	private boolean save(T object, boolean severalLines) {
		try (ObjectOutputStream bufferW = objectOpenFlowW(file, severalLines)) {
			bufferW.writeObject(object);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	

	private File createFile(String path) {
		String pattern = Pattern.quote(System.getProperty("file.separator"));
		String[] mkdir = path.split(pattern);
		StringBuilder dirs = new StringBuilder();
		for (int i = 0; i < mkdir.length - 1; i++) {
			dirs.append(mkdir[i]);
			createDirectory(dirs.toString());
			dirs.append(File.separator);
		}
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

			}
		}
		return file;
	}

	private void createDirectory(String string) {
		File mkdir = new File(string);
		if (!mkdir.exists()) {
			mkdir.mkdirs();
		}
	}

	private ObjectOutputStream objectOpenFlowW(File file, boolean severalLines) throws IOException {
		if (file.length() > 0 && severalLines) {
			return new MyObjectOutputStream(new FileOutputStream(file, severalLines));
		}
		return new ObjectOutputStream(new FileOutputStream(file));
	}

	private ObjectInputStream objectOpenFlowR() throws IOException {
		return new ObjectInputStream(new FileInputStream(file));
	}

	class MyObjectOutputStream extends ObjectOutputStream {

		public MyObjectOutputStream(OutputStream arg0) throws IOException {
			super(arg0);
		}

		@Override
		protected void writeStreamHeader() throws IOException {
		}

	}

}