package modelo.dto;
 

public class Cita {
	private Long ID;
	private PacienteDTO paciente;
	private DoctorDTO medico;
	private DiasDeLaSemana deLaSemana;
	private boolean eliminado=false;
	public Cita(Long iD, PacienteDTO paciente, DoctorDTO medico, DiasDeLaSemana deLaSemana, boolean eliminado) {
		super();
		ID = iD;
		this.paciente = paciente;
		this.medico = medico;
		this.deLaSemana = deLaSemana;
		this.eliminado = eliminado;
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
	


	
	
}
