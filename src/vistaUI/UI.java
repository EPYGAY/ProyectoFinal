package vistaUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import vistasMedico.PanelAltaBajaMedico;
import vistasMedico.PanelAtenderCitaMedico;
import vistasMedico.PanelConsultaMedico;
import vistasPaciente.PanelAltaPaciente;
import vistasPaciente.PanelBajaModificacionConsultaPaciente;
import vistasPaciente.PanelPedirCitaPrimarioyEspecialistaPaciente;
import vistasPaciente.PanelPedirCitaOperacionPaciente;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JMenuItem mntmAlta;
	private JMenuItem mntmBaja;
	private JMenuItem mntmModificacion;
	private JMenuItem mntmConsulta;
	private JMenuItem mntmPedirCitaPrimaria;
	private JMenuItem mntmPedirCitaEspecialista;
	private JMenuItem mntmPedirOperacion;
	private JMenuItem mntmConsultarCitas;
	private JMenuItem mntmVerHistorial;
	protected PanelAltaPaciente alta=new PanelAltaPaciente();

	public UI() {
		
		
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 50, 1200, 690);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 51));
		contentPane.setForeground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		//Los paneles
		
		contentPane.add(alta,"PanelAltaPaciente");
		
		PanelBajaModificacionConsultaPaciente baja=new PanelBajaModificacionConsultaPaciente("BAJA PACIENTE",true,true,true,true,true);
		contentPane.add(baja,"PanelBajaModificacionConsultaPaciente");
		
		PanelBajaModificacionConsultaPaciente modificacion=new PanelBajaModificacionConsultaPaciente("MODIFICACION PACIENTE",false,false,false,false,true);
		contentPane.add(modificacion,"PanelBajaModificacionConsultaPaciente");
		
		PanelBajaModificacionConsultaPaciente consulta= new PanelBajaModificacionConsultaPaciente("CONSULTA PACINETE", true,true,true,true,true);
		contentPane.add(consulta,"PanelBajaModificacionConsultaPaciente");
		
		PanelPedirCitaPrimarioyEspecialistaPaciente citaPrimario= new PanelPedirCitaPrimarioyEspecialistaPaciente("CITA ATENCION PRIMARIA","Medico");
		contentPane.add(citaPrimario,"PanelPedirCitaPrimarioyEspecialistaPaciente");
		
		PanelPedirCitaPrimarioyEspecialistaPaciente citaEspecialista= new PanelPedirCitaPrimarioyEspecialistaPaciente("CITA ESPECIALISTA","Especialista");
		contentPane.add(citaEspecialista,"PanelPedirCitaPrimarioyEspecialistaPaciente");
		
		PanelPedirCitaOperacionPaciente operacion= new PanelPedirCitaOperacionPaciente();
		contentPane.add(operacion,"PanelPedirCitaOperacionPaciente");
		
		PanelAltaBajaMedico altaMedico= new PanelAltaBajaMedico("ALTA MEDICO");
		contentPane.add(altaMedico,"PanelAltaBajaMedico");
		
		PanelAltaBajaMedico bajaMedico= new PanelAltaBajaMedico("BAJA MEDICO");
		contentPane.add(bajaMedico,"PanelAltaBajaMedico");
		
		PanelConsultaMedico consultaMedico= new PanelConsultaMedico();
		contentPane.add(consultaMedico,"PanelConsultaMedico");
		
		PanelAtenderCitaMedico atenderCitaMedico= new PanelAtenderCitaMedico();
		contentPane.add(atenderCitaMedico,"PanelAtenderCitaMedico");

		JPanel panelinicio = new JPanel();
		panelinicio.setBackground(new Color(204, 204, 51));
		contentPane.add(panelinicio, "name_969325539976868");
		panelinicio.setLayout(new CardLayout(0, 0));

		JLabel lblClinicaEpyGay = new JLabel("CLINICA EPYGAY");
		lblClinicaEpyGay.setBackground(new Color(204, 204, 51));
		lblClinicaEpyGay.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblClinicaEpyGay.setHorizontalAlignment(SwingConstants.CENTER);
		panelinicio.add(lblClinicaEpyGay, "inicio");

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		menuBar.setBackground(new Color(204, 204, 51));
		menuBar.setForeground(new Color(0, 0, 0));
		setJMenuBar(menuBar);

		JMenu mnPaciente = new JMenu("Paciente");
		mnPaciente.setBackground(new Color(204, 204, 51));
		mnPaciente.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnPaciente);

		mntmAlta = new JMenuItem("Alta");
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelAltaPaciente");
			}
		});
		mntmAlta.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAlta.setFont(new Font("Alef", Font.BOLD, 20));
		mntmAlta.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmAlta);

		mntmBaja = new JMenuItem("Baja");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelBajaModificacionConsultaPaciente");
			}
		});
		mntmBaja.setHorizontalAlignment(SwingConstants.CENTER);
		mntmBaja.setFont(new Font("Alef", Font.BOLD, 20));
		mntmBaja.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmBaja);

		mntmModificacion = new JMenuItem("Modificacion");
		mntmModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelBajaModificacionConsultaPaciente");
			}
		});
		mntmModificacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmModificacion.setFont(new Font("Alef", Font.BOLD, 20));
		mntmModificacion.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmModificacion);

		mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelBajaModificacionConsultaPaciente");
			}
		});
		mntmConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsulta.setFont(new Font("Alef", Font.BOLD, 20));
		mntmConsulta.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmConsulta);

		mntmPedirCitaPrimaria = new JMenuItem("Pedir Cita Primaria");
		mntmPedirCitaPrimaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelPedirCitaPrimarioyEspecialistaPaciente");
				
			}
		});
		mntmPedirCitaPrimaria.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirCitaPrimaria.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirCitaPrimaria.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirCitaPrimaria);

		mntmPedirCitaEspecialista = new JMenuItem("Pedir Cita Especialista");
		mntmPedirCitaEspecialista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelPedirCitaPrimarioyEspecialistaPaciente");
			}
		});
		mntmPedirCitaEspecialista.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirCitaEspecialista.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirCitaEspecialista.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirCitaEspecialista);

		mntmPedirOperacion = new JMenuItem("Pedir Operacion");
		mntmPedirOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelPedirCitaOperacionPaciente");
				
			}
		});
		mntmPedirOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirOperacion.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirOperacion.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirOperacion);

		mntmConsultarCitas = new JMenuItem("Consultar citas");
		mntmConsultarCitas.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsultarCitas.setFont(new Font("Alef", Font.BOLD, 20));
		mntmConsultarCitas.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmConsultarCitas);

		mntmVerHistorial = new JMenuItem("Ver Historial");
		mntmVerHistorial.setHorizontalAlignment(SwingConstants.CENTER);
		mntmVerHistorial.setFont(new Font("Alef", Font.BOLD, 20));
		mntmVerHistorial.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmVerHistorial);

		JMenu mnMedico = new JMenu("Medico");
		mnMedico.setBackground(new Color(204, 204, 51));
		mnMedico.setHorizontalAlignment(SwingConstants.CENTER);
		mnMedico.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnMedico);

		JMenuItem mntmAltaMedico = new JMenuItem("Alta");
		mntmAltaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelAltaBajaMedico");
			}
		});
		mntmAltaMedico.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAltaMedico.setBackground(new Color(102, 102, 255));
		mntmAltaMedico.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmAltaMedico);

		JMenuItem mntmBajaMedico = new JMenuItem("Baja");
		mntmBajaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelAltaBajaMedico");
			}
		});
		mntmBajaMedico.setHorizontalAlignment(SwingConstants.CENTER);
		mntmBajaMedico.setBackground(new Color(102, 102, 255));
		mntmBajaMedico.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmBajaMedico);

		JMenuItem mntmConsultaMedico = new JMenuItem("Consulta");
		mntmConsultaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelConsultaMedico");
			}
		});
		mntmConsultaMedico.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsultaMedico.setBackground(new Color(102, 102, 255));
		mntmConsultaMedico.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmConsultaMedico);

		JMenuItem mntmAtenderCitaMedico = new JMenuItem("Atender cita");
		mntmAtenderCitaMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelAtenderCitaMedico");
			}
		});
		mntmAtenderCitaMedico.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAtenderCitaMedico.setBackground(new Color(102, 102, 255));
		mntmAtenderCitaMedico.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmAtenderCitaMedico);

		JMenu mnOperacion = new JMenu("Operacion");
		mnOperacion.setBackground(new Color(204, 204, 51));
		mnOperacion.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnOperacion);

		JMenuItem mntmCerrarOperacion = new JMenuItem("Cerrar Operacion");
		mntmCerrarOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmCerrarOperacion.setBackground(new Color(255, 204, 153));
		mntmCerrarOperacion.setFont(new Font("Alef", Font.BOLD, 22));
		mnOperacion.add(mntmCerrarOperacion);

		

	}
	private void asociarPanel(String string) {
		((CardLayout)contentPane.getLayout()).show(contentPane,string);
	}

}
