package control.logica;

import modelo.dto.Medico;
import modelo.dto.PacienteDTO;
import modelo.dto.Respuesta;

public class ValidacionController {
	
	PacienteDTO paciente;
	Medico medico;
	
	
	
	public Respuesta validarCamposPaciente(String campo,String patron,String mensaje) {
		return paciente.validarCampos(campo, patron, mensaje);
	}
	
	public Respuesta validarCamposMedico(String campo,String patron,String mensaje) {
		return medico.validarCampos(campo, patron, mensaje);	
	}

}
