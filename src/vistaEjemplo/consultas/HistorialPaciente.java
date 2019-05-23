package vistaEjemplo.consultas;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class HistorialPaciente extends JPanel {
	private JTable tableConsultas;
	private JTable tableTratamiento;

	/**
	 * Create the panel.
	 */
	public HistorialPaciente() {
		JLabel lblCierreOperaciones = new JLabel("Historial Paciente ");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblTratamientos = new JLabel("Tratamientos");
		
		JLabel lblCitas = new JLabel("Citas/Operaciones");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTratamientos)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCitas)
						.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblCitas)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblTratamientos)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		
		String nombresColumnasT[]={"Paciente","medicamento","posologia", "fecha inicio", "fecha fin"};
		String dataT[][]={{"Gonzalo Berceo, Jonathan","omeprazol","cada 8 horas","10/06/2019","16/06/2019"}};
		Font font = new Font("Tahoma", Font.PLAIN, 16);
		DefaultTableModel defaultTableModelT = new DefaultTableModel(dataT,nombresColumnasT);
		tableTratamiento = new JTable(defaultTableModelT);
		tableTratamiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane_1.setViewportView(tableTratamiento);
		
		
		
		
		String nombresColumnas[]={"Paciente	","tipo","fecha", "medico"};
		String data[][]={{"Gonzalo Berceo, Jonathan","Consulta primaria","16/06/2019","Jovellanos pursuy,Benito"}};
		tableConsultas = new JTable();
		tableConsultas.setFont(font);
		tableConsultas.getTableHeader().setFont(font);
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,nombresColumnas);
		tableConsultas.setModel(defaultTableModel);
		scrollPane.setViewportView(tableConsultas);
		setLayout(groupLayout);
		
		
	}

}
