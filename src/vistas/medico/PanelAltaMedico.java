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

public class PanelAltaMedico extends JPanel {
	private PanelDatosPersonales panelDatosPersonales;
	public PanelAltaMedico(String nombre) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblNewLabel = new JLabel(nombre);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelDatosPersonales = new PanelDatosPersonales();
		panelDatosPersonales.setBackground(new Color(240, 230, 140));
		panel.add(panelDatosPersonales);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new BorderLayout(0, 0));
		PanelDatosPersonalesSegundParte panelDatosPersonalesSegundParte = new PanelDatosPersonalesSegundParte();
		panelDatosPersonalesSegundParte.setBackground(new Color(240, 230, 140));
		panel_1.add(panelDatosPersonalesSegundParte, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new BorderLayout(0, 0));
		PanelMensaje panelMensaje = new PanelMensaje();
		
		panelMensaje.setBackground(new Color(240, 230, 140));
		panel_2.add(panelMensaje);
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
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 514, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
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
	
	
}
