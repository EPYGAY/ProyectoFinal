package control.nucleo;

import java.util.ArrayList;

import modelo.dao.DoctorDAO;
import modelo.dto.DoctorDTO;
import modelo.vista.PersonaMV;

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
		return dao.guardar(doctorDTO);
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
		return modelo;
	}

	public ArrayList<String> listadoIdDoctores() {
		return dao.obtenerTodosIds();
	}

}
