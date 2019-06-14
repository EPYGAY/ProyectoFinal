package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.FlowLayout;

import vista.comunes.Botonera;
import vista.comunes.PanelComboBox;
import vista.comunes.PanelMensaje;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelPedirCitaPaciente extends JPanel {
	PanelComboBox combo = null;
	PanelMensaje panelMensaje = new PanelMensaje();
	protected JPanel panel;
	private PanelComboBox panelComboBox;
	private JComboBox comboBoxIDDoctorCItaPaciente;
	private PanelMensaje panelMensajeCita;
	private JPanel panel_3;
	private JComboBox comboBoxNombreDoctorCItaPaciente;
	private Botonera botonera;



	public PanelPedirCitaPaciente(boolean horarioMañana, boolean mañanastxt) {
		setBackground(new Color(32, 178, 170));

		panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelComboBox = new PanelComboBox("Paciente", "ID");
		panelComboBox.getComboBoxNombre().setFont(new Font("Tahoma", Font.BOLD, 16));
		panelComboBox.getComboBoxID().setFont(new Font("Tahoma", Font.BOLD, 16));
		panelComboBox.getComboBoxID().setForeground(new Color(0, 0, 0));
		panelComboBox.getComboBoxNombre().setForeground(new Color(0, 0, 0));
		panelComboBox.getComboBoxID().setBackground(new Color(119, 136, 153));
		panelComboBox.getComboBoxNombre().setBackground(new Color(176, 196, 222));
		panelComboBox.setBackground(new Color(32, 178, 170));
		panel.add(panelComboBox);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new BorderLayout(0, 0));

		comboBoxIDDoctorCItaPaciente = new JComboBox();
		comboBoxIDDoctorCItaPaciente.setEnabled(false);
		panelMensajeCita = new PanelMensaje();

		panelMensajeCita.setBackground(new Color(32, 178, 170));

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(244, 164, 96));
		botonera = new Botonera(100, 0);
		botonera.setBackground(new Color(32, 178, 170));

		comboBoxNombreDoctorCItaPaciente = new JComboBox();
		comboBoxNombreDoctorCItaPaciente.setForeground(Color.WHITE);
		comboBoxNombreDoctorCItaPaciente.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBoxNombreDoctorCItaPaciente.setBackground(new Color(85, 107, 47));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(177)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE)
						.addComponent(botonera, GroupLayout.PREFERRED_SIZE, 761, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelMensajeCita, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE))
				.addGap(1384)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxIDDoctorCItaPaciente, GroupLayout.PREFERRED_SIZE, 71,
								GroupLayout.PREFERRED_SIZE))
				.addGap(0))
				.addGroup(groupLayout.createSequentialGroup().addGap(37)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE).addGap(18)
						.addComponent(comboBoxNombreDoctorCItaPaciente, GroupLayout.PREFERRED_SIZE, 271,
								GroupLayout.PREFERRED_SIZE)
						.addGap(1702)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout
										.createSequentialGroup().addGap(11)
										.addComponent(comboBoxNombreDoctorCItaPaciente, GroupLayout.PREFERRED_SIZE, 37,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
								.createSequentialGroup().addGap(6)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup().addGap(16)
												.addComponent(comboBoxIDDoctorCItaPaciente, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(42).addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 326,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup().addGap(379).addComponent(
												panelMensajeCita, GroupLayout.PREFERRED_SIZE, 52,
												GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup().addGap(55).addComponent(botonera,
										GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)))
						.addGap(102)));
		panel_3.setLayout(null);

		JLabel lblLunes = new JLabel("LUNES");
		lblLunes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes.setBounds(49, 11, 86, 14);
		panel_3.add(lblLunes);

		JLabel lblMartes = new JLabel("MARTES");
		lblMartes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMartes.setBounds(191, 11, 74, 14);
		panel_3.add(lblMartes);

		JLabel lblMiercoles = new JLabel("MIERCOLES");
		lblMiercoles.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMiercoles.setBounds(326, 11, 95, 14);
		panel_3.add(lblMiercoles);

		JLabel lblJueves = new JLabel("JUEVES");
		lblJueves.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJueves.setBounds(491, 11, 74, 14);
		panel_3.add(lblJueves);

		JLabel lblViernes = new JLabel("VIERNES");
		lblViernes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblViernes.setBounds(638, 11, 74, 14);
		panel_3.add(lblViernes);
		setLayout(groupLayout);

		
	}



	public JComboBox getComboBoxIDDoctorCItaPaciente() {
		return comboBoxIDDoctorCItaPaciente;
	}

	public JComboBox getComboBoxNombreDoctorCItaPaciente() {
		return comboBoxNombreDoctorCItaPaciente;
	}

	public JComboBox getPanelComboBoxid() {
		return panelComboBox.getComboBoxID();
	}

	public JComboBox getPanelComboBoxNombre() {
		return panelComboBox.getComboBoxNombre();
	}

	public PanelMensaje getPanelMensajeCita() {
		return panelMensajeCita;
	}

	public Botonera getBotonera() {
		return botonera;
	}
	public String getNombreBoton() {
		return botonera.getNombreBoton();
	}
	public void setBotonera(Botonera botonera) {
		this.botonera = botonera;
	}

}
