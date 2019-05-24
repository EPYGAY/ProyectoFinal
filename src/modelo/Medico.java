package modelo;

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

}
