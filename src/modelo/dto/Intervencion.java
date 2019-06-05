package modelo.dto;

import utiles.TipoIntervencion;

public class Intervencion {

	private String ID;
	private PacienteDTO paciente;
	private DoctorDTO medicoSolicitante;
	private DoctorDTO medicoIntervencion;
	private TipoIntervencion intervencion;
	private boolean confirmacionRealizacion;
	private String resultado;

	public Intervencion(String iD, PacienteDTO paciente, DoctorDTO medicoSolicitante, DoctorDTO medicoIntervencion,
			TipoIntervencion intervencion, boolean confirmacionRealizacion, String resultado) {
		super();
		ID = obtenerId();
		this.paciente = paciente;
		this.medicoSolicitante = medicoSolicitante;
		this.medicoIntervencion = medicoIntervencion;
		this.intervencion = intervencion;
		this.confirmacionRealizacion = confirmacionRealizacion;
		this.resultado = resultado;
	}

	private String obtenerId() {
		// TODO Auto-generated method stub
		return null;
	}

}
