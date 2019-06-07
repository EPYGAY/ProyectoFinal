package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import facade.Facade;

import vistaUI.UI;
import vistas.controlador.ControladorMensaje;
import vistas.controlador.ControladorPanelDatosPersonales;

public class ParaUI extends UI {

	private Facade facade = new Facade();
	private ControladorPanelDatosPersonales controladorPanelDatosPersonales = new ControladorPanelDatosPersonales();
	private ControladorMensaje controladorMensaje= new ControladorMensaje();
	
	
	public ParaUI() {
		
		altaPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				facade.guardarPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesAltaPaciente()));
				controladorPanelDatosPersonales.vaciarDatos(altaPaciente.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(altaPaciente.getPanelMensaje(), "Paciente registrado correctamente");
				
			}
		});
		
		ActionComboPaciente actionComboPacienteConsulta=new ActionComboPaciente(getComboBoxIdConsultaPaciente(), getComboBoxNombreConsultaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesConsultaPaciente());
		getComboBoxIdConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxIdConsultaPaciente().addActionListener(actionComboPacienteConsulta);
		getComboBoxNombreConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxNombreConsultaPaciente().addActionListener(actionComboPacienteConsulta);
		
		ActionComboPaciente actionComboPacienteBaja=new ActionComboPaciente(getComboBoxIdBajaPaciente(),getComboBoxNombreBajaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesBajaPaciente());
		getComboBoxIdBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxIdBajaPaciente().addActionListener(actionComboPacienteBaja);
		getComboBoxNombreBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxNombreBajaPaciente().addActionListener(actionComboPacienteBaja);
		
		modificacionPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.modificarPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesModificacionPaciente()));
				controladorPanelDatosPersonales.vaciarDatos(modificacionPaciente.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(), "Paciente modificado correctamente");
				
			}
		});
		ActionComboPaciente actionComboPacienteModificacion=new ActionComboPaciente(getComboBoxIdModificacionPaciente(),getComboBoxNombreModificacionPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesModificacionPaciente());
		getComboBoxIdModificacionPaciente().addFocusListener(actionComboPacienteModificacion);
		getComboBoxIdModificacionPaciente().addActionListener(actionComboPacienteModificacion);
		getComboBoxNombreModificacionPaciente().addFocusListener(actionComboPacienteModificacion);
		getComboBoxNombreModificacionPaciente().addActionListener(actionComboPacienteModificacion);
		
		bajaPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.darBajaPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaPaciente()));
				controladorPanelDatosPersonales.vaciarDatos(bajaPaciente.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(bajaPaciente.getPanelMensaje(), "Paciente dado de baja correctamente");
				
			}
		});
		
			
		
		
		//PACIENTES 
		altaMedico.panelMensaje.btnAplicr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.guardarDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPesonalesAltaDoctor()));
				controladorPanelDatosPersonales.vaciarDatos(altaMedico.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(altaMedico.getPanelMensaje(), "Doctor dado de alta correctamente");
			}
		});
		ActionComboDoctor actionComboDoctorConsulta=new ActionComboDoctor(getComboBoxIdConsultaDoctor(),getComboBoxNombreConsultaDoctor(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesConsultaDoctor());
		getComboBoxIdConsultaDoctor().addFocusListener(actionComboDoctorConsulta);
		getComboBoxIdConsultaDoctor().addActionListener(actionComboDoctorConsulta);
		getComboBoxNombreConsultaDoctor().addFocusListener(actionComboDoctorConsulta);
		getComboBoxNombreConsultaDoctor().addActionListener(actionComboDoctorConsulta);
		
		ActionComboDoctor actionComboDoctorBaja=new ActionComboDoctor(getComboBoxIdBajaDoctor(),getComboBoxNombreBajaDoctor(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());
		getComboBoxIdBajaDoctor().addFocusListener(actionComboDoctorBaja);
		getComboBoxIdBajaDoctor().addActionListener(actionComboDoctorBaja);
		getComboBoxNombreBajaDoctor().addFocusListener(actionComboDoctorBaja);
		getComboBoxNombreBajaDoctor().addActionListener(actionComboDoctorBaja);
		
		bajaMedico.panelMensaje.btnAplicr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.darBajaDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaDoctor()));
				controladorPanelDatosPersonales.vaciarDatos(bajaMedico.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(bajaMedico.getPanelMensaje(), "Doctor dado de baja correctamente");
			}
		});
		
	}


	
	
	
	
}
