package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelAltaPaciente extends JPanel {

	public PanelDatosPersonales panelDatosPersonales;
	public PanelMensaje panelMensaje;
	
	public PanelAltaPaciente(String operacion, boolean nombre,  boolean apellidos, boolean direccion, boolean telefono, boolean nacimiento, String imagen) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblAltaPaciente = new JLabel(operacion);
		lblAltaPaciente.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelDatosPersonales=new PanelDatosPersonales();
	
		panelDatosPersonales.setBackground(new Color(240, 230, 140));
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(panelDatosPersonales);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(imagen));
		
		//EDITABLES
		panelDatosPersonales.txtNombre.setEditable(nombre);
		panelDatosPersonales.txtaApellido.setEditable(apellidos);
		panelDatosPersonales.txtDireccion.setEditable(direccion);
		panelDatosPersonales.textTelefono.setEditable(telefono);
		panelDatosPersonales.textNacimiento.setEditable(nacimiento);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(lblAltaPaciente))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(90)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 622, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
									.addGap(116)
									.addComponent(lblNewLabel_1)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addPreferredGap(ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(lblAltaPaciente)
							.addGap(36)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		panelMensaje = new PanelMensaje();
		panelMensaje.setBackground(new Color(240, 230, 140));
		
		panel_2.add(panelMensaje, BorderLayout.CENTER);
		setLayout(groupLayout);
	}
	
	public PanelMensaje getPanelMensaje() {
		return panelMensaje;
	}

	public void setPanelMensaje(PanelMensaje panelMensaje) {
		this.panelMensaje = panelMensaje;
	}

	public PanelDatosPersonales getPanelDatosPersonales() {
		return panelDatosPersonales;
	}

	public void setPanelDatosPersonales(PanelDatosPersonales panelDatosPersonales) {
		this.panelDatosPersonales = panelDatosPersonales;
	}
	

	
	
	
}
