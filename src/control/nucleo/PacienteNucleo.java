package control.nucleo;

import java.util.ArrayList;

import modelo.dao.PacienteDAO;
import modelo.dto.PacienteDTO;
import modelo.vista.PersonaMV;

public class PacienteNucleo {
	
	private PacienteDAO dao= new PacienteDAO();
	
	public PacienteNucleo() {
	}
	
	public boolean altaPaciente(PersonaMV paciente) {
		PacienteDTO pacienteDTO= new PacienteDTO();
		pacienteDTO.setNombre(paciente.getNombre());
		pacienteDTO.setApellidos(paciente.getApellidos());
		pacienteDTO.setDireccion(paciente.getDireccion());
		pacienteDTO.setTelefono(paciente.getTelefono());
		pacienteDTO.setFechaNacimiento(paciente.getFechaNacimiento());
		return  dao.guardar(pacienteDTO);
	}
	
	public boolean modificarPaciente(PersonaMV paciente) {
		PacienteDTO pacienteDTO= dao.consultar(paciente.getID());
		pacienteDTO.setNombre(paciente.getNombre());
		pacienteDTO.setApellidos(paciente.getApellidos());
		pacienteDTO.setDireccion(paciente.getDireccion());
		pacienteDTO.setTelefono(paciente.getTelefono());
		pacienteDTO.setFechaNacimiento(paciente.getFechaNacimiento());
		return  dao.modificar(pacienteDTO);
	}
	public boolean bajaPaciente(PersonaMV paciente) {
		PacienteDTO pacienteDTO= dao.consultar(paciente.getID());
		pacienteDTO.setEliminado(true);
		return  dao.eliminar(pacienteDTO);
	}
	
	public PersonaMV obtenerPaciente(String id) {
		PersonaMV modelo=new PersonaMV();
		PacienteDTO paciente=dao.consultar(new Long(id));
		modelo.setID(paciente.getID());
		modelo.setNombre(paciente.getNombre());
		modelo.setApellidos(paciente.getApellidos());
		modelo.setDireccion(paciente.getDireccion());
		modelo.setTelefono(paciente.getTelefono());
		modelo.setFechaNacimiento(paciente.getFechaNacimiento());
		return modelo;
	}

	public ArrayList<String> listadoIdPacientes() {
		return dao.obtenerTodosLosId();
	}
	
	
	
	
	
	

}
