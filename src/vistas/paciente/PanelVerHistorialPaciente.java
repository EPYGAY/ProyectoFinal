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
import vista.comunes.PanelDatosPersonales;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelVerHistorialPaciente extends JPanel {
	private JTable tableConsultas;
	private JTable tableTratamiento;
	public PanelComboBox panelComboBox;
	public PanelDatosPersonales panelDatosPersonales;

	public PanelDatosPersonales getPanelDatosPersonales() {
		return panelDatosPersonales;
	}

	public void setPanelDatosPersonales(PanelDatosPersonales panelDatosPersonales) {
		this.panelDatosPersonales = panelDatosPersonales;
	}

	public PanelVerHistorialPaciente() {
		
		
		setBackground(new Color(240, 230, 140));
		JLabel lblCierreOperaciones = new JLabel("Historial Paciente ");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblTratamientos = new JLabel("Tratamientos");
		
		JLabel lblCitas = new JLabel("Citas/Operaciones");
		panelComboBox = new PanelComboBox("Paciente", "id");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCitas)
						.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelComboBox, GroupLayout.PREFERRED_SIZE, 701, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTratamientos)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(panelComboBox, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblCitas)
					.addGap(36)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblTratamientos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(114, Short.MAX_VALUE))
		);
		
		String nombresColumnasT[]={"Paciente","medicamento","posologia", "fecha inicio", "fecha fin"};
		String dataT[][]={/*datos a rellenar*/};
		Font font = new Font("Tahoma", Font.PLAIN, 16);
		DefaultTableModel defaultTableModelT = new DefaultTableModel(dataT,nombresColumnasT);
		tableTratamiento = new JTable(defaultTableModelT);
		tableTratamiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane_1.setViewportView(tableTratamiento);
		
		
		
		
		String nombresColumnas[]={"Paciente	","tipo","fecha", "medico"};
		String data[][]={/*datos a rellenar*/};
		tableConsultas = new JTable();
		tableConsultas.setFont(font);
		tableConsultas.getTableHeader().setFont(font);
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,nombresColumnas);
		tableConsultas.setModel(defaultTableModel);
		scrollPane.setViewportView(tableConsultas);
		setLayout(groupLayout);
		
		
	}

	public PanelComboBox getPanelComboBox() {
		return panelComboBox;
	}

	public void setPanelComboBox(PanelComboBox panelComboBox) {
		this.panelComboBox = panelComboBox;
	}
	public JComboBox getComboId() {
		return panelComboBox.comboBoxID;
	}
	

}