package modelo.enums;

public enum Regularizador {

	Nombre("^([A-Z]{1}[a-z]+[ ]?){1,2}$*"), Apellido("^([A-Z]{1}[a-z]+[ ]?){1,2}$*"), Telefono("[6-7-9]\\d{8}"),
	Nacimiento("^\\s*(3[01]|[12][0-9]|0?[1-9])\\/(1[012]|0?[1-9])\\/((?:19|20)\\d{2})\\s*$"), Id("[0-9]{1,}"),
	Direccion("C/[ ]([A-Z]{1}[a-z]+[ ]?){1,}$*[0-9]{1,}(º)");

	private String cadena;

	private Regularizador(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return cadena;
	}

}
