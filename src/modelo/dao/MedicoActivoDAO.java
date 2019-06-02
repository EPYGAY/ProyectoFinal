package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.acceso.AccesoFichero;
import modelo.dto.MedicoActivo;

public class MedicoActivoDAO {

		private String rutaCarpeta = "medicoActivo";
		private String extension = ".med";

		public MedicoActivoDAO() {

		}

		public boolean guardar(MedicoActivo medico) {
			Long IDmedico = obtnerIDmedicoActivo();
			medico.setID(IDmedico);
			String path = rutaCarpeta + "/" + IDmedico + extension;
			AccesoFichero<MedicoActivo> acceso = new AccesoFichero<MedicoActivo>(path, true);
			return acceso.save(medico);
		}

		public MedicoActivo consultar(Long id) {
			String path = rutaCarpeta + "/" + String.valueOf(id) + extension;
			AccesoFichero<MedicoActivo> acceso = new AccesoFichero<MedicoActivo>(path, false);
			return acceso.getOne();
		}
		
		public boolean modificar(MedicoActivo medico) {
			String idPaciente=String.valueOf(medico.getID());
			String path = rutaCarpeta + "/" + idPaciente + extension;
			AccesoFichero<MedicoActivo> acceso = new AccesoFichero<MedicoActivo>(path, false);
			return acceso.override(medico);
		}

		public List<String> obtenerTodosLosId() {
			AccesoFichero<MedicoActivo> acceso = new AccesoFichero<>(rutaCarpeta, false);
			List<String> lista = acceso.listarElementosPorNombre();
			List<String> listaId= new ArrayList<>(); 
			for (String nombre : lista) {
				String idTexto = nombre.replace(extension, "");
				listaId.add(idTexto);
			}
			return lista;
		}

		private Long obtnerIDmedicoActivo() {
			AccesoFichero<MedicoActivo> acceso = new AccesoFichero<>(rutaCarpeta, false);
			List<String> lista = acceso.listarElementosPorNombre();
			Long idFinal = null;
			for (String nombre : lista) {
				String idTexto = nombre.replace(extension, "");
				Long idAux = new Long(idTexto);
				if (null == idFinal || idAux > idFinal) {
					idFinal = idAux;
				}
			}
			return idFinal;
		}
	}


