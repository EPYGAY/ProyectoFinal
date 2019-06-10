package control.nucleo;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.dao.CitasDAO;
import modelo.dao.PacienteDAO;
import modelo.dto.CitaDTO;
import modelo.dto.PacienteDTO;
import modelo.vista.CitaMV;
import modelo.vista.PersonaMV;

public class CitaNucleo {
	
	private CitasDAO dao= new CitasDAO();
	
	public CitaNucleo() {
	}
	
	public boolean pedirCitaPrimaria(CitaMV cita) {
		CitaDTO citaDTO= new CitaDTO();
		citaDTO.setPaciente(cita.getPacienteDTO());
		citaDTO.setMedico(cita.getDoctorDTO());
		citaDTO.setHora(cita.getHora());
		citaDTO.setDeLaSemana(cita.getDiasDeLaSemana());
		Long IDCita = dao.obtenerId();
		citaDTO.setID(IDCita);
		return dao.guardar(citaDTO);
	}
	public boolean pedirCitaEspecialista(CitaMV cita) {
		CitaDTO citaDTO= new CitaDTO();
		citaDTO.setPaciente(cita.getPacienteDTO());
		citaDTO.setMedico(cita.getDoctorDTO());
		citaDTO.setHora(cita.getHora());
		citaDTO.setDeLaSemana(cita.getDiasDeLaSemana());
		Long IDCita = dao.obtenerId();
		citaDTO.setID(IDCita);
		return dao.guardar(citaDTO);
	}
	
	
	
	
	
	
	
	
	

}
