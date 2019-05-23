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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Presentacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public Presentacion() {
		
		JLabel lblClinicaBuenaSalud = new JLabel("Clinica Buena Salud");
		lblClinicaBuenaSalud.setFont(new Font("Tahoma", Font.PLAIN, 70));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(243)
					.addComponent(lblClinicaBuenaSalud, GroupLayout.PREFERRED_SIZE, 681, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(279, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(275)
					.addComponent(lblClinicaBuenaSalud, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(324, Short.MAX_VALUE))
		);
		setLayout(groupLayout);


	}
}
