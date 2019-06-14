package control.nucleo;

import java.util.ArrayList;

import modelo.dao.CitasDAO;
import modelo.dto.CitaDTO;
import modelo.dto.DoctorDTO;
import modelo.dto.PacienteDTO;
import modelo.vista.CitaMV;
import modelo.vista.PersonaMV;

public class CitaNucleo {

	private CitasDAO dao = new CitasDAO();
	private DoctorNucleo doctorNucleo = new DoctorNucleo();
	private PacienteNucleo pacienteNucleo = new PacienteNucleo();

	public CitaNucleo() {
	}

	public boolean altaCita(CitaMV cita) {
		PersonaMV medicoMV = doctorNucleo.obtenerDoctor(cita.getIdMedico());
		DoctorDTO medicoDTO = new DoctorDTO();
		medicoDTO.setID(medicoMV.getID());
		medicoDTO.setApellidos(medicoMV.getApellidos());
		medicoDTO.setDireccion(medicoMV.getDireccion());
		medicoDTO.setTelefono(medicoMV.getTelefono());
		medicoDTO.setNombre(medicoMV.getNombre());
		medicoDTO.setEspecialidad(medicoMV.getEspecialidad());

		PacienteDTO pacienteDTO = new PacienteDTO();
		PersonaMV pacienteMV = pacienteNucleo.obtenerPaciente(cita.getIdPaciente());
		pacienteDTO.setApellidos(pacienteMV.getApellidos());
		pacienteDTO.setDireccion(pacienteMV.getDireccion());
		pacienteDTO.setFechaNacimiento(pacienteMV.getFechaNacimiento());
		pacienteDTO.setNombre(pacienteMV.getNombre());
		pacienteDTO.setTelefono(pacienteMV.getTelefono());
		pacienteDTO.setID(pacienteMV.getID());

		CitaDTO citaDTO = new CitaDTO();
		citaDTO.setID(dao.obtenerId());
		citaDTO.setFecha(cita.getFecha());
		citaDTO.setMedico(medicoDTO);
		citaDTO.setPaciente(pacienteDTO);
		citaDTO.setTipo(medicoMV.getEspecialidad());

		return dao.guardar(citaDTO);
	}

	public ArrayList<CitaMV> obtenerCita(String idPcaciente) {
		ArrayList<CitaMV> lista= new ArrayList<>();
		ArrayList<CitaDTO >citas=dao.obtenerConsultasByIdPAciente(new Long(idPcaciente));
		for (CitaDTO cita : citas) {
			CitaMV citaMV= new CitaMV();
			citaMV.setNombreMedico(cita.getMedico().getNombre());
			citaMV.setNombrePaciente(cita.getPaciente().getNombre());
			citaMV.setApellidoPaciente(cita.getPaciente().getApellidos());
			citaMV.setFecha(cita.getFecha());
			citaMV.setEspecialidad(cita.getTipo());
			lista.add(citaMV);
		}
		
		
		return lista;
	}


}
