package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import facade.Facade;
import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelMensaje;
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
		
		bajaPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.darBajaPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesBajaDoctor()));
				controladorPanelDatosPersonales.vaciarDatos(bajaPaciente.getPanelDatosPersonales());
				controladorMensaje.mostrarMensajes(bajaPaciente.getPanelMensaje(), "Paciente dado de baja correctamente");
			}
		});
		ActionComboPaciente actionComboPacienteBaja=new ActionComboPaciente(getComboBoxIdBajaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesBajaDoctor());
		getComboBoxIdBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxIdBajaPaciente().addItemListener(actionComboPacienteBaja);
		
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
	
		//PACIENTES 
		altaMedico.panelMensaje.btnAplicr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facade.guardarDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPesonalesAltaDoctor()));
				controladorPanelDatosPersonales.vaciarDatos(altaMedico.getPanelDatosPersonales());
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
				facade.darBajaDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPesonalesBajaDoctor()));
				controladorPanelDatosPersonales.vaciarDatos(bajaMedico.getPanelDatosPersonales());
			}
		});
		
		
	}

}
