package modelo.dto;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.Serializable;

import utiles.Validator;

public abstract class PersonaDTO implements Serializable {
	
	private String nombre,direccion,telefono,apellidos;
	private Long ID;
	private boolean eliminado=false;
	
	public PersonaDTO() {
	}

	public PersonaDTO(String nombre,String apellidos, String direccion, String telefono) {
		//assertTrue(Validator.isNombre(nombre));
		this.nombre = nombre; 
		//assertTrue(Validator.isDireccion(direccion));
		this.direccion = direccion;
		//assertTrue(Validator.isPhone(telefono));
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
	
	
	
	@Override
	public boolean equals(Object obj) {
		return this.ID.equals(((PersonaDTO)obj).ID);
	}
	
	
	
	
	
	
	
}
