package modelo.dao;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.dto.DoctorDTO;

public class DoctorDAO {
	private String rutaCarpeta = "doctor";
	private String extension = ".doct";
	private String nombreFichero = "listaDoctores";
	private DAOColecciones<DoctorDTO> acceso;

	public DoctorDAO() {
		String path = rutaCarpeta + File.separator  + nombreFichero + extension;
		acceso = new DAOColecciones<DoctorDTO>(path, true);
	}

	public boolean guardar(DoctorDTO doctor) {
		return acceso.save(doctor);
	}

	public DoctorDTO consultar(Long id) {
		DoctorDTO doctor = new DoctorDTO();
		doctor.setID(id);
		return acceso.findById(doctor);
	}

	public boolean modificar(DoctorDTO doctor) {
		return acceso.modify(doctor);
	}

	public HashMap<Long,String> obtenerMapaIDNombre() {
		HashMap<Long,String> mapa = new HashMap<Long,String>();
		for (DoctorDTO doctor : acceso.getAll()) {
			if (!doctor.isEliminado()) {
				mapa.put(doctor.getID(),doctor.getNombre());
			}
		}
		return mapa;
	}
	
	public ArrayList<String> obtenerTodosIds() {
		ArrayList<String> lista = new ArrayList<>();
		for (DoctorDTO doctor : acceso.getAll()) {
			if (!doctor.isEliminado()) {
				lista.add(String.valueOf(doctor.getID()));
			}
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