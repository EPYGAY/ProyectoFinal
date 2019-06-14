package vistas.paciente;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
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
	private JTable tableVerHistorial;
	PanelComboBox panelComboBox;

	/**
	 * Create the panel.
	 */
	public PanelVerHistorialPaciente() {
		setBackground(new Color(204, 204, 153));
		JLabel lblCierreOperaciones = new JLabel("Historial Paciente ");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblTratamientos = new JLabel("Tratamientos");
		lblTratamientos.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCitas = new JLabel("Citas/Operaciones");
		lblCitas.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panelComboBox = new PanelComboBox("Paciente","ID");
		panelComboBox.setBackground(new Color(204, 204, 153));
		panel.add(panelComboBox);
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
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCitas)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblTratamientos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);

		tableVerHistorial = new JTable();
		tableVerHistorial.setBackground(new Color(204, 204, 204));
		Font font = new Font("Tahoma", Font.PLAIN, 16);
		tableVerHistorial.setFont(font);
		tableVerHistorial.getTableHeader().setFont(font);
		
		scrollPane.setViewportView(tableVerHistorial);
		setLayout(groupLayout);
		
		
		
		
		/*String nombresColumnas[]={"Paciente	","tipo","fecha", "medico"};
		String data[][]={{"Gonzalo Berceo, Jonathan","Consulta primaria","16/06/2019","Jovellanos pursuy,Benito"}};
		tableConsultas = new JTable();
		tableConsultas.setFont(font);
		tableConsultas.getTableHeader().setFont(font);
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,nombresColumnas);
		tableConsultas.setModel(defaultTableModel);
		scrollPane.setViewportView(tableConsultas);
		setLayout(groupLayout);*/
		
		
	}
	


	
	public JComboBox getComboBoxIDHistorial() {
		return panelComboBox.getComboBoxID();
	}
	public JComboBox getComboBoxNombreHistorial() {
		return panelComboBox.getComboBoxNombre();
	}
	public JTable getTableVerHistorial() {
		return tableVerHistorial;
	}

	public void setTableVerHistorial(JTable tableVerHistorial) {
		this.tableVerHistorial = tableVerHistorial;
	}
}