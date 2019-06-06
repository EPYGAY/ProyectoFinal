package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
		
		ActionComboPaciente actionComboPacienteConsulta=new ActionComboPaciente(getComboBoxIdConsultaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesConsultaPaciente());
		getComboBoxIdConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxIdConsultaPaciente().addItemListener(actionComboPacienteConsulta);
		
		ActionComboPaciente actionComboPacienteBaja=new ActionComboPaciente(getComboBoxIdBajaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesBajaPaciente());
		getComboBoxIdBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxIdBajaPaciente().addItemListener(actionComboPacienteBaja);
		
		ActionComboPaciente actionComboPacienteVerHistorial=new ActionComboPaciente(getComboBoxIdVerHistorialPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesModificacionPaciente());
		getComboBoxIdVerHistorialPaciente().addFocusListener(actionComboPacienteVerHistorial);
		getComboBoxIdVerHistorialPaciente().addItemListener(actionComboPacienteVerHistorial);	
		
		modificacionPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.modificarPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesModificacionPaciente()));
				controladorPanelDatosPersonales.vaciarDatos(modificacionPaciente.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(), "Paciente modificado correctamente");
				
			}
		});
		ActionComboPaciente actionComboPacienteModificacion=new ActionComboPaciente(getComboBoxIdModificacionPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesModificacionPaciente());
		getComboBoxIdModificacionPaciente().addFocusListener(actionComboPacienteModificacion);
		getComboBoxIdModificacionPaciente().addItemListener(actionComboPacienteModificacion);
		
		
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
		ActionComboDoctor actionComboDoctorConsulta=new ActionComboDoctor(getComboBoxIdConsultaDoctor(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesConsultaDoctor());
		getComboBoxIdConsultaDoctor().addFocusListener(actionComboDoctorConsulta);
		getComboBoxIdConsultaDoctor().addItemListener(actionComboDoctorConsulta);
		
		ActionComboDoctor actionComboDoctorBaja=new ActionComboDoctor(getComboBoxIdBajaDoctor(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());
		getComboBoxIdBajaDoctor().addFocusListener(actionComboDoctorBaja);
		getComboBoxIdBajaDoctor().addItemListener(actionComboDoctorBaja);
		
		bajaMedico.panelMensaje.btnAplicr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.darBajaDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaDoctor()));
				controladorPanelDatosPersonales.vaciarDatos(bajaMedico.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(bajaMedico.getPanelMensaje(), "Doctor dado de baja correctamente");
			}
		});
		
	}


	
	
	
	
}
