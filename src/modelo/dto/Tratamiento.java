package modelo.dto;

import javax.xml.crypto.Data;

import utiles.Medicamento;

public class Tratamiento {
	
	
	private String ID;
	private Medicamento medicamento;
	private String dosis;
	private Data fechaInicio;
	private Data fechaFin;
	
	public Tratamiento(String iD, Medicamento medicamento, String dosis, Data fechaInicio, Data fechaFin) {
		super();
		ID = obtnerId();
		this.medicamento = medicamento;
		this.dosis = dosis;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	

	private String obtnerId() {
		return null;
	}
	
	
}
