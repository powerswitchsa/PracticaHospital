package modelo;

import java.io.Serializable;

import modelo.enums.TipoOperacion;

public class Intervencion implements Serializable{

	private Medico medicoSolicitante;
	private Medico cirujano;
	private TipoOperacion tipoOperacion;
	private boolean realizado;
	private String curado;

	public Intervencion(Medico medicoSolicitante, Medico cirujano, TipoOperacion tipoIntervencion, boolean realizado,
			String curado) {
		super();
		this.medicoSolicitante = medicoSolicitante;
		this.cirujano = cirujano;
		this.tipoOperacion = tipoIntervencion;
		this.realizado = realizado;
		this.curado = curado;
	}

	public Medico getMedicoSolicitante() {
		return medicoSolicitante;
	}

	public Medico getCirujano() {
		return cirujano;
	}

	public TipoOperacion getTipoIntervencion() {
		return tipoOperacion;
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
