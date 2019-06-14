package modelo.dto;

import java.io.Serializable;
import java.util.Date;

import utiles.Especialidad;


public class CitaDTO implements Serializable{
	private Long ID;
	private PacienteDTO paciente;
	private DoctorDTO medico;
	private Date fecha;
	private boolean confirmacionFecha;
	private String observaciones;
	private Especialidad especialidad;
	
	
	public CitaDTO() {
		super();
	}


	public CitaDTO(Long iD, PacienteDTO paciente, DoctorDTO medico, Date fecha, boolean confirmacionFecha,
			String observaciones) {
		super();
		ID = iD;
		this.especialidad=medico.getEspecialidad();
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
		this.confirmacionFecha = confirmacionFecha;
		this.observaciones = observaciones;
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


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public boolean isConfirmacionFecha() {
		return confirmacionFecha;
	}


	public void setConfirmacionFecha(boolean confirmacionFecha) {
		this.confirmacionFecha = confirmacionFecha;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public Especialidad getTipo() {
		
		return especialidad;
	}
	
	public void setTipo(Especialidad especialidad) {
		this.especialidad=especialidad;
	}


	

	
	
	
}
