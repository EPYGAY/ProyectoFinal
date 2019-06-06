package control.logica;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import facade.Facade;
import vista.comunes.PanelDatosPersonales;
import vistas.controlador.ControladorPanelDatosPersonales;

public class ActionComboPaciente implements FocusListener,ItemListener{

	private JComboBox combo;
	private Facade facade;
	private PanelDatosPersonales panel;
	private ControladorPanelDatosPersonales controlador;

	public ActionComboPaciente(JComboBox combo,Facade facade,ControladorPanelDatosPersonales controlador,PanelDatosPersonales panel) {
		this.combo=combo;
		this.facade=facade;
		this.panel=panel;
		this.controlador=controlador;
	}

	
	@Override
	public void focusGained(FocusEvent arg0) {
		combo.removeAllItems();
		ArrayList<String> listaIds=facade.listadoIdPacientes();
		for(String id:listaIds) {
				combo.addItem(id);
		}
		
	}
	
	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent item) {
		controlador.rellenarDatos(panel,
				facade.obtenerPaciente((String)item.getItem()));
	}


	

}
