package modelo.dto;

import java.io.Serializable;

import utiles.Especialidad;

public class DoctorDTO extends PersonaDTO implements Serializable{
	private Horario horario;
	private String especialidad;

	public DoctorDTO() { 
	}
	public DoctorDTO(String nombre, String apellidos, String direccion, String telefono, Horario horario,
			String especialidad) {
		super(nombre, apellidos, direccion, telefono);
		this.horario = horario;
		this.especialidad = especialidad;
	} 
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

}
