package modelo.dto;

import java.util.regex.Pattern;


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
	@Override
	public Respuesta validarCampos(String campo, String patron, String mensaje) {
			return new Respuesta(Pattern.matches(patron,campo),mensaje);
	}
}
