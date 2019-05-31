package facade;

import control.nucleo.PacienteNucleo;
import modelo.vista.PacienteMV;

public class Facade {

	private PacienteNucleo pacienteNucleo= new PacienteNucleo();
	
	public boolean guardarPaciente(PacienteMV pacienteMV) {
		return pacienteNucleo.altaPaciente(pacienteMV);
	}
	public boolean modificar(PacienteMV pacienteMV) {
		return pacienteNucleo.modificarPaciente(pacienteMV);
	}
}
