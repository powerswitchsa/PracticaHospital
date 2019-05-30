package modelo;

public class Intervencion {

	private Medico medicoSolicitante;
	private Medico cirujano;
	private String tipoIntervencion;
	private boolean realizado;
	private boolean curado;

	public Intervencion(Medico medicoSolicitante, Medico cirujano, String tipoIntervencion, boolean realizado,
			boolean curado) {
		super();
		this.medicoSolicitante = medicoSolicitante;
		this.cirujano = cirujano;
		this.tipoIntervencion = tipoIntervencion;
		this.realizado = realizado;
		this.curado = curado;
	}

	public Medico getMedicoSolicitante() {
		return medicoSolicitante;
	}

	public Medico getCirujano() {
		return cirujano;
	}

	public String getTipoIntervencion() {
		return tipoIntervencion;
	}

	public boolean isRealizado() {
		return realizado;
	}

	public boolean isCurado() {
		return curado;
	}

}
