package vistas.medico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelComboBox;
import vista.comunes.PanelDatosPersonales;

import javax.swing.JButton;
import javax.swing.JTextField;
import vista.comunes.PanelMensaje;

public class PanelConsultaBajaMedico extends JPanel {
	private PanelComboBox panelCombo;
	private JTextField textEspecialidad;
	private JTextField textHorario;
	private JTextField textConsulta;
	public PanelMensaje panelMensaje;
	public PanelDatosPersonales panelDatosPersonales;
	

	public PanelConsultaBajaMedico(String name, boolean visibilidadPanel) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblConsultaMedico = new JLabel(name);
		lblConsultaMedico.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelCombo=new PanelComboBox("M�dico", "ID");
		panelCombo.setBackground(new Color(240, 230, 140));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panelDatosPersonales = new PanelDatosPersonales();
		panelDatosPersonales.getTextNacimiento().setVisible(false);
		panelDatosPersonales.getLblNacimiento().setVisible(false);
		panelDatosPersonales.getTxtaApellido().setEditable(false);
		panelDatosPersonales.getTxtNombre().setEditable(false);
		panelDatosPersonales.getTxtDireccion().setEditable(false);
		panelDatosPersonales.getTextTelefono().setEditable(false);
		panelDatosPersonales.getTextNacimiento().setEditable(false);
		panel.add(panelDatosPersonales);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblConsulta = new JLabel("Consulta");
		lblConsulta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textEspecialidad = new JTextField();
		textEspecialidad.setEditable(false);
		textEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		textEspecialidad.setColumns(10);
		
		textHorario = new JTextField();
		textHorario.setEditable(false);
		textHorario.setFont(new Font("Tahoma", Font.BOLD, 14));
		textHorario.setColumns(10);
		
		textConsulta = new JTextField();
		textConsulta.setEditable(false);
		textConsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
		textConsulta.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new BorderLayout(0, 0));
		panelMensaje = new PanelMensaje();
		panelMensaje.setVisible(visibilidadPanel);
		panel_1.add(panelMensaje);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelCombo, GroupLayout.PREFERRED_SIZE, 633, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsultaMedico)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(22)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(28)
											.addComponent(lblConsulta)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textConsulta, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblHorario)
												.addComponent(lblEspecialidad))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textHorario, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
												.addComponent(textEspecialidad, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConsultaMedico)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEspecialidad)
						.addComponent(textEspecialidad, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textHorario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHorario))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textConsulta, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConsulta))
					.addGap(38)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	public JComboBox getComboId() {
		return panelCombo.getComboBoxID();
	}
	
	public JComboBox getComboNombre() {
		return panelCombo.getComboBoxNombre();
	}

	public PanelComboBox getPanelCombo() {
		return panelCombo;
	}

	public void setPanelCombo(PanelComboBox panelCombo) {
		this.panelCombo = panelCombo;
	}

	public JTextField getTextEspecialidad() {
		return textEspecialidad;
	}

	public void setTextEspecialidad(JTextField textEspecialidad) {
		this.textEspecialidad = textEspecialidad;
	}

	public JTextField getTextHorario() {
		return textHorario;
	}

	public void setTextHorario(JTextField textHorario) {
		this.textHorario = textHorario;
	}

	public JTextField getTextConsulta() {
		return textConsulta;
	}

	public void setTextConsulta(JTextField textConsulta) {
		this.textConsulta = textConsulta;
	}

	public PanelMensaje getPanelMensaje() {
		return panelMensaje;
	}

	public void setPanelMensaje(PanelMensaje panelMensaje) {
		this.panelMensaje = panelMensaje;
	}
	public PanelDatosPersonales getPanelDatosPersonales() {
		return panelDatosPersonales;
	}

	public void setPanelDatosPersonales(PanelDatosPersonales panelDatosPersonales) {
		this.panelDatosPersonales = panelDatosPersonales;
	}

	
	
}
