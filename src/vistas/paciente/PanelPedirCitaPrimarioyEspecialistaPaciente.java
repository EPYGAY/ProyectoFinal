package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelComboBox;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;


import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import modelo.dao.CitasDAO;
import modelo.dto.CitaDTO;
import modelo.dto.DoctorDTO;
import modelo.dto.PacienteDTO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPedirCitaPrimarioyEspecialistaPaciente extends JPanel {
PanelComboBox combo= null;
private CitasDAO citasDAO= new CitasDAO();
private PanelPedirCitaPaciente panelPedirCitaPaciente;

	public PanelPedirCitaPrimarioyEspecialistaPaciente(String nombreCita, String medico, boolean horarioMañana, boolean mañanastxt ) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblCitaAtencionPrimaria = new JLabel(nombreCita);
		lblCitaAtencionPrimaria.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel(medico);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelPedirCitaPaciente = new PanelPedirCitaPaciente(horarioMañana, mañanastxt);
			
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addComponent(lblCitaAtencionPrimaria)
					.addPreferredGap(ComponentPlacement.RELATED, 846, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
					.addGap(81))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 1184, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCitaAtencionPrimaria)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 646, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
		
		
	
	}

	public JComboBox getPanelPedirCitaPacienteid() {
		return panelPedirCitaPaciente.getPanelComboBoxid();
	}
	public JComboBox getPanelPedirCitaPacienteNombre() {
		return panelPedirCitaPaciente.getPanelComboBoxNombre();
	}

	public void setPanelPedirCitaPaciente(PanelPedirCitaPaciente panelPedirCitaPaciente) {
		this.panelPedirCitaPaciente = panelPedirCitaPaciente;
	}

	

	

	
}
