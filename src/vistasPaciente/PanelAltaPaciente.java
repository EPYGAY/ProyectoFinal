package vistasPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vistasComunes.PanelDatosPersonales;
import vistasComunes.PanelMensaje;

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

public class PanelAltaPaciente extends JPanel {

PanelDatosPersonales panel= null;
public PanelMensaje panelMensajeAltaPaciente;
	public PanelAltaPaciente() {
		setBackground(new Color(204, 204, 51));
		
		JLabel lblAltaPaciente = new JLabel("ALTA PACIENTE");
		lblAltaPaciente.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(new PanelDatosPersonales(true, true, true, true,true));
		panelMensajeAltaPaciente = new PanelMensaje();
	
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(lblAltaPaciente))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(90)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(78)
							.addComponent(panelMensajeAltaPaciente, GroupLayout.PREFERRED_SIZE, 622, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(311, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblAltaPaciente)
					.addGap(36)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
					.addComponent(panelMensajeAltaPaciente, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(128))
		);
		setLayout(groupLayout);
		
		
	}
}
