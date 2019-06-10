package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelComboBox;
import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelHorario;
import vista.comunes.PanelMensaje;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelPedirCitaPaciente extends JPanel {
PanelComboBox combo= null;
private JPanel panel_2;
protected JPanel panel;
private PanelComboBox panelComboBox;

	

	public PanelPedirCitaPaciente(boolean horarioMañana, boolean mañanastxt) {
		setBackground(new Color(240, 230, 140));
		
		panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelComboBox = new PanelComboBox("Paciente", "ID");
		panelComboBox.setBackground(new Color(240, 230, 140));
		panel.add(panelComboBox);
		
		JComboBox comboBox = new JComboBox();
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		PanelMensaje panelMensaje = new PanelMensaje();
		panelMensaje.setBackground(new Color(240, 230, 140));
		panel_2.add(panelMensaje);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new BorderLayout(0, 0));
		PanelHorario panelHorario = new PanelHorario("8:00-9:00","9:00-10:00","10:00-11:00","11:00-12:00");
		panelHorario.setVisible(horarioMañana);
		
		JLabel lblMaanas = new JLabel("MA\u00D1ANAS");
		lblMaanas.setVisible(mañanastxt);
		lblMaanas.setForeground(new Color(153, 0, 0));
		lblMaanas.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblTardes = new JLabel("TARDES");
		lblTardes.setForeground(new Color(153, 0, 0));
		lblTardes.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		PanelHorario panelHorario_1 = new PanelHorario("12:00-13:00","13:00-14:00","14:00-15:00","15:00-16:00");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 752, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(panelHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(131)
									.addComponent(lblMaanas, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panelHorario_1, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblTardes, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
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
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaanas)
						.addComponent(lblTardes, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelHorario, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelHorario_1, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(94))
		);
		setLayout(groupLayout);
	
	}

	public JComboBox getPanelComboBoxid() {
		return panelComboBox.getComboBoxID();
	}
	public JComboBox getPanelComboBoxNombre() {
		return panelComboBox.getComboBoxNombre();
	}
	public void setPanelComboBox(PanelComboBox panelComboBox) {
		this.panelComboBox = panelComboBox;
	}
	
	
}
