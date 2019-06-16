package vistas.paciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import modelo.dto.Intervencion;
import utiles.TipoIntervencion;
import vista.comunes.Botonera;
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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPedirCitaOperacionPaciente extends JPanel {
PanelComboBox combo= null;
Botonera botonera;
private JComboBox comboBox;
private PanelComboBox panelComboBox;
private PanelMensaje panelMensaje;
private JComboBox comboBoxIdCirujanoNuevo;
private JComboBox comboBoxNombreCirujanoNuevo;

	public PanelPedirCitaOperacionPaciente() {
		setBackground(new Color(204, 204, 102));
		
		JLabel lblCitaAtencionPrimaria = new JLabel("CITA OPERACION");
		lblCitaAtencionPrimaria.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout(0, 0));
		panelComboBox = new PanelComboBox("Paciente", "ID");
		panelComboBox.getComboBoxID().setBackground(SystemColor.activeCaption);
		panelComboBox.getComboBoxNombre().setBackground(SystemColor.activeCaption);
		panelComboBox.setBackground(new Color(204, 204, 102));
		panel.add(panelComboBox);
		
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(102, 102, 153));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.addItem(TipoIntervencion.TRANSPLANTE);
		comboBox.addItem(TipoIntervencion.ESCAYOLA);
		comboBox.addItem(TipoIntervencion.FIXEO);
		comboBox.addItem(TipoIntervencion.PUNTOS);
		
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblCirujano = new JLabel("Cirujano");
		lblCirujano.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		comboBoxNombreCirujanoNuevo = new JComboBox();
		comboBoxNombreCirujanoNuevo.setBackground(new Color(102, 153, 102));
		comboBoxNombreCirujanoNuevo.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblFechasDisponibles = new JLabel("Fechas Disponibles");
		lblFechasDisponibles.setVisible(false);
		lblFechasDisponibles.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setVisible(false);
		
		comboBoxIdCirujanoNuevo = new JComboBox();
		comboBoxIdCirujanoNuevo.setBackground(new Color(102, 153, 102));
		comboBoxIdCirujanoNuevo.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelMensaje = new PanelMensaje();
		
		panelMensaje.setBackground(new Color(204, 204, 102));
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCitaAtencionPrimaria)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFechasDisponibles)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 549, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(176)
									.addComponent(lblId)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBoxIdCirujanoNuevo, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addGap(33)
									.addComponent(lblCirujano)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxNombreCirujanoNuevo, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTipo)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(137, Short.MAX_VALUE)
					.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
					.addGap(133))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblCitaAtencionPrimaria)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(64)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCirujano)
								.addComponent(comboBoxNombreCirujanoNuevo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxIdCirujanoNuevo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addGap(115))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTipo)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechasDisponibles)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
					.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		setLayout(groupLayout);
		
		
	
	}

	public PanelMensaje getPanelMensaje() {
		return panelMensaje;
	}

	public void setPanelMensaje(PanelMensaje panelMensaje) {
		this.panelMensaje = panelMensaje;
	}

	public JComboBox getPanelComboBoxId() {
		return panelComboBox.getComboBoxID();
	}

	public JComboBox getPanelComboBoxNombre() {
		return panelComboBox.getComboBoxNombre();
	}
	public void setPanelComboBox(PanelComboBox panelComboBox) {
		this.panelComboBox = panelComboBox;
	}

	public JComboBox getComboBoxIdCirujanoNuevo() {
		return comboBoxIdCirujanoNuevo;
	}

	public JComboBox getComboBoxNombreCirujanoNuevo() {
		return comboBoxNombreCirujanoNuevo;
	}

	public PanelComboBox getPanelComboBox() {
		return panelComboBox;
	}
	
	
}
