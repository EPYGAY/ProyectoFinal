package vistasFran;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelGenericoCitas extends JPanel{
	private JTextField textField;
	
	public PanelGenericoCitas(String...nombreLabel) {
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(66, 43, 57, 37);
		panel_1.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(122, 43, 57, 37);
		panel_1.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(179, 43, 57, 37);
		panel_1.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(235, 43, 57, 37);
		panel_1.add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBounds(292, 43, 57, 37);
		panel_1.add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(66, 82, 57, 37);
		panel_1.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(122, 82, 57, 37);
		panel_1.add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBounds(179, 82, 57, 37);
		panel_1.add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBounds(235, 82, 57, 37);
		panel_1.add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBounds(292, 82, 57, 37);
		panel_1.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBounds(66, 122, 57, 37);
		panel_1.add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBounds(122, 122, 57, 37);
		panel_1.add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBounds(179, 122, 57, 37);
		panel_1.add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBounds(235, 122, 57, 37);
		panel_1.add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBounds(292, 122, 57, 37);
		panel_1.add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBounds(66, 162, 57, 37);
		panel_1.add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBounds(122, 162, 57, 37);
		panel_1.add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBounds(179, 162, 57, 37);
		panel_1.add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBounds(235, 162, 57, 37);
		panel_1.add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBounds(292, 162, 57, 37);
		panel_1.add(button_39);
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel(nombreLabel[0]);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnAplicar = new JButton("Aplicar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(lblMensaje)
							.addGap(13)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAplicar)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(39, Short.MAX_VALUE)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
							.addGap(46)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel_1)
					.addGap(36)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblMensaje)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAplicar)))
					.addGap(42))
		);
		
		JLabel lblNewLabel = new JLabel("Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblTipoCita = new JLabel(nombreLabel[1]);
		lblTipoCita.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_2 = new JComboBox();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoCita, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
					.addGap(32))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGap(1)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGap(1)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblTipoCita, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel label = new JLabel("Lunes");
		label.setBounds(78, 27, 46, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Martes");
		label_1.setBounds(134, 27, 46, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Miercoles");
		label_2.setBounds(185, 27, 75, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Jueves");
		label_3.setBounds(247, 27, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Viernes");
		label_4.setBounds(303, 27, 46, 14);
		panel_1.add(label_4);
		panel.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(66, 43, 57, 37);
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(122, 43, 57, 37);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(179, 43, 57, 37);
		panel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(235, 43, 57, 37);
		panel.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(292, 43, 57, 37);
		panel.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(66, 82, 57, 37);
		panel.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(122, 82, 57, 37);
		panel.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(179, 82, 57, 37);
		panel.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(235, 82, 57, 37);
		panel.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(292, 82, 57, 37);
		panel.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(66, 122, 57, 37);
		panel.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(122, 122, 57, 37);
		panel.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(179, 122, 57, 37);
		panel.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(235, 122, 57, 37);
		panel.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(292, 122, 57, 37);
		panel.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(66, 162, 57, 37);
		panel.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(122, 162, 57, 37);
		panel.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(179, 162, 57, 37);
		panel.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(235, 162, 57, 37);
		panel.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBounds(292, 162, 57, 37);
		panel.add(button_19);
		
		JLabel lblLunes = new JLabel("Lunes");
		lblLunes.setBounds(77, 26, 46, 14);
		panel.add(lblLunes);
		
		JLabel lblMartes = new JLabel("Martes");
		lblMartes.setBounds(133, 26, 46, 14);
		panel.add(lblMartes);
		
		JLabel lblMiercoles = new JLabel("Miercoles");
		lblMiercoles.setBounds(184, 26, 75, 14);
		panel.add(lblMiercoles);
		
		JLabel lblJueves = new JLabel("Jueves");
		lblJueves.setBounds(246, 26, 46, 14);
		panel.add(lblJueves);
		
		JLabel lblViernes = new JLabel("Viernes");
		lblViernes.setBounds(302, 26, 46, 14);
		panel.add(lblViernes);
		setLayout(groupLayout);
		
	}
}
