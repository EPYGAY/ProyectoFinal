package modelo.dto;

import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import modelo.dao.DAOColecciones;

public class MapaPacienteDTO implements Serializable{
	private static MapaPacienteDTO mapaPaciente; 
	private Map<String, String> mapa;
	
	private MapaPacienteDTO(){ 
        mapa = new TreeMap<String, String>(); 
    } 
	public static MapaPacienteDTO getInstance(){ 
        if(mapaPaciente == null) 
        	mapaPaciente = new MapaPacienteDTO(); 
        return mapaPaciente; 
    } 
	
	public void agregarNuevoPaciente(String id,String nombre){ 
        mapa.put(id,nombre); 
    } 
	public String obtenerPaciente(String id){ 
        return mapa.get(id); 
    } 
	protected Set<Entry<String, String>> entrySet() { 
        return mapa.entrySet(); 
    } 
	}


