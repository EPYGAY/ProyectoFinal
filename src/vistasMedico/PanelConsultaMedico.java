package vistasMedico;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vistasComunes.PanelComboBox;
import vistasComunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelConsultaMedico extends JPanel {

	public PanelConsultaMedico() {
		setBackground(new Color(204, 204, 51));
		
		JLabel lblConsultaMedico = new JLabel("CONSULTA MEDICO");
		lblConsultaMedico.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(new PanelComboBox("Medido", "ID"));
		PanelAltaBajaMedico panelAltaBajaMedico = new PanelAltaBajaMedico("");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelAltaBajaMedico, GroupLayout.PREFERRED_SIZE, 810, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
							.addComponent(lblConsultaMedico, Alignment.LEADING)))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblConsultaMedico)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelAltaBajaMedico, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		
	}
}
