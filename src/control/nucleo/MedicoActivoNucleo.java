package control.nucleo;

import modelo.dao.MedicoActivoDAO;
import modelo.dto.MedicoActivo;
import modelo.vista.MedicoActivoMV;

public class MedicoActivoNucleo {
private MedicoActivoDAO dao= new MedicoActivoDAO();
	
	public MedicoActivoNucleo() {
	}
	
	public boolean altaPaciente(MedicoActivoMV medico) {
		MedicoActivo medicoActivo= new MedicoActivo();
		medicoActivo.setNombre(medico.getNombre());
		medicoActivo.setApellidos(medico.getApellidos());
		medicoActivo.setDireccion(medico.getDireccion());
		medicoActivo.setTelefono(medico.getTelefono());
		return  dao.guardar(medicoActivo);
	}
	
	
	
	public boolean bajarPaciente(MedicoActivo medico) {
		MedicoActivo medicoActivo= dao.consultar(medico.getID());
		medicoActivo.setEliminado(true);
		return  dao.modificar(medicoActivo);
	}
}
