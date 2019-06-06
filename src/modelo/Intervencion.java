package modelo;

import java.io.Serializable;

public class Intervencion implements Serializable{

	private Medico medicoSolicitante;
	private Medico cirujano;
	private String tipoIntervencion;
	private boolean realizado;
	private String curado;

	public Intervencion(Medico medicoSolicitante, Medico cirujano, String tipoIntervencion, boolean realizado,
			String curado) {
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

	public String isCurado() {
		return curado;
	}
	public String getFullName() {
		return cirujano.getApellidos()+cirujano.getNombre();
		
	}
}
