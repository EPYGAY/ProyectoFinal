package modelo.dto;

import utiles.Especialidad;

public class MedicoActivo extends Medico {
	private Horario horario;
	
	

	public MedicoActivo(String nombre, String apellidos, String direccion, String telefono,
			Especialidad especialidad, Horario horario) {
		super(nombre, apellidos, direccion, telefono, especialidad);
		this.horario = horario;
	}
	public MedicoActivo() {
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
}
