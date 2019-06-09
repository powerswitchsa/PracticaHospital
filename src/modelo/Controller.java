package modelo;

public class Controller {

	public boolean validarNombre(String nombre) {
		return Persona.validarNombre(nombre).isResultado();
	}

	public boolean validarApellidos(String apellidos) {
		return Persona.validarApellido(apellidos).isResultado();
	}

	public boolean validarNacimiento(String nacimiento) {
		return Persona.validarNacimiento(nacimiento).isResultado();
	}

	public boolean validarDireccion(String direccion) {
		return Persona.validarDireccion(direccion).isResultado();
	}

	public boolean validarTelefono(String telefono) {
		return Persona.validarTelefono(telefono).isResultado();
	}

	public boolean validarId(String Id) {
		return Persona.validarId(Id).isResultado();
	}

	public boolean validarPaciente(Paciente paciente) {
		if (!validarNombre(paciente.getNombre()) || !validarApellidos(paciente.getApellidos())
				|| !validarDireccion(paciente.getDireccion()) || !validarId(paciente.getId())
				|| !validarTelefono(paciente.getTelefono()) || !validarNacimiento(paciente.getNacimiento())) {
			return false;
		}
		return true;
	}

	public boolean validarMedico(Medico medico) {
		if (!validarNombre(medico.getNombre()) || !validarApellidos(medico.getApellidos())
				|| !validarDireccion(medico.getDireccion()) || !validarTelefono(medico.getTelefono())) {
			return false;
		}
		return true;
	}
}
