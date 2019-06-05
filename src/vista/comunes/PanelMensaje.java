package vista.comunes;

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
	
	public JTextField txtMensajeComun;
	public JButton btnAplicr;

	public PanelMensaje() {
		setBackground(new Color(240, 230, 140));

		JLabel lblMensaje = new JLabel("Mensaje");

		txtMensajeComun = new JTextField();
		txtMensajeComun.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMensajeComun.setEditable(false);
		txtMensajeComun.setColumns(10);

		btnAplicr = new JButton("Aplicar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblMensaje)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(txtMensajeComun, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnAplicr, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblMensaje)
								.addComponent(txtMensajeComun, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAplicr))
						.addContainerGap(275, Short.MAX_VALUE)));
		setLayout(groupLayout);
	}

	public JTextField getTxtMensajeComun() {
		return txtMensajeComun;
	}

	public void setTxtMensajeComun(JTextField txtMensajeComun) {
		this.txtMensajeComun = txtMensajeComun;
	}

	public JButton getBtnAplicr() {
		return btnAplicr;
	}

	public void setBtnAplicr(JButton btnAplicr) {
		this.btnAplicr = btnAplicr;
	}

	
	
	


}
