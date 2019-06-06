package modelo.enums;

public enum TipoOperacion {

	extirpacion("cambio de corazon"), rinoplastia("cambio de tocha"), hernia("fixeo de barriga");

	private String operacion;

	private TipoOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getOperacion() {
		return operacion;
	}

}
