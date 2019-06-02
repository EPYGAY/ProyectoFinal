package control.logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import facade.Facade;
import vistaUI.UI;
import vistasPaciente.PanelAltaPaciente;

public class ParaUI extends UI {
	
	private Facade facade= new Facade();
	public ParaUI() {
		
		alta.panelMensajeAltaPaciente.getBtnAplicr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("Hola");
			}
		});
		
	}

}
