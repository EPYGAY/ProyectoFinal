package modelo.dao;
import java.io.File;
import java.util.ArrayList;

import modelo.dto.CitaDTO;


public class CitasDAO {
	private String rutaCarpeta = "citas";
	private String extension = ".cit";
	private String nombreFichero = "listaCitas";
	private DAOColecciones<CitaDTO> acceso; 

	public CitasDAO() {
		String path = rutaCarpeta + File.separator  + nombreFichero + extension;
		acceso = new DAOColecciones<CitaDTO>(path, true);
	}

	public boolean guardar(CitaDTO cita) {
		return acceso.save(cita);
	}

	public CitaDTO consultar(Long id) {
		CitaDTO cita = new CitaDTO();
		cita.setID(id);
		return acceso.findById(cita);
	}
	
	public boolean modificar(CitaDTO cita) {
		return acceso.modify(cita);
	}

	public ArrayList<String> obtenerTodosIds() {
		ArrayList<String> lista = new ArrayList<>();
		for (CitaDTO cita : acceso.getAll()) {
			//if (!cita.isEliminado()) { 
				lista.add(String.valueOf(cita.getID()));
			//}
		}
		return lista; 
	}

	public Long obtenerId() {
		ArrayList<String> lista = obtenerTodosIds();
		Long idMax = null;
		for (String id : lista) {
			Long idAux = new Long(id);
			if (null == idMax || idAux > idMax) {
				idMax = idAux;
			}
		}
		if (null == idMax) {
			idMax = 0L;
		}
		return idMax + 1;
	}

	
	

}