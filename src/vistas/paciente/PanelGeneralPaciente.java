package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelComboBox;
import vista.comunes.PanelDatosPersonales;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelGeneralPaciente extends JPanel {
	
	public PanelComboBox panelComboBox;
	public PanelDatosPersonales panelDatosPersonales;

	public PanelGeneralPaciente() {
		
		setBackground(new Color(240, 230, 140));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelComboBox = new PanelComboBox("Paciente", "ID");
		panelComboBox.setBackground(new Color(240, 230, 140));
		panel.add(panelComboBox);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelDatosPersonales = new PanelDatosPersonales();
		panelDatosPersonales.txtID.setEditable(true);
		panelDatosPersonales.setBackground(new Color(240, 230, 140));
		panel_1.add(panelDatosPersonales);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(43).addComponent(panel_1,
										GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(panel,
										GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(34, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(41)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(169, Short.MAX_VALUE)));
		setLayout(groupLayout);
	}

		public JComboBox getComboBoxId() {
			return panelComboBox.comboBoxID;
		}
	
		public PanelDatosPersonales getPanelDatosPersonales() {
			return panelDatosPersonales;
		}
	
		public JComboBox getComboBoxNombre() {
			return panelComboBox.getComboBoxNombre();
		}
}
