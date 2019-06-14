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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class PanelConsultaBajaMedico extends JPanel {
	private PanelComboBox panelCombo;
	private JTextField textEspecialidad;
	private JTextField textHorario;
	private JTextField textConsulta;
	public PanelMensaje panelMensaje;
	public PanelDatosPersonales panelDatosPersonales;
	private JLabel label;
	

	public PanelConsultaBajaMedico(String name, boolean visibilidadPanel,String imagen) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblConsultaMedico = new JLabel(name);
		lblConsultaMedico.setFont(new Font("Tahoma", Font.BOLD, 22));
		panelCombo=new PanelComboBox("Médico", "ID");
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
		lblEspecialidad.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel lblConsulta = new JLabel("Consulta");
		lblConsulta.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		textEspecialidad = new JTextField();
		textEspecialidad.setHorizontalAlignment(SwingConstants.CENTER);
		textEspecialidad.setEditable(false);
		textEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 14));
		textEspecialidad.setColumns(10);
		
		textHorario = new JTextField();
		textHorario.setHorizontalAlignment(SwingConstants.CENTER);
		textHorario.setEditable(false);
		textHorario.setFont(new Font("Tahoma", Font.BOLD, 14));
		textHorario.setColumns(10);
		
		textConsulta = new JTextField();
		textConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		textConsulta.setEditable(false);
		textConsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
		textConsulta.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new BorderLayout(0, 0));
		panelMensaje = new PanelMensaje();
		panelMensaje.setVisible(visibilidadPanel);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(imagen));
		
		panelDatosPersonales.setTxtEspecialidad(textEspecialidad);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
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
									.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE)
									.addGap(17)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(40)
											.addComponent(lblHorario))
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblConsulta)
											.addComponent(lblEspecialidad)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(textEspecialidad, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textConsulta, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
												.addComponent(textHorario, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))))
									.addGap(27)
									.addComponent(label)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConsultaMedico)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEspecialidad)
								.addComponent(textEspecialidad, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConsulta)
								.addComponent(textHorario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHorario)
								.addComponent(textConsulta, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE))
					.addGap(62)
					.addComponent(panelMensaje, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
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
