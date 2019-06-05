package facade;

import java.util.ArrayList;

import control.nucleo.DoctorNucleo;
import control.nucleo.PacienteNucleo;
import modelo.vista.PersonaMV;

public class Facade {

	private PacienteNucleo pacienteNucleo= new PacienteNucleo();
	private DoctorNucleo doctorNucleo=new DoctorNucleo();
	
	public boolean guardarPaciente(PersonaMV pacienteMV) {
		return pacienteNucleo.altaPaciente(pacienteMV);
	}

	public PersonaMV obtenerPaciente(String id) {
		return pacienteNucleo.obtenerPaciente(id);
	}
	
	public ArrayList<String> listadoIdPacientes(){
		return pacienteNucleo.listadoIdPacientes();
	}
	
	public boolean darBajaPaciente(PersonaMV pacienteMV) {
		return pacienteNucleo.bajaPaciente(pacienteMV);
	}

	public boolean modificarPaciente(PersonaMV obtenerDatos) {
		return pacienteNucleo.modificarPaciente(obtenerDatos);
	}
	
	public boolean guardarDoctor(PersonaMV pacienteMV) {
		return doctorNucleo.altaDoctor(pacienteMV);
	}
	

	public PersonaMV obtenerDoctor(String id) {
		return doctorNucleo.obtenerDoctor(id);
	}
	
	public ArrayList<String> listadoIdDoctor(){
		return doctorNucleo.listadoIdDoctores();
	}
	
	public boolean darBajaDoctor(PersonaMV pacienteMV) {
		return doctorNucleo.bajaDoctor(pacienteMV);
	}

}
