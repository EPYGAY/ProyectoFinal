package control.logica;

import control.nucleo.PacienteNucleo;
import modelo.dao.MedicoActivoDAO;
import modelo.dao.MedicoInactivoDAO;
import modelo.dao.PacienteDAO;
import modelo.dto.Medico;
import modelo.dto.MedicoActivo;
import modelo.dto.PacienteDTO;

public class controlHospital {

	private PacienteDAO pacienteGuar;
	private PacienteDTO paciente;
	private MedicoActivo medicoAct;
	private MedicoActivoDAO medicoActGuar;
	private MedicoInactivoDAO medicoInGuar;
	private Medico medicoIn;

	public void consultarHistorial() {
	}

	public void darseAlta() {
		pacienteGuar.guardar(paciente);
		medicoActGuar.guardar(medicoAct);
		medicoInGuar.guardar(medicoIn);
	}

	public void darseBaja() {
	}

	public void grabarCita() {
	}

	public void grabarIntervencion() {
	}

	public void grabarHistorial() {
	}

}
