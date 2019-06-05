package vista.comunes;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class PanelCierreOperacion extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelCierreOperacion() {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblCierreOperaciones = new JLabel("Cierre Operaciones");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panelMensajeCierreOperacion = new JPanel();
		panelMensajeCierreOperacion.setLayout(new BorderLayout(0, 0));
		panelMensajeCierreOperacion.add(new PanelMensaje());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(279, Short.MAX_VALUE)
					.addComponent(panelMensajeCierreOperacion, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
					.addGap(233))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelMensajeCierreOperacion, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(129, Short.MAX_VALUE))
		);
		
		String nombresColumnas[]={"Paciente	","operacion","cirujano", "resultado"};
		String data[][]={{"Gonzalo Berceo, Jonathan","Amigdalas","Jovellanos pursuy,Benito",""}};
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