package vistaEjemplo.consultas;
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

public class CierreOperacion extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CierreOperacion() {
		
		JLabel lblCierreOperaciones = new JLabel("Cierre Operaciones");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label = new JLabel("Mensaje");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel label_1 = new JLabel(" ");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		label_1.setBackground(Color.WHITE);
		
		JButton button = new JButton("Aplicar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGap(71)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 804, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(lblCierreOperaciones, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(56))
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
