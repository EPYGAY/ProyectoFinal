package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PanelBajaModificacionConsultaPaciente extends JPanel {
	
	public PanelGeneralPaciente panelPaciente;
	public PanelMensaje panelMensaje;
	
	public PanelBajaModificacionConsultaPaciente(String operacion,boolean nombre, boolean apellidos,boolean direccion,boolean telefono,boolean nacimiento, boolean visibleNacimiento, boolean visbilidadPanelMensaje, String imagen) {
		setBackground(new Color(240, 230, 140));
	
		JLabel lblBajaPaciente = new JLabel(operacion);
		lblBajaPaciente.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panel.setBackground(new Color(240, 230, 140));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(imagen));
		panelPaciente = new PanelGeneralPaciente();
		
		panelPaciente.getPanelDatosPersonales().txtNombre.setEditable(false);
		panelPaciente.getPanelDatosPersonales().txtNombre.setEditable(false);
		panelPaciente.getPanelDatosPersonales().txtNombre.setEditable(false);
		panelPaciente.getPanelDatosPersonales().txtNombre.setEditable(false);
		panelPaciente.getPanelDatosPersonales().txtNombre.setEditable(false);
		panelPaciente.getPanelDatosPersonales().txtNombre.setVerifyInputWhenFocusTarget(false);
		panelPaciente.getPanelDatosPersonales().txtNombre.setVerifyInputWhenFocusTarget(false);
		panelPaciente.getPanelDatosPersonales().setBackground(new Color(240, 230, 140));
		panelPaciente.panelComboBox.setBackground(new Color(240, 230, 140));
		panelPaciente.setBackground(new Color(240, 230, 140));
		panelMensaje = new PanelMensaje();
		panelMensaje.setVisible(visbilidadPanelMensaje);
		panelMensaje.setBackground(new Color(240, 230, 140));
		
		//Editable
		panelPaciente.panelDatosPersonales.txtNombre.setEditable(nombre);
		panelPaciente.panelDatosPersonales.txtaApellido.setEditable(apellidos);
		panelPaciente.panelDatosPersonales.txtDireccion.setEditable(direccion);
		panelPaciente.panelDatosPersonales.textTelefono.setEditable(telefono);
		panelPaciente.panelDatosPersonales.textNacimiento.setEditable(nacimiento);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelPaciente, GroupLayout.PREFERRED_SIZE, 736, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel)
							.addGap(109)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 841, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblBajaPaciente))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(lblBajaPaciente)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panelPaciente, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
									.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
							.addGap(179))))
		);
		setLayout(groupLayout);
		
	}
	
	public JComboBox getComboBoxId() {
		return panelPaciente.getComboBoxId();
	}
	

	public JComboBox getComboBoxNombre() {
		return panelPaciente.getComboBoxNombre();
	}


	public PanelDatosPersonales getPanelDatosPersonales() {
		return panelPaciente.getPanelDatosPersonales();
	}
	public PanelMensaje getPanelMensaje() {
		return panelMensaje;
	}

	public void setPanelMensaje(PanelMensaje panelMensaje) {
		this.panelMensaje = panelMensaje;
	}
	
	
}
