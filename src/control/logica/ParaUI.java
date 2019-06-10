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
			if(	facade.guardarPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesAltaPaciente()))) {
				controladorMensaje.mostrarMensajes(altaPaciente.getPanelMensaje(), "Registrado correctamente");
				controladorPanelDatosPersonales.vaciarDatos(altaPaciente.getPanelDatosPersonales());
			}else {
				controladorMensaje.mostrarMensajes(altaPaciente.getPanelMensaje(), "Campos erróneos");
			}
			}
		}); 
		
		
		
		ActionComboPaciente actionComboPacienteConsulta=new ActionComboPaciente(getComboBoxIdConsultaPaciente(), getComboBoxNombreConsultaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesConsultaPaciente());
		getComboBoxIdConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxIdConsultaPaciente().addActionListener(actionComboPacienteConsulta);
		getComboBoxNombreConsultaPaciente().addFocusListener(actionComboPacienteConsulta);
		getComboBoxNombreConsultaPaciente().addActionListener(actionComboPacienteConsulta);
		
		/*ActionComboCitas actionComboPacientePedirCitaPrimaria=new ActionComboCitas(getComboBoxIdCitaPrimeariaPaciente(), getComboBoxNombreCitaPrimeariaPaciente(), facade);
		getComboBoxIdConsultaPaciente().addFocusListener(actionComboPacientePedirCitaPrimaria);
		getComboBoxIdConsultaPaciente().addActionListener(actionComboPacientePedirCitaPrimaria);
		getComboBoxNombreConsultaPaciente().addFocusListener(actionComboPacientePedirCitaPrimaria);
		getComboBoxNombreConsultaPaciente().addActionListener(actionComboPacientePedirCitaPrimaria);*/
		
		
		ActionComboPaciente actionComboPacienteBaja=new ActionComboPaciente(getComboBoxIdBajaPaciente(),getComboBoxNombreBajaPaciente(), facade, controladorPanelDatosPersonales, getPanelDatosPersonalesBajaPaciente());
		getComboBoxIdBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxIdBajaPaciente().addActionListener(actionComboPacienteBaja);
		getComboBoxNombreBajaPaciente().addFocusListener(actionComboPacienteBaja);
		getComboBoxNombreBajaPaciente().addActionListener(actionComboPacienteBaja);
		
		modificacionPaciente.panelMensaje.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(facade.modificarPaciente(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPersonalesModificacionPaciente()))) {
					controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(), "Modificado correctamente");
				controladorPanelDatosPersonales.vaciarDatos(modificacionPaciente.getPanelDatosPersonales());
				}else {
					controladorMensaje.mostrarMensajes(modificacionPaciente.getPanelMensaje(), "Campos erróneos");
				}
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
				controladorMensaje.mostrarMensajes(bajaPaciente.getPanelMensaje(), "Baja correctamente");
				
			}
		});
		
		
		
		//PACIENTES 
		altaMedico.panelMensaje.btnAplicr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(facade.guardarDoctor(controladorPanelDatosPersonales.obtenerDatos(getPanelDatosPesonalesAltaDoctor()))) {
					controladorMensaje.mostrarMensajes(altaMedico.getPanelMensaje(), "Alta correctamente");
					controladorPanelDatosPersonales.vaciarDatos(altaMedico.getPanelDatosPersonales());
				}else {
					controladorMensaje.mostrarMensajes(altaMedico.getPanelMensaje(), "Campos erróneos");
				}
				
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
				controladorMensaje.mostrarMensajes(bajaMedico.getPanelMensaje(), "Baja correctamente");
			}
		});
		
	}


	
	
	
	
}
