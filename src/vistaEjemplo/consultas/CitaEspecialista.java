package vistaEjemplo.consultas;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

public class CitaEspecialista extends JPanel {

	/**
	 * Create the panel.
	 */
	public CitaEspecialista() {
		
		JLabel lblCitaAtencionPrimaria = new JLabel("Cita Especialista");
		lblCitaAtencionPrimaria.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox = new JComboBox();
		
		JLabel label_2 = new JLabel("ID");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblMedico = new JLabel("Especialista");
		lblMedico.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox_2 = new JComboBox();
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Mensaje");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_1 = new JLabel(" ");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		label_1.setBackground(Color.WHITE);
		
		JButton button_20 = new JButton("Aplicar");
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblMedico, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)))
							.addGap(36)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(276)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 649, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addGap(71)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 804, GroupLayout.PREFERRED_SIZE)
									.addGap(61)
									.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblCitaAtencionPrimaria, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(lblCitaAtencionPrimaria, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMedico, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(67))
		);
		panel.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow]", "[][grow][grow][grow][grow]"));
		
		JLabel lblLunes = new JLabel("Lunes");
		lblLunes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblLunes, "cell 1 0,growx");
		
		JLabel lblMartes = new JLabel("Martes");
		lblMartes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblMartes, "cell 2 0,growx");
		
		JLabel lblMiercoles = new JLabel("Miercol");
		lblMiercoles.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblMiercoles, "cell 3 0,growx");
		
		JLabel lblJueves = new JLabel("Jueves");
		lblJueves.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblJueves, "cell 4 0,growx");
		
		JLabel lblViernes = new JLabel("Viernes");
		lblViernes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblViernes, "cell 5 0,growx");
		
		JLabel lblHoras = new JLabel("horas");
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblHoras, "cell 0 1");
		
		JButton button = new JButton("");
		panel.add(button, "cell 1 1,grow");
		
		JButton button_1 = new JButton("");
		panel.add(button_1, "cell 2 1,grow");
		
		JButton button_2 = new JButton("");
		panel.add(button_2, "cell 3 1,grow");
		
		JButton button_3 = new JButton("");
		panel.add(button_3, "cell 4 1,grow");
		
		JButton button_4 = new JButton("");
		panel.add(button_4, "cell 5 1,grow");
		
		JLabel label_7 = new JLabel(" ");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(label_7, "cell 0 2");
		
		JButton button_13 = new JButton("");
		panel.add(button_13, "cell 1 2,grow");
		
		JButton button_14 = new JButton("");
		panel.add(button_14, "cell 2 2,grow");
		
		JButton button_15 = new JButton("");
		panel.add(button_15, "cell 3 2,grow");
		
		JButton button_16 = new JButton("");
		panel.add(button_16, "cell 4 2,grow");
		
		JButton button_5 = new JButton("");
		panel.add(button_5, "cell 5 2,grow");
		
		JLabel label_8 = new JLabel(" ");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(label_8, "cell 0 3");
		
		JButton button_12 = new JButton("");
		panel.add(button_12, "cell 1 3,grow");
		
		JButton button_19 = new JButton("");
		panel.add(button_19, "cell 2 3,grow");
		
		JButton button_18 = new JButton("");
		panel.add(button_18, "cell 3 3,grow");
		
		JButton button_17 = new JButton("");
		panel.add(button_17, "cell 4 3,grow");
		
		JButton button_6 = new JButton("");
		panel.add(button_6, "cell 5 3,grow");
		
		JLabel label_9 = new JLabel(" ");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(label_9, "cell 0 4");
		
		JButton button_11 = new JButton("");
		panel.add(button_11, "cell 1 4,grow");
		
		JButton button_10 = new JButton("");
		panel.add(button_10, "cell 2 4,grow");
		
		JButton button_9 = new JButton("");
		panel.add(button_9, "cell 3 4,grow");
		
		JButton button_8 = new JButton("");
		panel.add(button_8, "cell 4 4,grow");
		
		JButton button_7 = new JButton("");
		panel.add(button_7, "cell 5 4,grow");
		setLayout(groupLayout);
	}

}
