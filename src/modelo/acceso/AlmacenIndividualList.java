package modelo.acceso;

import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 * 
 * @author estar
 *
 *         Cuando en un fichero hemos almacenado un solo elemento y es una Lis
 * @param <T>
 */
public class AlmacenIndividualList<T> {

	private AbstractList<T> list;
	private String path;
	private DAO<AbstractList<T>> dao;
	private String nombreArchivo;
	private String rutaCompleta;

	//El path es completo 
	public AlmacenIndividualList(String path,String nombreArchivo) {
		super();
		assert list != null && path != null;
		this.path = path;
		dao = new DAO<AbstractList<T>>();
		File ruta=new File(path);
		if(!ruta.exists()) ruta.mkdirs();
		this.nombreArchivo=nombreArchivo;
		rutaCompleta=path+"/"+nombreArchivo;
		ruta=new File(rutaCompleta);
		if(!ruta.exists()){
			list=new ArrayList<T>();
		}
		else{
			list=getList();
		}
	}

	public T obtener(int index) {
		getList();
		T retorno = null;
		if (index < list.size()) {
			retorno = list.get(index);
		}
		return retorno;

	}

	public boolean grabar(T t) {
		assert t != null;
		boolean retorno = false;
		getList();
		if (list.add(t) && dao.grabar(rutaCompleta, list)) {
			retorno = true;
		}
		getList();
		return retorno;
	}

	public AbstractList<T> getList() {
		// Primero veo que lista está almacenada
		AbstractList<T> temporal = dao.leer(rutaCompleta);
		// Si no hay ninguna la grabo
		if (temporal == null) {
			dao.grabar(rutaCompleta, list);
			temporal=dao.leer(rutaCompleta);
		}
		return temporal;
	}
}
