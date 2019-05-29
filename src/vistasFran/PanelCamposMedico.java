package vistasFran;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelCamposMedico extends JPanel{
	protected JComboBox cbxHorario;
	protected JComboBox cbxConsulta;
	protected JComboBox cbxEspecialidad;
	public JComboBox getCbxHorario() {
		return cbxHorario;
	}
	public void setCbxHorario(JComboBox cbxHorario) {
		this.cbxHorario = cbxHorario;
	}
	public JComboBox getCbxConsulta() {
		return cbxConsulta;
	}
	public void setCbxConsulta(JComboBox cbxConsulta) {
		this.cbxConsulta = cbxConsulta;
	}
	public JComboBox getCbxEspecialidad() {
		return cbxEspecialidad;
	}
	public void setCbxEspecialidad(JComboBox cbxEspecialidad) {
		this.cbxEspecialidad = cbxEspecialidad;
	}
	public PanelCamposMedico() {
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		cbxEspecialidad = new JComboBox();
		
		cbxConsulta = new JComboBox();
		
		JLabel lblConsulta = new JLabel("Consulta");
		lblConsulta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		cbxHorario = new JComboBox();
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblConsulta, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(cbxConsulta, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblEspecialidad)
								.addGap(18)
								.addComponent(cbxEspecialidad, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblHorario, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(cbxHorario, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEspecialidad)
						.addComponent(cbxEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblConsulta, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(cbxConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblHorario, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(cbxHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
