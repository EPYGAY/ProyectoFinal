package vistas.medico;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelDatosPersonalesSegundParte;
import vista.comunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAltaMedico extends JPanel {

	private JButton btnAlta;
	private PanelDatosPersonales panelDatosPersonales;
	public PanelAltaMedico(String nombre, boolean mostrarBtnAlta) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblNewLabel = new JLabel(nombre);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelDatosPersonales = new PanelDatosPersonales();
		panelDatosPersonales.setBackground(new Color(240, 230, 140));
		panel.add(panelDatosPersonales);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		PanelDatosPersonalesSegundParte panelDatosPersonalesSegundParte = new PanelDatosPersonalesSegundParte(true, true, true, true, true);
		panelDatosPersonalesSegundParte.setBackground(new Color(240, 230, 140));
		panel_1.add(panelDatosPersonalesSegundParte);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new BorderLayout(0, 0));
		PanelMensaje panelMensaje = new PanelMensaje();
		
		panelMensaje.setBackground(new Color(240, 230, 140));
		panel_2.add(panelMensaje);
		
		btnAlta = new JButton("Alta");
		btnAlta.setVisible(mostrarBtnAlta);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAlta))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(17)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnAlta)
							.addGap(117)))
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

		
	}
	public JButton getBtnAlta() {
		return btnAlta;
	}
	public void setBtnAlta(JButton btnAlta) {
		this.btnAlta = btnAlta;
	}
	public PanelDatosPersonales getPanelDatosPersonales() {
		return panelDatosPersonales;
	}
	public void setPanelDatosPersonales(PanelDatosPersonales panelDatosPersonales) {
		this.panelDatosPersonales = panelDatosPersonales;
	}
	
	
}
