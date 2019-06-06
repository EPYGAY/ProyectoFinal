package modelo.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import modelo.acceso.DAO;
import modelo.dto.PacienteDTO;



public class PacienteDAO {

	private String rutaCarpeta = "cliente";
	private String extension = ".cli";

	public PacienteDAO() {
		
	}

	public <IDpaciente> boolean guardar(PacienteDTO paciente) {
		Long IDpaciente = obtnerIDpaciente();
		paciente.setID(IDpaciente);
		String path = rutaCarpeta + File.separator + IDpaciente + extension;
		DAO<PacienteDTO> acceso = new DAO<PacienteDTO>(path, true);
		return acceso.save(paciente);
	}

	public PacienteDTO consultar(Long id) {
		String path = rutaCarpeta + File.separator + String.valueOf(id) + extension;
		DAO<PacienteDTO> acceso = new DAO<PacienteDTO>(path, false);
		return acceso.getOne();
	}
	
	public boolean modificar(PacienteDTO paciente) {
		String idPaciente=String.valueOf(paciente.getID());
		String path = rutaCarpeta + File.separator + idPaciente + extension;
		DAO<PacienteDTO> acceso = new DAO<PacienteDTO>(path, false);
		return acceso.override(paciente);
	}
	public boolean eliminar(PacienteDTO paciente) {
		String idPaciente=String.valueOf(paciente.getID());
		String path = rutaCarpeta + File.separator + idPaciente + extension;
		DAO<PacienteDTO> acceso = new DAO<PacienteDTO>(path, false);
		return acceso.delete();
	}

	public ArrayList<String> obtenerTodosLosId() {
		DAO<PacienteDTO> acceso = new DAO<>(rutaCarpeta, false);
		List<String> lista = acceso.listarElementosPorNombre();
		ArrayList<String> listaId= new ArrayList<>(); 
		for (String nombre : lista) {
			String idTexto = nombre.replace(extension, "");
			if(!consultar(new Long(idTexto)).isEliminado()) {
				listaId.add(idTexto);
			}
		}
		return listaId;
	}

	private Long obtnerIDpaciente() {
		DAO<PacienteDTO> acceso = new DAO<>(rutaCarpeta, false);
		List<String> lista = acceso.listarElementosPorNombre();
		Long idFinal = null;
		for (String nombre : lista) {
			String idTexto = nombre.replace(extension, "");
			Long idAux = new Long(idTexto);
			if (null == idFinal || idAux > idFinal) {
				idFinal = idAux;
			}
		}
		if(null==idFinal) {
			idFinal=0L;
		}
		return idFinal+1;
	}

}
