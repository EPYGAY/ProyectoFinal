package vistaEjemplo.consultas;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Citaoperacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public Citaoperacion() {
		
		JLabel lblCitaOperacion = new JLabel("Cita Operacion");
		lblCitaOperacion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel label_1 = new JLabel("Paciente");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox = new JComboBox();
		
		JLabel label_2 = new JLabel("ID");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblCirujano = new JLabel("Cirujano");
		lblCirujano.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox_2 = new JComboBox();
		
		JLabel label_4 = new JLabel("Mensaje");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_5 = new JLabel(" ");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		label_5.setBackground(Color.WHITE);
		
		JButton button = new JButton("Aplicar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblFechasDisponibles = new JLabel("Fechas Disponibles");
		lblFechasDisponibles.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox_3 = new JComboBox();
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox_4 = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFechasDisponibles, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
									.addGap(70)
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 514, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addGap(71)
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 804, GroupLayout.PREFERRED_SIZE)))
							.addGap(61)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
											.addGap(18))
										.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblCirujano, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)))
									.addGap(434))
								.addComponent(lblCitaOperacion, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(lblCitaOperacion, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(91)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCirujano, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(117)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFechasDisponibles, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(227)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
