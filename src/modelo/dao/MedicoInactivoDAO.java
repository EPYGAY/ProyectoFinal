package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.acceso.AccesoFichero;
import modelo.dto.Medico;

public class MedicoInactivoDAO {
	private String rutaCarpeta = "medicoInactivos";
	private String extension = ".med";

	public MedicoInactivoDAO() {

	}

	public boolean guardar(Medico medico) {
		Long IDmedico = obtnerIDmedico();
		medico.setID(IDmedico);
		String path = rutaCarpeta + "/" + IDmedico + extension;
		AccesoFichero<Medico> acceso = new AccesoFichero<Medico>(path, true);
		return acceso.save(medico);
	}

	public Medico consultar(Long id) {
		String path = rutaCarpeta + "/" + String.valueOf(id) + extension;
		AccesoFichero<Medico> acceso = new AccesoFichero<Medico>(path, false);
		return acceso.getOne();
	}
	
	public boolean modificar(Medico medico) {
		String idPaciente=String.valueOf(medico.getID());
		String path = rutaCarpeta + "/" + idPaciente + extension;
		AccesoFichero<Medico> acceso = new AccesoFichero<Medico>(path, false);
		return acceso.override(medico);
	}

	public List<String> obtenerTodosLosId() {
		AccesoFichero<Medico> acceso = new AccesoFichero<>(rutaCarpeta, false);
		List<String> lista = acceso.listarElementosPorNombre();
		List<String> listaId= new ArrayList<>(); 
		for (String nombre : lista) {
			String idTexto = nombre.replace(extension, "");
			listaId.add(idTexto);
		}
		return lista;
	}

	private Long obtnerIDmedico() {
		AccesoFichero<Medico> acceso = new AccesoFichero<>(rutaCarpeta, false);
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
