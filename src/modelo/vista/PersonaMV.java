package modelo.vista;

import utiles.Especialidad;

public class PersonaMV {
	private String nombre, apellidos, direccion, telefono, fechaNacimiento;
	private Especialidad especialidad;
	private Long ID;

	public PersonaMV() {
	}

	public PersonaMV(String nombre, String apellidos, String direccion, String telefono, String fechaNacimiento,
			Especialidad especialidad, Long iD) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.especialidad = especialidad;
		ID = iD;
	}
 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	


}
