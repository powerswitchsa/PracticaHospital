package modelo;

public class Validador {

	public boolean getValidarPersona(Persona persona) {
		return false;
	}

	/**
	 * la cadena no debe tener numeros
	 * 
	 * @param cadena
	 * @return true si esta bien
	 */
	private boolean validarNombre(String cadena) {
		return false;
	}

	/**
	 * la cadena debe estar compuesta de dd/mm/aaaa
	 * 
	 * @param cadena
	 * @return true si esta bien
	 */
	private boolean validarFecha(String cadena) {
		return false;
	}

	/**
	 * comprueba que la longitud de la cadena es la correcta , ademas de que la
	 * cadena solo este compuesta de numeros (aunque esto ultimo lo podemos limitar
	 * en la vista)
	 * 
	 * @param cadena numero telefono
	 * @return true si esta bien
	 */
	private boolean validarTelefono(String cadena) {
		return false;
	}

}
