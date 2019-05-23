package vistaEjemplo.crud;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class AltaMedico extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public AltaMedico() {
		JLabel lblAltaPaciente = new JLabel("Alta Medico");
		lblAltaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JPanel panel = new JPanel();
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMensaje)
						.addComponent(lblAltaPaciente))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 854, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 804, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(145, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(1049, Short.MAX_VALUE)
					.addComponent(btnAplicar)
					.addGap(44))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(lblAltaPaciente)
					.addGap(44)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAplicar)
						.addComponent(lblMensaje)
						.addComponent(lblNewLabel))
					.addGap(29))
		);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblId, "cell 0 0,alignx trailing");
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		panel.add(textField_1, "cell 1 0");
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNombre, "cell 0 1,alignx trailing");
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(textField, "cell 1 1,growx");
		textField.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblApellidos, "cell 0 2,alignx trailing");
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		panel.add(textField_2, "cell 1 2,growx");
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblDireccion, "cell 0 3,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		panel.add(textField_3, "cell 1 3,growx");
		
		JLabel lblNacimiento = new JLabel("Especialidad");
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNacimiento, "cell 0 4,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 1 4,growx");
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblTelefono, "cell 0 5,alignx trailing");
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setColumns(10);
		panel.add(textField_5, "cell 1 5");
		
		JLabel lblConsulta = new JLabel("Consulta");
		lblConsulta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConsulta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblConsulta, "cell 0 6,alignx left,aligny baseline");
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		panel.add(textField_4, "cell 1 6,growx");
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblHorario, "cell 0 7,alignx trailing");
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setColumns(10);
		panel.add(textField_6, "cell 1 7,growx");
		setLayout(groupLayout);
	
	}
	}

