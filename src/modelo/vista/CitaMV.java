package modelo.vista;

import java.util.Date;

import utiles.Especialidad;

public class CitaMV {
	private Long ID;
	private String idPaciente;
	private String idMedico;
	private Date fecha;
	private boolean confirmacionFecha;
	private String observaciones;
	private String nombreMedico;
	private String nombrePaciente;
	private String apellidoPaciente;
	private Especialidad especialidad;
	


	public CitaMV(Long iD, String idPaciente, String idMedico, Date fecha, boolean confirmacionFecha,
			String observaciones) {
		super();
		ID = iD;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.fecha = fecha;
		this.confirmacionFecha = confirmacionFecha;
		this.observaciones = observaciones;
	}

	public CitaMV() {
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(String idMedico) {
		this.idMedico = idMedico;
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

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getApellidoPaciente() {
		return apellidoPaciente;
	}

	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	


}
