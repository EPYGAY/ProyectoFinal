package control.nucleo;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.dao.PacienteDAO;
import modelo.dto.PacienteDTO;
import modelo.vista.PersonaMV;
import utiles.Validator;

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
		Long IDpaciente =dao.obtnerIDpaciente();
		pacienteDTO.setID(IDpaciente);
		if (validacionPaciente(paciente)) {
			return  dao.guardar(pacienteDTO);
		}
		return false;
		
	}
	
	public boolean modificarPaciente(PersonaMV paciente) {
		PacienteDTO pacienteDTO= dao.consultar(paciente.getID());
		pacienteDTO.setNombre(paciente.getNombre());
		pacienteDTO.setApellidos(paciente.getApellidos());
		pacienteDTO.setDireccion(paciente.getDireccion());
		pacienteDTO.setTelefono(paciente.getTelefono());
		pacienteDTO.setFechaNacimiento(paciente.getFechaNacimiento());
		if (validacionPaciente(paciente)) {
			return  dao.modificar(pacienteDTO); 
		}
		return false;
		
	}
	public boolean bajaPaciente(PersonaMV paciente) {
		PacienteDTO pacienteDTO= dao.consultar(paciente.getID());
		return  dao.eliminar(pacienteDTO);
	}
	
	public boolean validacionPaciente(PersonaMV paciente) {
		if (Validator.isNombre(paciente.getNombre()) && Validator.isPhone(paciente.getTelefono())
				&& Validator.isDireccion(paciente.getDireccion())&&Validator.isFechaNacimiento(paciente.getFechaNacimiento()) && Validator.isWord(paciente.getApellidos())) {
			return true;
		}
		return false;
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

	public HashMap<Long, String> obtenerMapaIDNombre() {
		return dao.obtenerMapaIDNombre();
	}
	
	
	
	
	
	

}
