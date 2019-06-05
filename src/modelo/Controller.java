package modelo;

public class Controller {

	public Respuesta validarNombre(String nombre) {
		return Persona.validarNombre(nombre);
	}

	public Respuesta validarApellidos(String apellidos) {
		return Persona.validarApellido(apellidos);
	}
}
