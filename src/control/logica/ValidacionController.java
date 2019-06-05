package control.logica;

import modelo.dto.MedicoDTO;
import modelo.dto.PacienteDTO;
import modelo.dto.Respuesta;

public class ValidacionController {
	
	PacienteDTO paciente;
	MedicoDTO medico;
	
	
	
	public Respuesta validarCamposPaciente(String campo,String patron,String mensaje) {
		return paciente.validarCampos(campo, patron, mensaje);
	}
	
	public Respuesta validarCamposMedico(String campo,String patron,String mensaje) {
		return medico.validarCampos(campo, patron, mensaje);	
	}

}
