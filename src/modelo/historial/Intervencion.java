package modelo.historial;

import modelo.Medico;
import modelo.Paciente;

public class Intervencion {

	private int id;
	private Paciente paciente;
	private Medico medicoSolicitante;
	private Medico cirujano;
	private String tipoIntervencion;
	private boolean realizado;
	private boolean curado;

	public Intervencion(int id, Paciente paciente, Medico medicoSolicitante, Medico cirujano, String tipoIntervencion,
			boolean realizado, boolean curado) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.medicoSolicitante = medicoSolicitante;
		this.cirujano = cirujano;
		this.tipoIntervencion = tipoIntervencion;
		this.realizado = realizado;
		this.curado = curado;
	}

	public int getId() {
		return id;
	}

	public Paciente getPaciente() {
		return paciente;
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
