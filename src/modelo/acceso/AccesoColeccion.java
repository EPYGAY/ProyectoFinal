package modelo.acceso;

import java.util.ArrayList;
import java.util.Map;

import modelo.dto.DoctorDTO;

public class AccesoColeccion<T> {
	
	private ArrayList<T> lista;
	private AccesoFichero<ArrayList<T>> accesoFichero;
	
	public AccesoColeccion(String path,boolean create) {
		accesoFichero=new AccesoFichero<>(path, create);
		lista=accesoFichero.getOne();
		if(null==lista) {
			lista=new ArrayList<>();
		}
	}

	public ArrayList<T> getAll() {
		return lista;
	}
	
	public boolean save(T element) {
		lista.add(element);
		return accesoFichero.override(lista);
	}
	
	public T findById(T idElement) {
		for(T element:lista) {
			if(element.equals(idElement)) {
				return element;
			}
		}
		return null;
	}
	
	public boolean modify(T element) {
		T elementOriginal=findById(element);
		lista.remove(elementOriginal);
		lista.add(element);
		return accesoFichero.override(lista);
	}
	
}

