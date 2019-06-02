package modelo.dto;

import utiles.Especialidad;

public class Medico extends Persona {
	
	private Especialidad especialidad;

	public Medico(String nombre, String apellidos, String direccion, String telefono, Especialidad especialidad) {
		super(nombre, apellidos, direccion, telefono);
		
		this.especialidad = especialidad;
	}
	public Medico() {
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
}
