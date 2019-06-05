package vista.comunes;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
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
	
	public PanelDatosPersonales() {
		setBackground(new Color(240, 230, 140));
		
		
		
		lblID = new JLabel("ID");
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtNombre.setColumns(10);
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		txtaApellido = new JTextField();
		txtaApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtaApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtaApellido.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setHorizontalAlignment(SwingConstants.TRAILING);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		txtDireccion.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		txtID = new JTextField();
		txtID.setEnabled(false);
		txtID.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setColumns(10);
		
		textNacimiento = new JTextField();
		textNacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		textNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		textNacimiento.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setFont(new Font("Tahoma", Font.BOLD, 14));
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setColumns(10);
		
		lblNacimiento = new JLabel("Nacimiento");
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(95, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblDireccion, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblApellido, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblID, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
							.addComponent(lblNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblTelefono, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNacimiento, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtaApellido, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
							.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
						.addComponent(textNacimiento, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textTelefono, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNacimiento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNacimiento, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
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

	
}
