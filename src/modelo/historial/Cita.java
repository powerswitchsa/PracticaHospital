package modelo.historial;

import modelo.Medico;
import modelo.Paciente;

public class Cita {

	private Medico medico;
	private String fecha;
	private boolean asistencia;
	private String observaciones;

	public Cita(Medico medico, String fecha, boolean asistencia, String observaciones) {
		super();
		this.medico = medico;
		this.fecha = fecha;
		this.asistencia = asistencia;
		this.observaciones = observaciones;
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
