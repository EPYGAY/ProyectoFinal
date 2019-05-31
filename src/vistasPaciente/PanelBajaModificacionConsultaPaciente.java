package vistasPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;

import java.awt.Color;
import java.awt.FlowLayout;

public class PanelBajaModificacionConsultaPaciente extends JPanel {
	
	public PanelBajaModificacionConsultaPaciente(String operacion,boolean b1,boolean b2, boolean b3,boolean b4,boolean visibleNacimiento) {
		setBackground(new Color(204, 204, 51));
	
		JLabel lblBajaPaciente = new JLabel(operacion);
		lblBajaPaciente.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.add(new PanelGeneralPaciente(b1,b2,b3,b4,visibleNacimiento));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.setBackground(new Color(204, 204, 51));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 789, Short.MAX_VALUE)
						.addComponent(lblBajaPaciente))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBajaPaciente)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(206, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

		
		
		
		
		
	}
}
