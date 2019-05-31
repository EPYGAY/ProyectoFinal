package vistasMedico;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vistasComunes.PanelDatosPersonales;
import vistasComunes.PanelDatosPersonalesSegundParte;
import vistasComunes.PanelMensaje;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelAltaBajaMedico extends JPanel {

	public PanelAltaBajaMedico(String nombre) {
		setBackground(new Color(204, 204, 51));
		
		JLabel lblNewLabel = new JLabel(nombre);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 51));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		PanelDatosPersonales panelDatosPersonales = new PanelDatosPersonales(true,true,true,true,true);
		panelDatosPersonales.setBackground(new Color(204, 204, 51));
		panel.add(panelDatosPersonales);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 51));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		PanelDatosPersonalesSegundParte panelDatosPersonalesSegundParte = new PanelDatosPersonalesSegundParte(true, true, true, true, true);
		panelDatosPersonalesSegundParte.setBackground(new Color(204, 204, 51));
		panel_1.add(panelDatosPersonalesSegundParte);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.add(new PanelMensaje());
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
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(158, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(136, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

		
	}
}
