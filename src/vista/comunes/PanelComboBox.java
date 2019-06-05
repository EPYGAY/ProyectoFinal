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

public class PanelComboBox extends JPanel {
	public JComboBox comboBoxPaciente;
	public JComboBox comboBoxID; 

	public PanelComboBox(String nombre, String id) {
		setBackground(new Color(240, 230, 140));

		JLabel lblMensaje = new JLabel(nombre);
		
		comboBoxPaciente = new JComboBox();
		
		JLabel lblId = new JLabel(id);
		
		comboBoxID = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMensaje)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBoxPaciente, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblId)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBoxID, 0, 264, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMensaje)
						.addComponent(comboBoxPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	
}
