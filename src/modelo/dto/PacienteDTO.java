package modelo.dto;

import java.util.Date;
import java.util.regex.Pattern;



public class PacienteDTO extends Persona {

	private Date fechaNacimiento;
	
	public PacienteDTO() {
	}

	public PacienteDTO(String nombre, String apellidos, String direccion, String telefono, Date fechaNacimiento) {
		super(nombre, apellidos, direccion, telefono);
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public Respuesta validarCampos(String campo, String patron, String mensaje) {
			return new Respuesta(Pattern.matches(patron,campo),mensaje);
	}
	

	

}
