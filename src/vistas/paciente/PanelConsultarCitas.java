package vistas.paciente;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.comunes.PanelComboBox;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelConsultarCitas extends JPanel {
	private JTable table;
	PanelComboBox panelComboBox;
	/**
	 * Create the panel.
	 */
	public PanelConsultarCitas() {
		setBackground(new Color(204, 204, 153));

		JLabel lblCierreOperaciones = new JLabel("Citas Pendiente Paciente ");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panelComboBox=new PanelComboBox("Paciente", "ID");
		panelComboBox.setBackground(new Color(204, 204, 153));
		panel.add(panelComboBox);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 561, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		
		
		table = new JTable();
		table.setBackground(new Color(204, 204, 204));
		Font font = new Font("Tahoma", Font.PLAIN, 16);
		table.setFont(font);
		table.getTableHeader().setFont(font);
		
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}


	

	public JComboBox getComboBoxConsultarCitasIdPaciente() {
		return panelComboBox.getComboBoxID();
	}
	public JComboBox getComboBoxConsultarCitasNombrePaciente() {
		return panelComboBox.getComboBoxNombre();
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	
	
	
}