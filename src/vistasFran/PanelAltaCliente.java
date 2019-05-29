package vistasFran;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class PanelAltaCliente extends JPanel {
	private JTextField txtBirth;
	public PanelAltaCliente() {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNacimiento = new JLabel("Nacimiento");
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		txtBirth = new JTextField();
		txtBirth.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Alta Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(100, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNacimiento, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(111)
							.addComponent(txtBirth, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)))
					.addGap(59))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(48)
					.addComponent(lblNewLabel)
					.addContainerGap(448, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNewLabel)
					.addGap(46)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNacimiento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBirth, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		PanelDatosPersonales panelDatosPersonales = new PanelDatosPersonales();
		panelDatosPersonales.setBounds(0, 0, 450, 237);
		panel.add(panelDatosPersonales);
		setLayout(groupLayout);
	}

}
