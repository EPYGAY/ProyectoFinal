package vista.comunes;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import utiles.Especialidad;

import java.awt.Color;

public class PanelDatosPersonales extends JPanel{
	
	public JTextField txtNombre;
	public JTextField txtaApellido;
	public JTextField txtDireccion;
	public JTextField txtID;
	public JTextField textNacimiento;
	public JTextField textTelefono;
	public JLabel lblNacimiento;
	public JLabel lblTelefono;
	public JLabel lblID;
	private JLabel lblEj;
	private JComboBox especialidad;
	private JTextField txtEspecialidad;
	
	


	public PanelDatosPersonales() {
		setBackground(new Color(240, 230, 140));
		
		
		
		lblID = new JLabel("ID");
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtNombre.setColumns(10);
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		txtaApellido = new JTextField();
		txtaApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtaApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtaApellido.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		txtDireccion = new JTextField();
		txtDireccion.setCaretColor(Color.LIGHT_GRAY);
		txtDireccion.setSelectedTextColor(Color.LIGHT_GRAY);
		txtDireccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		txtDireccion.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		txtID = new JTextField();
		txtID.setEnabled(false);
		txtID.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setColumns(10);
		
		textNacimiento = new JTextField();
		textNacimiento.setCaretColor(Color.LIGHT_GRAY);
		textNacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		textNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		textNacimiento.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setColumns(10);
		
		lblNacimiento = new JLabel("Nacimiento");
		lblNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblNacimiento.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		
		JLabel lblEjCalleO = new JLabel("Ej: Calle o Plaza o Avenida Libertad 12");
		lblEjCalleO.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		lblEj = new JLabel("Ej: 10/05/1999");
		lblEj.setFont(new Font("Tahoma", Font.PLAIN, 8));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(107, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblDireccion, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblApellido, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblID, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
							.addComponent(lblNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNacimiento, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEj, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtaApellido, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(textNacimiento, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEjCalleO))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtaApellido, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addComponent(lblEjCalleO)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNacimiento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNacimiento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEj, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		setLayout(groupLayout);
	}

	public JLabel getLblEj() {
		return lblEj;
	}

	public void setLblEj(JLabel lblEj) {
		this.lblEj = lblEj;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtaApellido() {
		return txtaApellido;
	}

	public void setTxtaApellido(JTextField txtaApellido) {
		this.txtaApellido = txtaApellido;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextField getTxtID() {
		return txtID;
	}

	public void setTxtID(JTextField txtID) {
		this.txtID = txtID;
	}

	public JTextField getTextNacimiento() {
		return textNacimiento;
	}

	public void setTextNacimiento(JTextField textNacimiento) {
		this.textNacimiento = textNacimiento;
	}

	public JTextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(JTextField textTelefono) {
		this.textTelefono = textTelefono;
	}

	public JLabel getLblNacimiento() {
		return lblNacimiento;
	}

	public void setLblNacimiento(JLabel lblNacimiento) {
		this.lblNacimiento = lblNacimiento;
	}

	public JLabel getLblTelefono() {
		return lblTelefono;
	}

	public void setLblTelefono(JLabel lblTelefono) {
		this.lblTelefono = lblTelefono;
	}
	public JComboBox getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(JComboBox especialidad) {
		this.especialidad = especialidad;
	}
	public void setEspecialidadValor(Especialidad especialidad) {
		this.especialidad.setSelectedItem(especialidad);;
	}

	public JTextField getTxtEspecialidad() {
		return txtEspecialidad;
	}

	public void setTxtEspecialidad(JTextField txtEspecialidad) {
		this.txtEspecialidad = txtEspecialidad;
	}
}
