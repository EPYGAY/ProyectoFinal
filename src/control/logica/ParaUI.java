package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import facade.Facade;
import listener.ComboBox.ActionComboCita;
import listener.ComboBox.ActionComboDoctor;
import listener.ComboBox.ActionComboPaciente;
import vistaUI.UI;
import vistas.controlador.ControladorMensaje;
import vistas.controlador.ControladorPanelDatosPersonales;
import vistas.controlador.ControladorPanelPedirCitaPaciente;

public class ParaUI extends UI {

	protected static final ParaUI panelPedirCitaPaciente = null;
	private Facade facade = new Facade();
	private ControladorPanelDatosPersonales controladorPanelDatosPersonales = new ControladorPanelDatosPersonales();
	private ControladorPanelPedirCitaPaciente controladorPanelPedirCitaPaciente= new ControladorPanelPedirCitaPaciente();
	private ControladorMensaje controladorMensaje = new ControladorMensaje();

	public ParaUI() {
		rellenarComboBox();
		setActionListener();
	}
	
	ActionListener altaPacienteListener=new ActionListener() {
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
	
	ActionListener citaPrimariaListener=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facade.guardarCita(controladorPanelPedirCitaPaciente.obtenerDatos(citaPrimario.getPanelPedirCitaPaciente()));

		}
	};
	
	ActionListener modificacionPacienteListener=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (facade.modificarPaciente(
					controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesModificacionPaciente()))) {
				controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(),
						"Modificado correctamente");
				controladorPanelDatosPersonales.vaciarDatos(modificacionPaciente.getPanelDatosPersonales());
			} else {
				controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(), "Campos erróneos");
			}
		}
	};

	ActionListener bajaPacienteListener=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facade.darBajaPaciente(
					controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaPaciente()));
			controladorPanelDatosPersonales.vaciarDatos(bajaPaciente.getPanelDatosPersonales());
			controladorMensaje.mostrarMensajes(bajaPaciente.getPanelMensaje(), "Baja correctamente");

		}
	};
	
	ActionListener altaMedicoListener=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (facade.guardarDoctor(
					controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPesonalesAltaDoctor()))) {
				controladorMensaje.mostrarMensajes(altaMedico.getPanelMensaje(), "Alta correctamente");
				controladorPanelDatosPersonales.vaciarDatos(altaMedico.getPanelDatosPersonales());
			} else {
				controladorMensaje.mostrarMensajes(altaMedico.getPanelMensaje(), "Campos erróneos");
			}

		}
	};
	
	ActionListener bajaMedicoListener=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facade.darBajaDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaDoctor()));
			controladorPanelDatosPersonales.vaciarDatos(bajaMedico.getPanelDatosPersonales());
			controladorMensaje.mostrarMensajes(bajaMedico.getPanelMensaje(), "Baja correctamente");
		}
	};
	
	ActionListener citaEspecialistaListener=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			facade.guardarCita(controladorPanelPedirCitaPaciente.obtenerDatos(citaEspecialista.getPanelPedirCitaPaciente()));

		}
	};
	
	ActionListener pasarHoraListener=new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
     		
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
				citaPrimario.getPanelMensajePedirCitaPaciente().getBtnAplicr().addActionListener(citaPrimariaListener);
				citaEspecialista.getPanelMensajePedirCitaPaciente().getBtnAplicr().addActionListener(citaEspecialistaListener);
				//PASAR HORA
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

		ActionComboDoctor actionComboCitaPrimariaDoctor = new ActionComboDoctor(getComboBoxIdCiaPrimariaDoctor(),
				getComboBoxNombreCiaPrimariaDoctor(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCiaPrimariaDoctor().addFocusListener(actionComboCitaPrimariaDoctor);
		getComboBoxIdCiaPrimariaDoctor().addActionListener(actionComboCitaPrimariaDoctor);

		getComboBoxNombreCiaPrimariaDoctor().addFocusListener(actionComboCitaPrimariaDoctor);
		getComboBoxNombreCiaPrimariaDoctor().addActionListener(actionComboCitaPrimariaDoctor);
		
		ActionComboPaciente actionComboCitaEspecialistaPaciente = new ActionComboPaciente(
				getComboBoxIdCitaEspecialista(), getComboBoxNombreCitaEspecialista(), facade,
				controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCitaEspecialista().addFocusListener(actionComboCitaEspecialistaPaciente);
		getComboBoxIdCitaEspecialista().addActionListener(actionComboCitaEspecialistaPaciente);

		getComboBoxNombreCitaEspecialista().addFocusListener(actionComboCitaEspecialistaPaciente);
		getComboBoxNombreCitaEspecialista().addActionListener(actionComboCitaEspecialistaPaciente);

		ActionComboDoctor actionComboCitaEspecialistaDoctor = new ActionComboDoctor(getComboBoxIdCiaEspecialistaDoctor(),
				getComboBoxNombreCiaEspecialistaDoctor(), facade, controladorPanelDatosPersonales,
				getPanelDatosPersonalesBajaDoctor());

		getComboBoxIdCiaEspecialistaDoctor().addFocusListener(actionComboCitaEspecialistaDoctor);
		getComboBoxIdCiaEspecialistaDoctor().addActionListener(actionComboCitaEspecialistaDoctor);

		getComboBoxNombreCiaEspecialistaDoctor().addFocusListener(actionComboCitaEspecialistaDoctor);
		getComboBoxNombreCiaEspecialistaDoctor().addActionListener(actionComboCitaEspecialistaDoctor);
		
		ActionComboCita actionComboConsultarCitasPaciente = new ActionComboCita(getComboBoxIDConsultarCitas(), getComboBoxNombreConsultarCitas(), facade, controladorPanelPedirCitaPaciente, getPanelConsultarCitas());

		getComboBoxIDConsultarCitas().addFocusListener(actionComboConsultarCitasPaciente);
		getComboBoxIDConsultarCitas().addActionListener(actionComboConsultarCitasPaciente);

		getComboBoxNombreConsultarCitas().addFocusListener(actionComboConsultarCitasPaciente);
		getComboBoxNombreConsultarCitas().addActionListener(actionComboConsultarCitasPaciente);
		
	}
	
	
	
	


}
