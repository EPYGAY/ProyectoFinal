package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelComboBox;
import vista.comunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;

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
import java.awt.SystemColor;

public class PanelPedirCitaPrimarioyEspecialistaPaciente extends JPanel {
PanelComboBox combo= null;
private CitasDAO citasDAO= new CitasDAO();
private PanelPedirCitaPaciente panelPedirCitaPaciente;
public PanelMensaje panelMensaje;



	public PanelPedirCitaPrimarioyEspecialistaPaciente(String nombreCita, String medico, boolean horarioMañana, boolean mañanastxt ) {
		setBackground(new Color(204, 204, 153));
		
		JLabel lblCitaAtencionPrimaria = new JLabel(nombreCita);
		lblCitaAtencionPrimaria.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel(medico);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelPedirCitaPaciente = new PanelPedirCitaPaciente(horarioMañana, mañanastxt);
		panelPedirCitaPaciente.getBotonera().setBackground(new Color(204, 204, 153));
		
		panelPedirCitaPaciente.getComboBoxNombreDoctorCItaPaciente().setForeground(new Color(184, 134, 11));
		panelPedirCitaPaciente.getPanelMensajeCita().setBackground(new Color(204, 204, 153));
		panelPedirCitaPaciente.panel.setBackground(new Color(204, 204, 153));
		panelPedirCitaPaciente.setBackground(new Color(204, 204, 153));
		panelPedirCitaPaciente.getComboBoxNombreDoctorCItaPaciente().setBackground(new Color(255, 255, 255));
		panelPedirCitaPaciente.getPanelComboBoxid().setBackground(SystemColor.activeCaption);
		panelPedirCitaPaciente.getPanelComboBoxNombre().setBackground(SystemColor.activeCaption);
		
		
		JComboBox comboBox = new JComboBox();
			
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 1184, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1190)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(lblCitaAtencionPrimaria)
							.addPreferredGap(ComponentPlacement.RELATED, 770, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addGap(490)))
					.addGap(407))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCitaAtencionPrimaria)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(621)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE))
					.addGap(0))
		);
		setLayout(groupLayout);
		
		
	
	}


	public PanelMensaje getPanelMensajePedirCitaPaciente() {
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
	public PanelPedirCitaPaciente getPanelPedirCitaPaciente() {
		return panelPedirCitaPaciente;
	}
	
	

}
