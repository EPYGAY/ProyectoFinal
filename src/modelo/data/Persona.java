package modelo.data;

public abstract class Persona {
	
	private String ID,nombre,direccion,telefono;

	public Persona(String nombre, String direccion, String telefono) {
		this.ID=obtenerId();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	//El padre llama a los metodos del hijo. El id del paciente se obtine
	//de diferente forma al de los medicos
	public abstract String obtenerId();
	
}
