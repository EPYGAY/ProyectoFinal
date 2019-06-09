package vistaUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import vista.comunes.PanelCierreOperacion;
import vista.comunes.PanelDatosPersonales;
import vista.comunes.PanelInicio;
import vista.comunes.PanelMensaje;
import vistas.medico.PanelAltaMedico;
import vistas.medico.PanelAtenderCitaMedico;
import vistas.medico.PanelConsultaBajaMedico;
import vistas.paciente.PanelAltaPaciente;
import vistas.paciente.PanelBajaModificacionConsultaPaciente;
import vistas.paciente.PanelConsultarCitas;
import vistas.paciente.PanelPedirCitaOperacionPaciente;
import vistas.paciente.PanelPedirCitaPrimarioyEspecialistaPaciente;
import vistas.paciente.PanelVerHistorialPaciente;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;

public class UI extends JFrame {

	private JPanel contentPane;
	//PANELES
	//
	 protected PanelInicio inicio=new PanelInicio();
	//Paciente
	 protected PanelAltaPaciente altaPaciente=new PanelAltaPaciente("ALTA PACIENTE", true, true, true, true, true,false,false, "imagenes\\altaPaciente.png");
	 protected PanelBajaModificacionConsultaPaciente bajaPaciente=new PanelBajaModificacionConsultaPaciente("BAJA PACIENTE",false,false,false,false,false,true,true,"imagenes\\bajaPacente.png");
	 protected  PanelBajaModificacionConsultaPaciente consultaPaciente= new PanelBajaModificacionConsultaPaciente("CONSULTA PACINETE", false,false,false,false,false,true,false,"imagenes\\consultarPaciente.png");
	 protected  PanelBajaModificacionConsultaPaciente modificacionPaciente=new PanelBajaModificacionConsultaPaciente("MODIFICACION PACIENTE",false,false,true,true,false,true,true,"imagenes\\modificarPaciente.png");
	 protected  PanelConsultarCitas consultaCitaPaciente=new PanelConsultarCitas();
	 protected  PanelVerHistorialPaciente verHistotialPaciente=new PanelVerHistorialPaciente();
	//Medico
	 protected PanelAltaMedico altaMedico= new PanelAltaMedico("ALTA MEDICO");
	 protected PanelConsultaBajaMedico bajaMedico= new PanelConsultaBajaMedico("BAJA MEDICO",true);
	 protected PanelConsultaBajaMedico consultaMedico= new PanelConsultaBajaMedico("CONSULTA MEDICO",false);
	 protected PanelAtenderCitaMedico atenderCitaMedico= new PanelAtenderCitaMedico();
	 protected PanelPedirCitaPrimarioyEspecialistaPaciente citaPrimario= new PanelPedirCitaPrimarioyEspecialistaPaciente("CITA ATENCION PRIMARIA","Medico",true,true);
	 protected PanelPedirCitaPrimarioyEspecialistaPaciente citaEspecialista= new PanelPedirCitaPrimarioyEspecialistaPaciente("CITA ESPECIALISTA","Especialista",false,false);
	 protected PanelPedirCitaOperacionPaciente operacion= new PanelPedirCitaOperacionPaciente();
	 //Operacion
	 protected PanelCierreOperacion cierreOperacion= new PanelCierreOperacion();
	 private JTextField fecha;
	 private JTextField hora;
	
	
	public UI() {

		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 50, 1200, 690);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setForeground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane.add(inicio);
		//PACIENTE
		contentPane.add(altaPaciente,"PanelAltaPaciente");
		contentPane.add(bajaPaciente,"PanelBajaPaciente");
		contentPane.add(consultaPaciente,"PanelConsultaPaciente");
		contentPane.add(modificacionPaciente,"PanelModificacionPaciente");
		contentPane.add(citaPrimario,"PanelPedirCitaPrimarioPaciente");
		contentPane.add(citaEspecialista,"PanelPedirCitaEspecialistaPaciente");
		contentPane.add(operacion,"PanelPedirCitaOperacionPaciente");
		contentPane.add(consultaCitaPaciente,"PanelConsultaCitaPaciente");
		contentPane.add(verHistotialPaciente,"PanelVerHistorialPaciente");
		
		//MEDICO
		contentPane.add(altaMedico,"PanelAltaMedico");
		contentPane.add(bajaMedico,"PanelBajaMedico");
		contentPane.add(consultaMedico,"PanelConsultaMedico");
		contentPane.add(atenderCitaMedico,"PanelAtenderCitaMedico");
		
		//OPERACION
		contentPane.add(cierreOperacion,"PanelCierreOperacion");
		
		
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

		JMenu mnPaciente = new JMenu("   Paciente   ");
		
		
		mnPaciente.setBackground(new Color(218, 165, 32));
		mnPaciente.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnPaciente);
//ALTA PACIENTE
		JMenuItem mntmAlta = new JMenuItem("Alta");
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelAltaPaciente");
			}
		});
		mntmAlta.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAlta.setFont(new Font("Alef", Font.BOLD, 20));
		mntmAlta.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmAlta);
//BAJA PACIENTE
		
		JMenuItem mntmBaja = new JMenuItem("Baja");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelBajaPaciente");
			}
		});
		mntmBaja.setHorizontalAlignment(SwingConstants.CENTER);
		mntmBaja.setFont(new Font("Alef", Font.BOLD, 20));
		mntmBaja.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmBaja);
	
//MODIFICACION PACIENTE
		JMenuItem mntmModificacion = new JMenuItem("Modificacion");
		mntmModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelModificacionPaciente");
			}
		});
		mntmModificacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmModificacion.setFont(new Font("Alef", Font.BOLD, 20));
		mntmModificacion.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmModificacion);
//CONSULTA PACIENTE 
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelConsultaPaciente");
			}
		});
		mntmConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsulta.setFont(new Font("Alef", Font.BOLD, 20));
		mntmConsulta.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmConsulta);

		JMenuItem mntmPedirCitaPrimaria = new JMenuItem("Pedir Cita Primaria");
		mntmPedirCitaPrimaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelPedirCitaPrimarioPaciente");
				
			}
		});
		mntmPedirCitaPrimaria.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirCitaPrimaria.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirCitaPrimaria.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirCitaPrimaria);

		JMenuItem mntmPedirCitaEspecialista = new JMenuItem("Pedir Cita Especialista");
		mntmPedirCitaEspecialista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelPedirCitaEspecialistaPaciente");
			}
		});
		mntmPedirCitaEspecialista.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirCitaEspecialista.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirCitaEspecialista.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirCitaEspecialista);

		JMenuItem mntmPedirOperacion = new JMenuItem("Pedir Operacion");
		mntmPedirOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelPedirCitaOperacionPaciente");
				
			}
		});
		mntmPedirOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmPedirOperacion.setFont(new Font("Alef", Font.BOLD, 20));
		mntmPedirOperacion.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmPedirOperacion);

		JMenuItem mntmConsultarCitas = new JMenuItem("Consultar citas");
		mntmConsultarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelConsultaCitaPaciente");
			}
		});
		mntmConsultarCitas.setHorizontalAlignment(SwingConstants.CENTER);
		mntmConsultarCitas.setFont(new Font("Alef", Font.BOLD, 20));
		mntmConsultarCitas.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmConsultarCitas);

		JMenuItem mntmVerHistorial = new JMenuItem("Ver Historial");
		mntmVerHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelVerHistorialPaciente");
			}
		});
		mntmVerHistorial.setHorizontalAlignment(SwingConstants.CENTER);
		mntmVerHistorial.setFont(new Font("Alef", Font.BOLD, 20));
		mntmVerHistorial.setBackground(new Color(204, 102, 102));
		mnPaciente.add(mntmVerHistorial);

		JMenu mnMedico = new JMenu("   Medico   ");
		
		mnMedico.setBackground(new Color(139, 0, 139));
		mnMedico.setHorizontalAlignment(SwingConstants.CENTER);
		mnMedico.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnMedico);

		JMenuItem mntmAlta_1 = new JMenuItem("Alta");
		mntmAlta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelAltaMedico");
			}
		});
		mntmAlta_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAlta_1.setBackground(new Color(102, 102, 255));
		mntmAlta_1.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmAlta_1);

		JMenuItem mntmBaja_1 = new JMenuItem("Baja");
		mntmBaja_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelBajaMedico");
			}
		});
		mntmBaja_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmBaja_1.setBackground(new Color(102, 102, 255));
		mntmBaja_1.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmBaja_1);

		JMenuItem mntmAtenderCita = new JMenuItem("Atender cita");
		mntmAtenderCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelAtenderCitaMedico");
			}
		});
		
		JMenuItem menuItemConsulta = new JMenuItem("Consulta");
		menuItemConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("PanelConsultaMedico");
			}
		});
		menuItemConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		menuItemConsulta.setFont(new Font("Alef", Font.BOLD, 22));
		menuItemConsulta.setBackground(new Color(102, 102, 255));
		mnMedico.add(menuItemConsulta);
		mntmAtenderCita.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAtenderCita.setBackground(new Color(102, 102, 255));
		mntmAtenderCita.setFont(new Font("Alef", Font.BOLD, 22));
		mnMedico.add(mntmAtenderCita);

		JMenu mnOperacion = new JMenu("   Operacion   ");
		mnOperacion.setBackground(new Color(139, 69, 19));
		mnOperacion.setFont(new Font("Alef", Font.PLAIN, 32));
		menuBar.add(mnOperacion);

		JMenuItem mntmCerrarOperacion = new JMenuItem("Cerrar Operacion");
		mntmCerrarOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("PanelCierreOperacion");
			}
		});
		mntmCerrarOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		mntmCerrarOperacion.setBackground(new Color(255, 204, 153));
		mntmCerrarOperacion.setFont(new Font("Alef", Font.BOLD, 22));
		mnOperacion.add(mntmCerrarOperacion);
		
		hora = new JTextField();
		hora.setForeground(new Color(0, 0, 0));
		hora.setBackground(new Color(184, 134, 11));
		hora.setBorder(new LineBorder(new Color(171, 173, 179), 0));
		hora.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		fecha = new JTextField();
		fecha.setForeground(new Color(0, 0, 0));
		fecha.setBackground(new Color(184, 134, 11));
		fecha.setBorder(new LineBorder(new Color(171, 173, 179), 0));
		fecha.setHorizontalAlignment(SwingConstants.RIGHT);
		fecha.setFont(new Font("Tahoma", Font.BOLD, 22));
		fecha.setEditable(false);
		menuBar.add(fecha);
		fecha.setColumns(10);
		hora.setFont(new Font("Tahoma", Font.BOLD, 22));
		hora.setEditable(false);
		menuBar.add(hora);
		hora.setColumns(10);
		
		 //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat(" dd / MM / YYYY ");
        fecha.setText(formato.format(sistFecha));
        //HORA
        Timer tiempo=new Timer(100, new UI.horas());
        tiempo.start();
		

	}
	private void asociarPanel(String string) {
		((CardLayout)contentPane.getLayout()).show(contentPane,string);
	}
	public PanelMensaje getTMensaje() {
		return altaPaciente.getPanelMensaje();
	}
	
	//PACIENTE
	
	public PanelDatosPersonales getPanelDatosPersonalesAltaPaciente() {
		return altaPaciente.getPanelDatosPersonales();
	}
	public PanelDatosPersonales getPanelDatosPersonalesModificacionPaciente() {
		return modificacionPaciente.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPersonalesBajaPaciente() {
		return bajaPaciente.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPersonalesConsultaPaciente() {
		return consultaPaciente.getPanelDatosPersonales();
	}

	public JComboBox getComboBoxIdBajaPaciente() {
		return bajaPaciente.getComboBoxId();
	}
	public JComboBox getComboBoxNombreBajaPaciente() {
		return bajaPaciente.getComboBoxNombre();
	}
	
	public JComboBox getComboBoxIdModificacionPaciente() {
		return modificacionPaciente.getComboBoxId();
	}

	public JComboBox getComboBoxNombreModificacionPaciente() {
		return modificacionPaciente.getComboBoxNombre();
	}
	
	public JComboBox getComboBoxIdConsultaPaciente() {
		return consultaPaciente.getComboBoxId();
	}
	public JComboBox getComboBoxNombreConsultaPaciente() {
		return consultaPaciente.getComboBoxNombre();
	}
	
	//DOCTOR
	
	public PanelDatosPersonales getPanelDatosPersonalesConsultaDoctor() {
		return consultaMedico.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPersonalesBajaDoctor() {
		return bajaMedico.getPanelDatosPersonales();
	}
	
	public PanelDatosPersonales getPanelDatosPesonalesAltaDoctor() {
		return altaMedico.getPanelDatosPersonales();
	}

	public JComboBox getComboBoxIdBajaDoctor() {
		return bajaMedico.getComboId();
	}

	public JComboBox getComboBoxNombreBajaDoctor() {
		return bajaMedico.getComboNombre();
	}
	public JComboBox getComboBoxIdConsultaDoctor() {
		return consultaMedico.getComboId();
	}

	public JComboBox getComboBoxNombreConsultaDoctor() {
		return consultaMedico.getComboNombre();
	}
	
	 class horas implements ActionListener{
		    
	        public void actionPerformed(ActionEvent e){
	            Date sistHora=new Date();
	            String pmAm="hh:mm:ss a";
	            SimpleDateFormat format=new SimpleDateFormat(pmAm);
	            Calendar hoy=Calendar.getInstance();
	            hora.setText(String.format(format.format(sistHora),hoy));
	            
	                  
	        }
	 }
	
	
}
