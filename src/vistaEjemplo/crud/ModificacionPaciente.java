package vistaEjemplo.crud;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class ModificacionPaciente extends JPanel {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public ModificacionPaciente() {
		JLabel lblAltaPaciente = new JLabel("Modificacion Paciente");
		lblAltaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("nombre");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel label_1 = new JLabel("Mensaje");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel(" ");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		label_2.setBackground(Color.WHITE);
		
		JButton button = new JButton("Aplicar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(106)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 854, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
									.addGap(36)
									.addComponent(lblId_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addGap(86)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 804, GroupLayout.PREFERRED_SIZE)
									.addGap(44)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblAltaPaciente))))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(lblAltaPaciente)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(33))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(701)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][][][]"));

		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNombre, "cell 0 1,alignx trailing");

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(textField, "cell 1 1,growx");
		textField.setColumns(10);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblApellidos, "cell 0 2,alignx trailing");

		textField_2 = new JTextField();
		textField_2.setEditable(false);
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

		JLabel lblNacimiento = new JLabel("Nacimiento");
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNacimiento, "cell 0 4,alignx trailing");

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		panel.add(textField_4, "cell 1 4");

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblTelefono, "cell 0 5,alignx trailing");

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setColumns(10);
		panel.add(textField_5, "cell 1 5");
		setLayout(groupLayout);

	}

}
