package modelo.dto;

public abstract class Persona {
	
	private String nombre,direccion,telefono,apellidos;
	private Long ID;
	private boolean eliminado=false;
	
	public Persona() {
	}

	public Persona(String nombre,String apellidos, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.apellidos=apellidos;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getID() {
		return ID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	
	
	
	
	
	
}
