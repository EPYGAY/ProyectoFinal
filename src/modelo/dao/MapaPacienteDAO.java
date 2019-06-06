package modelo.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.dto.MapaPacienteDTO;
import modelo.dto.PacienteDTO;

public class MapaPacienteDAO implements Serializable{
	private static MapaPacienteDAO utils;
	private MapaPacienteDTO mapaPaciente;
	private final String ARCHIVO = "mapas/mapaPaciente.map";

	/**
	 * Constructor de la clase Utils
	 */
	public MapaPacienteDAO() {
		obtenerMapa();
	}

	/**
	 * Obtiene una nueva instancia de la clase Utils
	 * 
	 * @return
	 */
	public static MapaPacienteDAO getInstance() {
		if (utils == null)
			utils = new MapaPacienteDAO();
		return utils;
	}

	/**
	 * Registra un nuevo usuario en el mapa
	 */
	public void registrarPaciente(PacienteDTO paciente) {
		mapaPaciente.agregarNuevoPaciente(Long.toString(paciente.getID()), paciente.getNombre());
		guardarMapa();

	}

	/**
	 * Actualiza al usuario en el mapa
	 */
	public void actualizarPaciente(PacienteDTO paciente) {

		mapaPaciente.agregarNuevoPaciente(Long.toString(paciente.getID()), paciente.getNombre());
		guardarMapa();

	}

	/**
	 * Recupera un usuario del mapa de usuarios con el número de cuenta
	 * 
	 * @param noCuenta
	 * @return
	 */
	public String getPaciente(Long id) {
		return mapaPaciente.obtenerPaciente(Long.toString(id));
	}

	/**
	 * Guarda el mapa en el archivo que ya había sido generado por el Administrador
	 */
	private void guardarMapa() {
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(ARCHIVO));
			output.writeObject(mapaPaciente);
			output.close();
		} catch (IOException ex) {
			Logger.getLogger(MapaPacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * Obtiene el mapa del archivo plano que es generado por el Administrador
	 */
	private void obtenerMapa() {
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(ARCHIVO));
			try {
				mapaPaciente = (MapaPacienteDTO) input.readObject();
			} catch (ClassNotFoundException ex) {
				mapaPaciente = MapaPacienteDTO.getInstance();
			} catch (EOFException ex) {
				input.close();
			} catch (IOException ex) {
				Logger.getLogger(MapaPacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
			}
		} catch (FileNotFoundException ex) {
			mapaPaciente = MapaPacienteDTO.getInstance();
		} catch (IOException ex) {
			Logger.getLogger(MapaPacienteDTO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
