package vistas.controlador;

import vista.comunes.PanelMensaje;

public class ControladorMensaje {
	
	public void mostrarMensajes(PanelMensaje panel,String mensaje) {
		panel.txtMensajeComun.setText(mensaje);
	
	}

}
