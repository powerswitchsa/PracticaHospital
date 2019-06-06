package modelo;

import java.io.Serializable;

public class Cita implements Serializable {

	private Medico medico;
	private Paciente paciente;
	private String fecha;
	private boolean asistencia;
	private String observaciones;

	public Cita(Medico medico, Paciente paciente, String fecha, boolean asistencia, String observaciones) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.fecha = fecha;
		this.asistencia = asistencia;
		this.observaciones = observaciones;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
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

	public String getNombreMedico() {
		return medico.getNombre() + ", " + medico.getApellidos();

	}
}
