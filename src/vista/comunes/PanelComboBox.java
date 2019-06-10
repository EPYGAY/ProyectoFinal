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
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class PanelComboBox extends JPanel {
	public JComboBox comboBoxNombrePaciente;
	public JComboBox comboBoxID; 

	public PanelComboBox(String nombre, String id) {
		setBackground(new Color(240, 230, 140));

		JLabel lblMensaje = new JLabel(nombre);
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		comboBoxNombrePaciente = new JComboBox();
		comboBoxNombrePaciente.setForeground(new Color(255, 255, 255));
		comboBoxNombrePaciente.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		comboBoxNombrePaciente.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBoxNombrePaciente.setBackground(new Color(85, 107, 47));
		comboBoxNombrePaciente.setBorder(new LineBorder(new Color(184, 134, 11), 0));
		
		JLabel lblId = new JLabel(id);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		comboBoxID = new JComboBox();
		comboBoxID.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		comboBoxID.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBoxID.setForeground(new Color(255, 255, 255));
		comboBoxID.setBackground(new Color(85, 107, 47));
		comboBoxID.setBorder(new LineBorder(new Color(139, 69, 19), 0));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMensaje)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBoxNombrePaciente, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
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
						.addComponent(comboBoxNombrePaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

	public JComboBox getComboBoxID() {
		return comboBoxID;
	}

	public JComboBox getComboBoxNombre() {
		return comboBoxNombrePaciente;
	}
	
	
}
