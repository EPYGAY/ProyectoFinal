package vista.comunes;
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

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class PanelInicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelInicio() {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblClinicaBuenaSalud = new JLabel("CLINICA");
		lblClinicaBuenaSalud.setFont(new Font("Arial Black", Font.BOLD, 70));
		
		JLabel lblEpygay = new JLabel("EPYGAY");
		lblEpygay.setFont(new Font("Arial Black", Font.BOLD, 70));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("imagenes\\LogoInicial.png"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addComponent(lblClinicaBuenaSalud, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(133)
							.addComponent(lblEpygay, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)))
					.addGap(50))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addComponent(lblClinicaBuenaSalud, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEpygay, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);


	}
}
