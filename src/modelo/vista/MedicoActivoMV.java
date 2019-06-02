package modelo.vista;

import java.util.Date;

import modelo.dto.Horario;
import utiles.Especialidad;

public class MedicoActivoMV {
	private String nombre, apellidos, direccion, telefono;
	private Especialidad especialidad;
	private Horario horario;
	private Long ID;

	public MedicoActivoMV() {
	}

	public MedicoActivoMV(String nombre, String apellidos, String direccion, String telefono,Especialidad especialidad, Horario horario,
			Long iD) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.especialidad=especialidad;
		this.horario=horario;
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

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}
}
