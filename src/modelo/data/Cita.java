package modelo.data;

import java.util.Date;

public class Cita {
	private String ID;
	private Paciente paciente;
	private Medico medico;
	private Date fecha;
	private boolean confirmacionFecha;
	private String observaciones;
	
	public Cita(Paciente paciente, Medico medico, Date fecha, boolean confirmacionFecha,
			String observaciones) {
		ID = obtnerId();
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
		this.confirmacionFecha = confirmacionFecha;
		this.observaciones = observaciones;
	}

	private String obtnerId() {
		return null;
	}
	
	
	
}
