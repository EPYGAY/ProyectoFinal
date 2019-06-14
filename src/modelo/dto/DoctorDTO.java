package modelo.dto;

import java.io.Serializable;

import utiles.Especialidad;

public class DoctorDTO extends PersonaDTO implements Serializable{
	
	private Especialidad especialidad;
	private Turno turno;
	private Horario horario;


	public DoctorDTO() { 
	}
	
	public DoctorDTO(String nombre, String apellidos, String direccion, String telefono, Horario horario,
			Especialidad especialidad) {
		super(nombre, apellidos, direccion, telefono);
		this.turno = turno;
		this.horario = horario;
		this.especialidad = especialidad;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public Turno getTurno() {
		return turno;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	 
	
	
	
	
	

}
