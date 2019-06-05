package modelo.dto;

import utiles.Especialidad;

public class Medico extends Persona {
	private Horario horario;
	private Especialidad especialidad;

	public Medico(String nombre, String apellidos, String direccion, String telefono, Horario horario,
			Especialidad especialidad) {
		super(nombre, apellidos, direccion, telefono);
		this.horario = horario;
		this.especialidad = especialidad;
	}

}
