package vistas.paciente;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import vista.comunes.PanelComboBox;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelVerHistorialPaciente extends JPanel {
	private JTable tableConsultas;
	private JTable tableTratamiento;

	/**
	 * Create the panel.
	 */
	public PanelVerHistorialPaciente() {
		setBackground(new Color(240, 230, 140));
		JLabel lblCierreOperaciones = new JLabel("Historial Paciente ");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblTratamientos = new JLabel("Tratamientos");
		
		JLabel lblCitas = new JLabel("Citas/Operaciones");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(new PanelComboBox("Paciente","ID"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTratamientos)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCitas)
								.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCitas)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblTratamientos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
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