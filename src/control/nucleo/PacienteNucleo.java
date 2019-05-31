package control.nucleo;

import modelo.dao.PacienteDAO;
import modelo.dto.PacienteDTO;
import modelo.vista.PacienteMV;

public class PacienteNucleo {
	
	private PacienteDAO dao= new PacienteDAO();
	
	public PacienteNucleo() {
	}
	
	public boolean altaPaciente(PacienteMV paciente) {
		PacienteDTO pacienteDTO= new PacienteDTO();
		pacienteDTO.setNombre(paciente.getNombre());
		pacienteDTO.setApellidos(paciente.getApellidos());
		pacienteDTO.setDireccion(paciente.getDireccion());
		pacienteDTO.setTelefono(paciente.getTelefono());
		pacienteDTO.setFechaNacimiento(paciente.getFechaNacimiento());
		return  dao.guardar(pacienteDTO);
	}
	
	public boolean modificarPaciente(PacienteMV paciente) {
		PacienteDTO pacienteDTO= dao.consultar(paciente.getID());
		pacienteDTO.setNombre(paciente.getNombre());
		pacienteDTO.setApellidos(paciente.getApellidos());
		pacienteDTO.setDireccion(paciente.getDireccion());
		pacienteDTO.setTelefono(paciente.getTelefono());
		pacienteDTO.setFechaNacimiento(paciente.getFechaNacimiento());
		return  dao.modificar(pacienteDTO);
	}
	
	public boolean bajarPaciente(PacienteMV paciente) {
		PacienteDTO pacienteDTO= dao.consultar(paciente.getID());
		pacienteDTO.setEliminado(true);
		return  dao.modificar(pacienteDTO);
	}
	
	
	
	
	
	

}
