package vistasComunes;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class PanelMensaje extends JPanel {
	private JTextField txtMensaje;
	private JButton btnAplicr;

	public JButton getBtnAplicr() {
		return btnAplicr;
	}

	public void setBtnAplicr(JButton btnAplicr) {
		this.btnAplicr = btnAplicr;
	}

	public PanelMensaje() {
		setBackground(new Color(204, 204, 51));

		JLabel lblMensaje = new JLabel("Mensaje");

		txtMensaje = new JTextField();
		txtMensaje.setColumns(10);

		btnAplicr = new JButton("Aplicar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblMensaje)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnAplicr, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblMensaje)
								.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAplicr))
						.addContainerGap(275, Short.MAX_VALUE)));
		setLayout(groupLayout);
	}
}
