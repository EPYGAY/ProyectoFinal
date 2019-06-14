package vista.comunes;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Botonera extends JPanel {

	public JButton botones[][];
	int ladoBoton = 150, ladoBoton2 = 45;

	/**
	 * Create the panel.
	 */

	public Botonera(int x, int y) {
		setBackground(new Color(240, 230, 140));
		this.setBounds(x, y, 700, 401);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 500, Short.MAX_VALUE));
		groupLayout
				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 500, Short.MAX_VALUE));
		setLayout(groupLayout);
		iniciarBotonera();
	}

	private void iniciarBotonera() {
		int horaInicial = 8;
		final int DIAS_SEMANAS=5;
		this.botones = new JButton[8][5];
		int x = 0, y = 0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(String.valueOf(i) + String.valueOf(j));

				for (int z = 0; z < DIAS_SEMANAS; z++) {
					if (i<2) {
						this.botones[i][j].setText("0"+horaInicial + ":00");
					}else {
						this.botones[i][j].setText(horaInicial + ":00");
					}
				}
				this.botones[i][j].setBounds(x, y, this.ladoBoton, this.ladoBoton2);
				this.botones[i][j].setBackground(Color.WHITE);
				this.botones[i][j].setFont(new Font("Tahoma", 0, 35));
				this.botones[i][j].setForeground(Color.BLACK);
				this.add(this.botones[i][j]);
			
				x += this.ladoBoton;
				
			}
			horaInicial++;
			x = 0;
			y += this.ladoBoton2;
		}
		
		
		
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						fondoBlanco();
						JButton miBoton = ((JButton) e.getSource());
						
						if (miBoton.getBackground()==Color.MAGENTA) {
							miBoton.setBackground(Color.WHITE);
						}else {
							miBoton.setBackground(Color.MAGENTA);
						}
						
						

					}

				});
			}

		}
		
	}

	public void fondoBlanco() {
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j].setBackground(Color.WHITE);
			}
			}
	}
	

	public JButton[][] getBotones() {
		return botones;
	}

	public void setBotones(JButton[][] botones) {
		this.botones = botones;
	}
}
