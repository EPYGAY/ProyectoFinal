package vistas.medico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.comunes.PanelComboBox;
import vista.comunes.PanelDatosPersonales;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConsultaBajaMedico extends JPanel {
	
	private PanelAltaMedico panelAltaBajaMedico;
	private PanelComboBox panelCombo;
	private JButton btnBaja;
	public PanelConsultaBajaMedico(String name,boolean mostrarBtnBaja) {
		setBackground(new Color(240, 230, 140));
		
		JLabel lblConsultaMedico = new JLabel(name);
		lblConsultaMedico.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panelCombo=new PanelComboBox("Medido", "ID");
		panelCombo.setBackground(new Color(240, 230, 140));
		panel.add(panelCombo);
		panelAltaBajaMedico = new PanelAltaMedico("",false);
		panelAltaBajaMedico.getPanelDatosPersonales().setBackground(new Color(240, 230, 140));
		panelAltaBajaMedico.setBackground(new Color(240, 230, 140));
		
		btnBaja = new JButton("BAJA");
		btnBaja.setVisible(mostrarBtnBaja);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
								.addComponent(lblConsultaMedico, Alignment.LEADING))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnBaja, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(88)
							.addComponent(panelAltaBajaMedico, GroupLayout.PREFERRED_SIZE, 649, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblConsultaMedico)
							.addGap(18)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnBaja, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelAltaBajaMedico, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE)
					.addGap(68))
		);
		setLayout(groupLayout);
	}
	
	public JComboBox getComboId() {
		return panelCombo.comboBoxID;
	}
	
	public PanelDatosPersonales getPanelDatosPersonales() {
		return panelAltaBajaMedico.getPanelDatosPersonales();
	}
	
	public JButton getBtnBaja() {
		return btnBaja;
	}
}
