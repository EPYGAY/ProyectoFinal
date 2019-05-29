package vistasFran;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class PanelCombobox extends JPanel{
	public PanelCombobox() {
		setLayout(null);
		
		JLabel label = new JLabel("Nombre");
		label.setBounds(25, 5, 58, 21);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(label);
		
		JComboBox cbxName = new JComboBox();
		cbxName.setBounds(93, 5, 167, 21);
		add(cbxName);
		
		JLabel label_1 = new JLabel("ID");
		label_1.setBounds(288, 5, 18, 21);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(label_1);
		
		JComboBox cbxId = new JComboBox();
		cbxId.setBounds(316, 5, 96, 20);
		add(cbxId);
	}

}
