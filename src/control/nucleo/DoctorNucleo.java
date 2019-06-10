package control.nucleo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import modelo.dao.DoctorDAO;
import modelo.dto.DoctorDTO;
import modelo.vista.PersonaMV;
import utiles.Validator;

public class DoctorNucleo {
	private DoctorDAO dao = new DoctorDAO();

	public DoctorNucleo() {
	}

	public boolean altaDoctor(PersonaMV doctor) {
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setNombre(doctor.getNombre());
		doctorDTO.setApellidos(doctor.getApellidos());
		doctorDTO.setDireccion(doctor.getDireccion());
		doctorDTO.setTelefono(doctor.getTelefono());
		doctorDTO.setEspecialidad(doctor.getEspecialidad());
		Long IDdoctor = dao.obtenerId();
		doctorDTO.setID(IDdoctor);
		if (validacionDoctor(doctor)) {
			return dao.guardar(doctorDTO);
		}
		return false;

	}

	public boolean validacionDoctor(PersonaMV doctor) {
		if (Validator.isNombre(doctor.getNombre()) && Validator.isPhone(doctor.getTelefono())
				&& Validator.isDireccion(doctor.getDireccion()) && Validator.isWord(doctor.getApellidos())) {
			return true;
		}
		return false;
	}

	public boolean modificarDoctor(PersonaMV doctor) {
		DoctorDTO doctorDTO = dao.consultar(doctor.getID());
		doctorDTO.setNombre(doctor.getNombre());
		doctorDTO.setApellidos(doctor.getApellidos());
		doctorDTO.setDireccion(doctor.getDireccion());
		doctorDTO.setTelefono(doctor.getTelefono());
		return dao.modificar(doctorDTO);
	}

	public boolean bajaDoctor(PersonaMV doctor) {
		DoctorDTO doctorDTO = dao.consultar(doctor.getID());
		doctorDTO.setEliminado(true);
		return dao.modificar(doctorDTO);
	}

	public PersonaMV obtenerDoctor(String id) {
		PersonaMV modelo = new PersonaMV();
		DoctorDTO doctor = dao.consultar(new Long(id));
		modelo.setID(doctor.getID());
		modelo.setNombre(doctor.getNombre());
		modelo.setApellidos(doctor.getApellidos());
		modelo.setDireccion(doctor.getDireccion());
		modelo.setTelefono(doctor.getTelefono());
		modelo.setEspecialidad(doctor.getEspecialidad());
		return modelo;
	}

	public ArrayList<String> listadoIdDoctores() {
		return dao.obtenerTodosIds();
	}

	public HashMap<Long, String> obtenerMapaIDNombre() {
		return dao.obtenerMapaIDNombre();
	}

}
