package vistasPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import vistasComunes.PanelComboBox;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import static org.junit.Assert.assertNotNull;

import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class PanelPedirCitaPrimarioyEspecialistaPaciente extends JPanel {
PanelComboBox combo= null;

	public PanelPedirCitaPrimarioyEspecialistaPaciente(String nombreCita, String medico) {
		setBackground(new Color(204, 204, 51));
		
		JLabel lblCitaAtencionPrimaria = new JLabel(nombreCita);
		lblCitaAtencionPrimaria.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel(medico);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		PanelPedirCitaPaciente panelPedirCitaPaciente = new PanelPedirCitaPaciente();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 1155, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(59, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCitaAtencionPrimaria)
							.addPreferredGap(ComponentPlacement.RELATED, 732, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
							.addGap(81))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCitaAtencionPrimaria)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelPedirCitaPaciente, GroupLayout.PREFERRED_SIZE, 646, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		
	
	}
}
