package modelo.vista;

import modelo.dto.DiasDeLaSemana;
import modelo.dto.DoctorDTO;
import modelo.dto.PacienteDTO;

public class CitaMV {
	private DiasDeLaSemana diasDeLaSemana;
	private PacienteDTO pacienteDTO;
	private DoctorDTO doctorDTO;
	private Long ID;
	private int hora;
	private boolean eliminado=false;

	public CitaMV() {
	}

	public CitaMV(DiasDeLaSemana diasDeLaSemana, PacienteDTO pacienteDTO, DoctorDTO doctorDTO, Long iD, int hora,
			boolean eliminado) {
		super();
		this.diasDeLaSemana = diasDeLaSemana;
		this.pacienteDTO = pacienteDTO;
		this.doctorDTO = doctorDTO;
		ID = iD;
		this.hora = hora;
		this.eliminado = eliminado;
	}

	public DiasDeLaSemana getDiasDeLaSemana() {
		return diasDeLaSemana;
	}

	public void setDiasDeLaSemana(DiasDeLaSemana diasDeLaSemana) {
		this.diasDeLaSemana = diasDeLaSemana;
	}

	public PacienteDTO getPacienteDTO() {
		return pacienteDTO;
	}

	public void setPacienteDTO(PacienteDTO pacienteDTO) {
		this.pacienteDTO = pacienteDTO;
	}

	public DoctorDTO getDoctorDTO() {
		return doctorDTO;
	}

	public void setDoctorDTO(DoctorDTO doctorDTO) {
		this.doctorDTO = doctorDTO;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

	
	
	


}
