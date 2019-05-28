package modelo.historial;

import modelo.Medico;
import modelo.Paciente;

public class Cita {

	private int id;
	private Paciente paciente;
	private Medico medico;
	private String fecha;
	private boolean asistencia;
	private String observaciones;

	public Cita(int id, Paciente paciente, Medico medico, String fecha, boolean asistencia, String observaciones) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
		this.asistencia = asistencia;
		this.observaciones = observaciones;
	}

	public int getId() {
		return id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public String getFecha() {
		return fecha;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public String getObservaciones() {
		return observaciones;
	}

}
