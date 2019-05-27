package modelo;

import java.util.Date;

public class Paciente extends Persona{
	
public Paciente(String nombre, String direccion, String telefono, Date fechaNacimiento) {
		super(nombre, direccion, telefono);
		this.fechaNacimiento = fechaNacimiento;
	}
private Date fechaNacimiento;
	@Override
	public String obtenerId() {
		// TODO Auto-generated method stub
		return null;
	}

}
