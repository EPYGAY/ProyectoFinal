package modelo.vista;

import java.util.Date;

public class CitaMV {
	private Long ID;
	private String idPaciente;
	private String idMedico;
	private Date fecha;
	private boolean confirmacionFecha;
	private String observaciones;
	


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

	
	


}
