package vista.comunes;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Dimension;

public class PanelHorario extends JPanel {

	public PanelHorario(String hora1,String hora2,String hora3, String hora4) {
		setBackground(new Color(240, 230, 140));
		
		JButton button_19 = new JButton("");
		button_19.setMinimumSize(new Dimension(50, 9));
		button_19.setPreferredSize(new Dimension(50, 9));
		button_19.setMaximumSize(new Dimension(50, 9));
		button_19.setMargin(new Insets(6, 50, 2, 14));
		
		JLabel label = new JLabel("Lunes");
		
		JLabel label_1 = new JLabel("Martes");
		
		JLabel label_2 = new JLabel("Miercoles");
		
		JLabel label_3 = new JLabel("Jueves");
		
		JLabel label_4 = new JLabel("Viernes");
		
		JButton button_14 = new JButton("");
		button_14.setPreferredSize(new Dimension(50, 9));
		button_14.setMinimumSize(new Dimension(50, 9));
		button_14.setMaximumSize(new Dimension(50, 9));
		button_14.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_13 = new JButton("");
		button_13.setPreferredSize(new Dimension(50, 9));
		button_13.setMinimumSize(new Dimension(50, 9));
		button_13.setMaximumSize(new Dimension(50, 9));
		button_13.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_8 = new JButton("");
		button_8.setPreferredSize(new Dimension(50, 9));
		button_8.setMinimumSize(new Dimension(50, 9));
		button_8.setMaximumSize(new Dimension(50, 9));
		button_8.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_7 = new JButton("");
		button_7.setPreferredSize(new Dimension(50, 9));
		button_7.setMinimumSize(new Dimension(50, 9));
		button_7.setMaximumSize(new Dimension(50, 9));
		button_7.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button = new JButton("");
		button.setPreferredSize(new Dimension(50, 9));
		button.setMinimumSize(new Dimension(50, 9));
		button.setMaximumSize(new Dimension(50, 9));
		button.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_1 = new JButton("");
		button_1.setPreferredSize(new Dimension(50, 9));
		button_1.setMinimumSize(new Dimension(50, 9));
		button_1.setMaximumSize(new Dimension(50, 9));
		button_1.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_2 = new JButton("");
		button_2.setPreferredSize(new Dimension(50, 9));
		button_2.setMinimumSize(new Dimension(50, 9));
		button_2.setMaximumSize(new Dimension(50, 9));
		button_2.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_3 = new JButton("");
		button_3.setPreferredSize(new Dimension(50, 9));
		button_3.setMinimumSize(new Dimension(50, 9));
		button_3.setMaximumSize(new Dimension(50, 9));
		button_3.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_4 = new JButton("");
		button_4.setPreferredSize(new Dimension(50, 9));
		button_4.setMinimumSize(new Dimension(50, 9));
		button_4.setMaximumSize(new Dimension(50, 9));
		button_4.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_5 = new JButton("");
		button_5.setPreferredSize(new Dimension(50, 9));
		button_5.setMinimumSize(new Dimension(50, 9));
		button_5.setMaximumSize(new Dimension(50, 9));
		button_5.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_6 = new JButton("");
		button_6.setPreferredSize(new Dimension(50, 9));
		button_6.setMinimumSize(new Dimension(50, 9));
		button_6.setMaximumSize(new Dimension(50, 9));
		button_6.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_9 = new JButton("");
		button_9.setPreferredSize(new Dimension(50, 9));
		button_9.setMinimumSize(new Dimension(50, 9));
		button_9.setMaximumSize(new Dimension(50, 9));
		button_9.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_10 = new JButton("");
		button_10.setPreferredSize(new Dimension(50, 9));
		button_10.setMinimumSize(new Dimension(50, 9));
		button_10.setMaximumSize(new Dimension(50, 9));
		button_10.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_11 = new JButton("");
		button_11.setPreferredSize(new Dimension(50, 9));
		button_11.setMinimumSize(new Dimension(50, 9));
		button_11.setMaximumSize(new Dimension(50, 9));
		button_11.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_12 = new JButton("");
		button_12.setPreferredSize(new Dimension(50, 9));
		button_12.setMinimumSize(new Dimension(50, 9));
		button_12.setMaximumSize(new Dimension(50, 9));
		button_12.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_15 = new JButton("");
		button_15.setPreferredSize(new Dimension(50, 9));
		button_15.setMinimumSize(new Dimension(50, 9));
		button_15.setMaximumSize(new Dimension(50, 9));
		button_15.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_16 = new JButton("");
		button_16.setPreferredSize(new Dimension(50, 9));
		button_16.setMinimumSize(new Dimension(50, 9));
		button_16.setMaximumSize(new Dimension(50, 9));
		button_16.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_17 = new JButton("");
		button_17.setPreferredSize(new Dimension(50, 9));
		button_17.setMinimumSize(new Dimension(50, 9));
		button_17.setMaximumSize(new Dimension(50, 9));
		button_17.setMargin(new Insets(6, 50, 2, 14));
		
		JButton button_18 = new JButton("");
		button_18.setPreferredSize(new Dimension(50, 9));
		button_18.setMinimumSize(new Dimension(50, 9));
		button_18.setMaximumSize(new Dimension(50, 9));
		button_18.setMargin(new Insets(6, 50, 2, 14));
		
		JLabel lblE = new JLabel(hora1);
		
		JLabel lblW = new JLabel(hora2);
		
		JLabel lblT = new JLabel(hora3);
		
		JLabel lblI = new JLabel(hora4);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(109, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(50)
					.addComponent(label_1)
					.addGap(43)
					.addComponent(label_2)
					.addGap(47)
					.addComponent(label_3)
					.addGap(35)
					.addComponent(label_4)
					.addGap(37))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblW)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblE)
							.addGap(18)
							.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblT)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblI)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_4)
							.addComponent(label_3)
							.addComponent(label_2))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_1)
							.addComponent(label)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(26, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(lblE)
							.addGap(49)
							.addComponent(lblW)
							.addGap(49)
							.addComponent(lblT)
							.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
							.addComponent(lblI)
							.addGap(48))))
		);
		setLayout(groupLayout);
	}
}
