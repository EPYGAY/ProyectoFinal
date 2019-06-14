package facade;

import java.util.ArrayList;
import java.util.HashMap;

import control.nucleo.CitaNucleo;
import control.nucleo.DoctorNucleo;
import control.nucleo.PacienteNucleo;
import modelo.vista.CitaMV;
import modelo.vista.PersonaMV;

public class Facade {

	private PacienteNucleo pacienteNucleo= new PacienteNucleo();
	private DoctorNucleo doctorNucleo=new DoctorNucleo();
	private CitaNucleo citaNucleo=new CitaNucleo();
	
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

	public boolean modificarDoctor(PersonaMV obtenerDatos) {
		return doctorNucleo.modificarDoctor(obtenerDatos);
	}

	public HashMap<Long, String> obtnerMapaPaciente() {
		return pacienteNucleo.obtenerMapaIDNombre();
	}

	public HashMap<Long, String> obtnerMapaDoctor() {
		return doctorNucleo.obtenerMapaIDNombre(); 
	}
	
	public boolean guardarCita(CitaMV citaMV) {
		return citaNucleo.altaCita(citaMV);
	}

	public ArrayList<CitaMV> obtenerCita(String idPcaciente) {
		return citaNucleo.obtenerCita(idPcaciente);
	}


}

