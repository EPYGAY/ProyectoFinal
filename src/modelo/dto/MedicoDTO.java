package modelo.dto;

import java.io.Serializable;
import java.util.regex.Pattern;

import utiles.Especialidad;

public class MedicoDTO extends PersonaDTO implements Serializable{
	private Horario horario;
	private Especialidad especialidad;

	public MedicoDTO() {
	}
	public MedicoDTO(String nombre, String apellidos, String direccion, String telefono,
			Especialidad especialidad, Horario horario) {
		super(nombre, apellidos, direccion, telefono);
		this.horario = horario;
		this.especialidad = especialidad;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}

}
