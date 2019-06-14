package vistas.controlador;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import control.logica.Item;
import modelo.vista.CitaMV;
import vistas.paciente.PanelConsultarCitas;
import vistas.paciente.PanelPedirCitaPaciente;

public class ControladorPanelPedirCitaPaciente {

	public CitaMV obtenerDatos(PanelPedirCitaPaciente panelPedirCitaPaciente) {
		CitaMV modelo = new CitaMV();
		modelo.setIdMedico(getIdFromComboBox((Item) panelPedirCitaPaciente.getComboBoxIDDoctorCItaPaciente().getSelectedItem()));
		modelo.setIdPaciente(getIdFromComboBox((Item) panelPedirCitaPaciente.getPanelComboBoxNombre().getSelectedItem()));
		modelo.setFecha(panelPedirCitaPaciente.getNombreBoton());
		return modelo;

	}

	private String getIdFromComboBox(Item item) {
		return String.valueOf(item.getId());

	}

	public void rellenarTablaCita(PanelConsultarCitas panel, ArrayList<CitaMV> lista) {
		String nombresColumnas[] = { "Paciente	", "tipo", "fecha", "medico" };
		String[][] data = new String[lista.size()][4];
		for (int i = 0; i < lista.size(); i++) {
			CitaMV cita = lista.get(i);
			String nombrePaciente = cita.getApellidoPaciente() + " ," + cita.getNombrePaciente();
			String tipo="";
			if(null!=cita.getEspecialidad()) {
			 tipo = cita.getEspecialidad().toString();
			}
			String fecha="";
			if(null!=cita.getFecha()) {
			 fecha = cita.getFecha().toString();
			}
			String doctor = cita.getNombreMedico();
			data[i][0] = nombrePaciente;
			data[i][1] = tipo;
			data[i][2] = fecha;
			data[i][3] = doctor;

		}

		DefaultTableModel defaultTableModel = new DefaultTableModel(data, nombresColumnas);
		panel.getTable().setModel(defaultTableModel);

	}

}
