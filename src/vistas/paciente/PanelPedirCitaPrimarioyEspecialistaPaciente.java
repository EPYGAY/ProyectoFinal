package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelComboBox;
import vista.comunes.PanelMensaje;

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
public PanelPedirCitaPaciente panelPedirCitaPaciente;

	public PanelPedirCitaPrimarioyEspecialistaPaciente(String nombreCita, String medico, boolean horarioMañana, boolean mañanastxt ) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblCitaAtencionPrimaria = new JLabel(nombreCita);
		lblCitaAtencionPrimaria.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel(medico);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelPedirCitaPaciente = new PanelPedirCitaPaciente(horarioMañana, mañanastxt);
		
		
		JComboBox comboBox = new JComboBox();
			
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 1184, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1190)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(lblCitaAtencionPrimaria)
							.addPreferredGap(ComponentPlacement.RELATED, 700, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addGap(573))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblCitaAtencionPrimaria))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(621)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		
	
	}

	


	public PanelMensaje getPanelPedirCitaPaciente() {
		return panelPedirCitaPaciente.getPanelMensajeCita();
	}

	public JComboBox getPanelPedirCitaPacienteid() {
		return panelPedirCitaPaciente.getPanelComboBoxid();
	}
	public JComboBox getPanelPedirCitaPacienteNombre() {
		return panelPedirCitaPaciente.getPanelComboBoxNombre();
	}
	
	public JComboBox getPanelPedirCitaPacienteNombreDoctor() {
		return panelPedirCitaPaciente.getComboBoxNombreDoctorCItaPaciente();
	}
	public JComboBox getPanelPedirCitaPacienteIDDoctor() {
		return panelPedirCitaPaciente.getComboBoxIDDoctorCItaPaciente();
	}
	

	
}
