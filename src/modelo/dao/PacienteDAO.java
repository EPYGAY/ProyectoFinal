package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.acceso.AccesoFichero;
import modelo.dto.PacienteDTO;

public class PacienteDAO {

	private String rutaCarpeta = "cliente";
	private String extension = ".cli";

	public PacienteDAO() {

	}

	public boolean guardar(PacienteDTO paciente) {
		Long IDpaciente = obtnerIDpaciente();
		paciente.setID(IDpaciente);
		String path = rutaCarpeta + "/" + IDpaciente + extension;
		AccesoFichero<PacienteDTO> acceso = new AccesoFichero<PacienteDTO>(path, true);
		return acceso.save(paciente);
	}

	public PacienteDTO consultar(Long id) {
		String path = rutaCarpeta + "/" + String.valueOf(id) + extension;
		AccesoFichero<PacienteDTO> acceso = new AccesoFichero<PacienteDTO>(path, false);
		return acceso.getOne();
	}
	
	public boolean modificar(PacienteDTO paciente) {
		String idPaciente=String.valueOf(paciente.getID());
		String path = rutaCarpeta + "/" + idPaciente + extension;
		AccesoFichero<PacienteDTO> acceso = new AccesoFichero<PacienteDTO>(path, false);
		return acceso.override(paciente);
	}

	public List<String> obtenerTodosLosId() {
		AccesoFichero<PacienteDTO> acceso = new AccesoFichero<>(rutaCarpeta, false);
		List<String> lista = acceso.listarElementosPorNombre();
		List<String> listaId= new ArrayList<>(); 
		for (String nombre : lista) {
			String idTexto = nombre.replace(extension, "");
			listaId.add(idTexto);
		}
		return lista;
	}

	private Long obtnerIDpaciente() {
		AccesoFichero<PacienteDTO> acceso = new AccesoFichero<>(rutaCarpeta, false);
		List<String> lista = acceso.listarElementosPorNombre();
		Long idFinal = null;
		for (String nombre : lista) {
			String idTexto = nombre.replace(extension, "");
			Long idAux = new Long(idTexto);
			if (null == idFinal || idAux > idFinal) {
				idFinal = idAux;
			}
		}
		return idFinal;
	}

}
