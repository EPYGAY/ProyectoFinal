package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import facade.Facade;
import listener.ComboBox.ActionComboCitaConsulta;
import listener.ComboBox.ActionComboCitaVerHistorial;
import listener.ComboBox.ActionComboDoctor;
import listener.ComboBox.ActionComboDoctorCirujano;
import listener.ComboBox.ActionComboDoctorEspecialista;
import listener.ComboBox.ActionComboDoctorPrimario;
import listener.ComboBox.ActionComboPaciente;
import vistaUI.UI;
import vistas.controlador.ControladorMensaje;
import vistas.controlador.ControladorPanelDatosPersonales;
import vistas.controlador.ControladorPanelPedirCitaPacienteVerHistorialCitas;
import vistas.controlador.ControladorPanelPedirCitaPacienteonsultasCitas;

public class ParaUI extends UI {

	protected static final ParaUI panelPedirCitaPaciente = null;
	private Facade facade = new Facade();
	private ControladorPanelDatosPersonales controladorPanelDatosPersonales = new ControladorPanelDatosPersonales();
	private ControladorPanelPedirCitaPacienteonsultasCitas ControladorPanelPedirCitaPacienteonsultasCitas = new ControladorPanelPedirCitaPacienteonsultasCitas();
	private ControladorPanelPedirCitaPacienteVerHistorialCitas controladorPanelPedirCitaPacienteVerHistorialCitas = new ControladorPanelPedirCitaPacienteVerHistorialCitas();
	private ControladorMensaje controladorMensaje = new ControladorMensaje();

	public ParaUI() {
		rellenarComboBox();
		setActionListener();
	}

	ActionListener altaPacienteListener = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if (facade.guardarPaciente(
					controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesAltaPaciente()))) {
				controladorMensaje.mostrarMensajes(altaPaciente.getPanelMensaje(), "Registrado correctamente");
				controladorPanelDatosPersonales.vaciarDatos(altaPaciente.getPanelDatosPersonales());
			} else {
				controladorMensaje.mostrarMensajes(altaPaciente.getPanelMensaje(), "Campos erróneos");
			}
		}
	};

	ActionListener citaPrimariaListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (facade.guardarCita(ControladorPanelPedirCitaPacienteonsultasCitas
					.obtenerDatos(citaPrimario.getPanelPedirCitaPaciente()))) {
				controladorMensaje.mostrarMensajes(citaPrimario.getPanelMensaje(),
						"Cita Primaria Registrada correctamente");

			} else {
				controladorMensaje.mostrarMensajes(citaPrimario.getPanelMensaje(),
						"Cita Primaria NO registrada");

			}

		}
	};

	ActionListener modificacionPacienteListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (facade.modificarPaciente(
					controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesModificacionPaciente()))) {
				controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(), "Modificado correctamente");
				controladorPanelDatosPersonales.vaciarDatos(modificacionPaciente.getPanelDatosPersonales());
			} else {
				controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(), "Campos erróneos");
			}
		}
	};

	ActionListener bajaPacienteListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facade.darBajaPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaPaciente()));
			controladorPanelDatosPersonales.vaciarDatos(bajaPaciente.getPanelDatosPersonales());
			controladorMensaje.mostrarMensajes(bajaPaciente.getPanelMensaje(), "Baja correctamente");

		}
	};

	ActionListener altaMedicoListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (facade
					.guardarDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPesonalesAltaDoctor()))) {
				controladorMensaje.mostrarMensajes(altaMedico.getPanelMensaje(), "Alta correctamente");
				controladorPanelDatosPersonales.vaciarDatos(altaMedico.getPanelDatosPersonales());
			} else {
				controladorMensaje.mostrarMensajes(altaMedico.getPanelMensaje(), "Campos erróneos");
			}

		}
	};

	ActionListener bajaMedicoListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facade.darBajaDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaDoctor()));
			controladorPanelDatosPersonales.vaciarDatos(bajaMedico.getPanelDatosPersonales());
			controladorMensaje.mostrarMensajes(bajaMedico.getPanelMensaje(), "Baja correctamente");
		}
	};

	ActionListener citaEspecialistaListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (facade.guardarCita(ControladorPanelPedirCitaPacienteonsultasCitas
					.obtenerDatos(citaEspecialista.getPanelPedirCitaPaciente()))) {
				controladorMensaje.mostrarMensajes(citaEspecialista.getPanelMensaje(),
						"Cita Especialista Registrada correctamente");
			} else {
				controladorMensaje.mostrarMensajes(citaEspecialista.getPanelMensaje(), "Cita Especialista NO registrada");
			}
		}
	};

	ActionListener pasarHoraListener = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	};
	ActionListener operacionPacienteListener = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			//if (facade.guardarCita(ControladorPanelPedirCitaPacienteonsultasCitas
			//		.obtenerDatos(citaOperacion.getPanelComboBox()))) {
				controladorMensaje.mostrarMensajes(citaOperacion.getPanelMensaje(),
					"Cita Operacion Registrada correctamente");
			//} else {
				controladorMensaje.mostrarMensajes(citaOperacion.getPanelMensaje(), "Cita Operacion NO registrada");
			//}
		}
	};


	private void setActionListener() {
		// PACIENTES
		altaPaciente.panelMensaje.getBtnAplicr().addActionListener(altaPacienteListener);
		modificacionPaciente.panelMensaje.getBtnAplicr().addActionListener(modificacionPacienteListener);
		bajaPaciente.panelMensaje.getBtnAplicr().addActionListener(bajaPacienteListener);
		
		// MEDICOS
		altaMedico.panelMensaje.btnAplicr.addActionListener(altaMedicoListener);
		bajaMedico.panelMensaje.btnAplicr.addActionListener(bajaMedicoListener);
		
		// CITAS
		citaPrimario.getPanelMensaje().getBtnAplicr().addActionListener(citaPrimariaListener);
		citaEspecialista.getPanelMensaje().getBtnAplicr().addActionListener(citaEspecialistaListener);
		citaOperacion.getPanelMensaje().getBtnAplicr().addActionListener(operacionPacienteListener);
			
			
		// PASAR HORA
		btnPasar.addActionListener(pasarHoraListener);
		
		

	}

	private void rellenarComboBox() {
		ActionComboPaciente actionComboPacienteConsulta = new ActionComboPaciente(getComboBoxIdConsultaPaciente(),
				getComboBoxNombreConsultaPaciente(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesConsultaPaciente());
		getComboBoxIdConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxIdConsultaPaciente().addActionListener(actionComboPacienteConsulta);
		getComboBoxNombreConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxNombreConsultaPaciente().addActionListener(actionComboPacienteConsulta);

		ActionComboPaciente actionComboPacienteBaja = new ActionComboPaciente(getComboBoxIdBajaPaciente(),
				getComboBoxNombreBajaPaciente(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesBajaPaciente());
		getComboBoxIdBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxIdBajaPaciente().addActionListener(actionComboPacienteBaja);
		getComboBoxNombreBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxNombreBajaPaciente().addActionListener(actionComboPacienteBaja);

		ActionComboPaciente actionComboPacienteModificacion = new ActionComboPaciente(
				getComboBoxIdModificacionPaciente(), getComboBoxNombreModificacionPaciente(), facade,
				controladorPanelDatosPersonales, getPanelDatosPersonalesModificacionPaciente());
		getComboBoxIdModificacionPaciente().addFocusListener(actionComboPacienteModificacion);
		getComboBoxIdModificacionPaciente().addActionListener(actionComboPacienteModificacion);
		getComboBoxNombreModificacionPaciente().addFocusListener(actionComboPacienteModificacion);
		getComboBoxNombreModificacionPaciente().addActionListener(actionComboPacienteModificacion);

		ActionComboDoctor actionComboDoctorConsulta = new ActionComboDoctor(getComboBoxIdConsultaDoctor(),
				getComboBoxNombreConsultaDoctor(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesConsultaDoctor());
		getComboBoxIdConsultaDoctor().addFocusListener(actionComboDoctorConsulta);
		getComboBoxIdConsultaDoctor().addActionListener(actionComboDoctorConsulta);
		getComboBoxNombreConsultaDoctor().addFocusListener(actionComboDoctorConsulta);
		getComboBoxNombreConsultaDoctor().addActionListener(actionComboDoctorConsulta);

		ActionComboDoctor actionComboDoctorBaja = new ActionComboDoctor(getComboBoxIdBajaDoctor(),
				getComboBoxNombreBajaDoctor(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesBajaDoctor());
		getComboBoxIdBajaDoctor().addFocusListener(actionComboDoctorBaja);
		getComboBoxIdBajaDoctor().addActionListener(actionComboDoctorBaja);
		getComboBoxNombreBajaDoctor().addFocusListener(actionComboDoctorBaja);
		getComboBoxNombreBajaDoctor().addActionListener(actionComboDoctorBaja);

		ActionComboPaciente actionComboCitaPrimariaPaciente = new ActionComboPaciente(getComboBoxIdCitaPrimaria(),
				getComboBoxNombreCitaPrimaria(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCitaPrimaria().addFocusListener(actionComboCitaPrimariaPaciente);
		getComboBoxIdCitaPrimaria().addActionListener(actionComboCitaPrimariaPaciente);

		getComboBoxNombreCitaPrimaria().addFocusListener(actionComboCitaPrimariaPaciente);
		getComboBoxNombreCitaPrimaria().addActionListener(actionComboCitaPrimariaPaciente);

		ActionComboDoctorPrimario actionComboCitaPrimariaDoctorPrimario = new ActionComboDoctorPrimario(getComboBoxIdCiaPrimariaDoctor(),
				getComboBoxNombreCiaPrimariaDoctor(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCiaPrimariaDoctor().addFocusListener(actionComboCitaPrimariaDoctorPrimario);
		getComboBoxIdCiaPrimariaDoctor().addActionListener(actionComboCitaPrimariaDoctorPrimario);

		getComboBoxNombreCiaPrimariaDoctor().addFocusListener(actionComboCitaPrimariaDoctorPrimario);
		getComboBoxNombreCiaPrimariaDoctor().addActionListener(actionComboCitaPrimariaDoctorPrimario);

		ActionComboPaciente actionComboCitaEspecialistaPaciente = new ActionComboPaciente(
				getComboBoxIdCitaEspecialista(), getComboBoxNombreCitaEspecialista(), facade,
				controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCitaEspecialista().addFocusListener(actionComboCitaEspecialistaPaciente);
		getComboBoxIdCitaEspecialista().addActionListener(actionComboCitaEspecialistaPaciente);

		getComboBoxNombreCitaEspecialista().addFocusListener(actionComboCitaEspecialistaPaciente);
		getComboBoxNombreCitaEspecialista().addActionListener(actionComboCitaEspecialistaPaciente);

		ActionComboDoctorEspecialista actionComboCitaEspecialistaDoctorEspecilaista = new ActionComboDoctorEspecialista(
				getComboBoxIdCiaEspecialistaDoctor(), getComboBoxNombreCiaEspecialistaDoctor(), facade,
				controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCiaEspecialistaDoctor().addFocusListener(actionComboCitaEspecialistaDoctorEspecilaista);
		getComboBoxIdCiaEspecialistaDoctor().addActionListener(actionComboCitaEspecialistaDoctorEspecilaista);

		getComboBoxNombreCiaEspecialistaDoctor().addFocusListener(actionComboCitaEspecialistaDoctorEspecilaista);
		getComboBoxNombreCiaEspecialistaDoctor().addActionListener(actionComboCitaEspecialistaDoctorEspecilaista);
		
		ActionComboPaciente actionComboCitaEspecialistaDoctorCirujanoPaciente = new ActionComboPaciente(
				getComboBoxNombreCirujanoPaciente(), getComboBoxIdCirujanoPaciente(), facade,
				controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());

		getComboBoxNombreCirujanoPaciente().addFocusListener(actionComboCitaEspecialistaDoctorCirujanoPaciente);
		getComboBoxNombreCirujanoPaciente().addActionListener(actionComboCitaEspecialistaDoctorCirujanoPaciente);

		getComboBoxIdCirujanoPaciente().addFocusListener(actionComboCitaEspecialistaDoctorCirujanoPaciente);
		getComboBoxIdCirujanoPaciente().addActionListener(actionComboCitaEspecialistaDoctorCirujanoPaciente);
		
		
		ActionComboDoctorCirujano actionComboCitaEspecialistaDoctorCirujano = new ActionComboDoctorCirujano(
				getComboBoxIdCirujano(), getComboBoxNombreCirujano(), facade,
				controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCirujano().addFocusListener(actionComboCitaEspecialistaDoctorCirujano);
		getComboBoxIdCirujano().addActionListener(actionComboCitaEspecialistaDoctorCirujano);

		getComboBoxNombreCirujano().addFocusListener(actionComboCitaEspecialistaDoctorCirujano);
		getComboBoxNombreCirujano().addActionListener(actionComboCitaEspecialistaDoctorCirujano);
		
		
		ActionComboCitaConsulta actionComboConsultarCitasPaciente = new ActionComboCitaConsulta(
				getComboBoxIDConsultarCitas(), getComboBoxNombreConsultarCitas(), facade,
				ControladorPanelPedirCitaPacienteonsultasCitas, getPanelConsultarCitas());

		getComboBoxIDConsultarCitas().addFocusListener(actionComboConsultarCitasPaciente);
		getComboBoxIDConsultarCitas().addActionListener(actionComboConsultarCitasPaciente);

		getComboBoxNombreConsultarCitas().addFocusListener(actionComboConsultarCitasPaciente);
		getComboBoxNombreConsultarCitas().addActionListener(actionComboConsultarCitasPaciente);

		ActionComboCitaVerHistorial actionComboVerHistorialPaciente = new ActionComboCitaVerHistorial(
				getComboBoxIDHistorial(), getComboBoxNombreHistorial(), facade,
				controladorPanelPedirCitaPacienteVerHistorialCitas, getPanelVerHistorial());
		getComboBoxIDHistorial().addFocusListener(actionComboVerHistorialPaciente);
		getComboBoxIDHistorial().addActionListener(actionComboVerHistorialPaciente);

		getComboBoxNombreHistorial().addFocusListener(actionComboVerHistorialPaciente);
		getComboBoxNombreHistorial().addActionListener(actionComboVerHistorialPaciente);

	}

}
