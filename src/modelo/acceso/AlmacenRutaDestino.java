package modelo.acceso;

import java.io.File;
import java.util.ArrayList;

/**
 * Se utiliza cuando queremos almacenar en una misma carpeta cada objeto en un
 * archivo diferente cuyo nombre es obtenido por el numero mayor de entre los
 * existentes en dicha carpeta Ejemplo La ruta inicial puede escribirse
 * relativamente o absolutamente ./clientes
 * 
 * @author estar
 *
 * @param <T>
 */
public class AlmacenRutaDestino<T> {
	private DAO daoRuta;
	private String pathInicial;
	private String extension;

	/**
	 * Se crea la carpeta donde se almacenan los archivos y la extension con la
	 * que se guardaran
	 * 
	 * @param pathInicial
	 * @param extension
	 */
	public AlmacenRutaDestino(String pathInicial, String extension) {
		super();
		this.pathInicial = pathInicial;
		this.extension = extension;
		daoRuta = new DAO<>();
		File file = new File(pathInicial);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	/**
	 * Introduce el nombre de la carpeta destino donde se encuentran los
	 * archivos a tratar introduce el nombre del elemento sin usar la extension
	 * 
	 * @param pathDestino
	 *            una carpeta dentro de la carpeta que se define en el inicio
	 * @param nombreElemento
	 *            que puede ser dado por el id del objeto
	 * @param t
	 *            el elemento a grabar
	 * @return
	 */
	public boolean grabar(String nombreElemento, T t) {
		return daoRuta.grabar(pathInicial + "/" + nombreElemento + "." + extension, t);
	}

	/**
	 * Introduce el nombre de la carpeta destino donde se encuentran los
	 * archivos a tratar introduce el nombre del elemento sin usar la extension
	 * 
	 * @param pathDestino
	 * @param nombreElemento
	 * @return
	 */
	public T obtener(String nombreElemento) {

		return (T) daoRuta.leer(pathInicial + "/" + nombreElemento + "." + extension);
	}

	/**
	 * Devuelve los nombres de los archivos que estan dentro de la carpeta
	 * destino sin extension
	 * 
	 * @param pathDestino
	 * @return
	 */
	public String[] getFiles() {
		String[] elements = null;
		File carpeta = new File(pathInicial);
		if (carpeta.exists() && carpeta.isDirectory()) {
			elements = carpeta.list();
			elements = quitarExtension(elements);
		}
		return elements;
	}

	private String[] quitarExtension(String[] elements) {
		String[] definitivos = new String[elements.length];
		for (int i = 0; i < elements.length; i++) {
			definitivos[i] = elements[i].split("\\.")[0];
		}
		return definitivos;
	}

	public ArrayList<T> getList() {
		ArrayList<T> lista = new ArrayList<>();
		String[] files = getFiles();
		for (String string : files) {
			lista.add(obtener(string));
		}
		return lista;
	}
}
