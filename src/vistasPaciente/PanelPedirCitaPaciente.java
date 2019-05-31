package vistasPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import vistasComunes.PanelComboBox;
import vistasComunes.PanelHorario;
import vistasComunes.PanelMensaje;

import javax.swing.JComboBox;


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelPedirCitaPaciente extends JPanel {
PanelComboBox combo= null;

	public PanelPedirCitaPaciente() {
		setBackground(new Color(204, 204, 51));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 51));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(new PanelComboBox("Paciente", "ID"));
		
		JComboBox comboBox = new JComboBox();
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 51));
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_2.add(new PanelMensaje());
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 51));
		panel_1.setLayout(new BorderLayout(0, 0));
		PanelHorario panelHorario = new PanelHorario("8:00-9:00","9:00-10:00","10:00-11:00","11:00-12:00");
		
		JLabel lblMaanas = new JLabel("MA\u00D1ANAS");
		lblMaanas.setForeground(new Color(153, 0, 0));
		lblMaanas.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblTardes = new JLabel("TARDES");
		lblTardes.setForeground(new Color(153, 0, 0));
		lblTardes.setFont(new Font("Tahoma", Font.BOLD, 22));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 752, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(282, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panelHorario, GroupLayout.PREFERRED_SIZE, 479, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(94)
							.addComponent(lblMaanas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(135)
							.addComponent(lblTardes, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
					.addGap(343))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(719, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTardes, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMaanas))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelHorario, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(94))
		);
		
		PanelHorario panelHorario_1 = new PanelHorario("12:00-13:00","13:00-14:00","14:00-15:00","15:00-16:00");
		panel_1.add(panelHorario_1, BorderLayout.CENTER);
		setLayout(groupLayout);
	
	}
}
