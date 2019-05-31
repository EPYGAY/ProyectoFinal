package modelo.data;

import java.util.regex.Pattern;

import utiles.Especialidad;

public class Medico extends Persona {
	private Horario horario;
	private Especialidad especialidad;



	public Medico(String nombre, String direccion, String telefono, Horario horario, Especialidad especialidad) {
		super(nombre, direccion, telefono);
		this.horario = horario;
		this.especialidad = especialidad;
	}



	@Override
	public String obtenerId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta validarCampos(String campo, String patron, String mensaje) {
		return new Respuesta(Pattern.matches(patron, campo),mensaje);
	}

}
