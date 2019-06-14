package vistas.medico;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelDatosPersonalesSegundParte;
import vista.comunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PanelAltaMedico extends JPanel {
	public PanelDatosPersonales panelDatosPersonales;
	public PanelMensaje panelMensaje;
	public PanelDatosPersonalesSegundParte panelDatosPersonalesSegundParte;
	public PanelAltaMedico(String nombre) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblNewLabel = new JLabel(nombre);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panelDatosPersonales = new PanelDatosPersonales();
		panelDatosPersonales.getLblEj().setVisible(false);
		panelDatosPersonales.getLblNacimiento().setVisible(false);
		panelDatosPersonales.getTextNacimiento().setVisible(false);
		panelDatosPersonales.getTxtID().setVisible(false);
		panel.setLayout(new BorderLayout(0, 0));
		panelDatosPersonales.lblID.setVisible(false);
		panelDatosPersonales.setBackground(new Color(240, 230, 140));
		panel.add(panelDatosPersonales);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_Mensaje2 = new JPanel();
		panel_Mensaje2.setLayout(new BorderLayout(0, 0));
		
		panel_Mensaje2.setBackground(new Color(240, 230, 140));
		panelMensaje = new PanelMensaje();
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes\\altadDoctor.png"));
		 panelDatosPersonalesSegundParte = new PanelDatosPersonalesSegundParte();
		panelDatosPersonalesSegundParte.setBackground(new Color(240, 230, 140));
		panelDatosPersonales.setEspecialidad(panelDatosPersonalesSegundParte.getEspecialidad());
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(495)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(566)
									.addComponent(panel_Mensaje2, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(92)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(68)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(113)
							.addComponent(panelDatosPersonalesSegundParte, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(panelDatosPersonalesSegundParte, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(43))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(label)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(100)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addComponent(panel_Mensaje2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(280))
		);
		setLayout(groupLayout);

		
	}
	public PanelDatosPersonales getPanelDatosPersonales() {
		return panelDatosPersonales;
	}
	public void setPanelDatosPersonales(PanelDatosPersonales panelDatosPersonales) {
		this.panelDatosPersonales = panelDatosPersonales;
	}
	
	public PanelMensaje getPanelMensaje() {
		return panelMensaje;
	}

	public void setPanelMensaje(PanelMensaje panelMensaje) {
		this.panelMensaje = panelMensaje;
	}
}
