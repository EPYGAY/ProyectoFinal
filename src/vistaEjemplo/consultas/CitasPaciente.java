package vistaEjemplo.consultas;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CitasPaciente extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CitasPaciente() {

		JLabel lblCierreOperaciones = new JLabel("Citas Pendiente Paciente ");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(156, Short.MAX_VALUE))
		);
		
		String nombresColumnas[]={"Paciente	","tipo","fecha", "medico"};
		String data[][]={{"Gonzalo Berceo, Jonathan","Consulta primaria","16/06/2019","Jovellanos pursuy,Benito"}};
		table = new JTable();
		Font font = new Font("Tahoma", Font.PLAIN, 16);
		table.setFont(font);
		table.getTableHeader().setFont(font);
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,nombresColumnas);
		table.setModel(defaultTableModel);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}

}
