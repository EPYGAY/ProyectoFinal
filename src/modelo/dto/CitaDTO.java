package modelo.dto;

import java.io.Serializable;


public class CitaDTO implements Serializable{
	private Long ID;
	private PacienteDTO paciente;
	private DoctorDTO medico;
	private DiasDeLaSemana deLaSemana;
	private boolean eliminado=false;
	
	private int hora;
	
	public CitaDTO() {
		super();
	}

	public CitaDTO(Long iD, PacienteDTO paciente, DoctorDTO medico, DiasDeLaSemana deLaSemana, boolean eliminado,
			int hora) {
		super();
		ID = iD;
		this.paciente = paciente;
		this.medico = medico;
		this.deLaSemana = deLaSemana;
		this.eliminado = eliminado;
		this.hora = hora;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public PacienteDTO getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteDTO paciente) {
		this.paciente = paciente;
	}

	public DoctorDTO getMedico() {
		return medico;
	}

	public void setMedico(DoctorDTO medico) {
		this.medico = medico;
	}

	public DiasDeLaSemana getDeLaSemana() {
		return deLaSemana;
	}

	public void setDeLaSemana(DiasDeLaSemana deLaSemana) {
		this.deLaSemana = deLaSemana;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	
	
}
