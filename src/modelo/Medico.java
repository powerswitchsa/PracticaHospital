package modelo;

import java.io.Serializable;

import modelo.enums.Especialidad;
import modelo.enums.Turno;

public class Medico extends Persona implements Serializable {

	private Especialidad especialidad;
	private Turno turno;
	private Horario horario;

	public Medico(String nombre, String apellidos, String direccion, String telefono, Especialidad especialidad,
			Turno turno) {
		super(telefono, nombre, apellidos, direccion, null);
		this.especialidad = especialidad;
		this.turno = turno;
		this.horario = new Horario();
		if (especialidad == Especialidad.Especialista) {
			for (int i = 0; i < horario.getHorario().length; i++) {
				for (int j = 0; j < horario.getHorario()[i].length; j++) {
					if (j == 1 || j == 3)
						this.horario.setDesmarcar(i, j);
					else
						this.horario.setAsignarCasilla(i, j);
				}
			}
		}
	}

	public void asignarHora(int i, int j) {
		this.horario.setAsignarCasilla(i, j);
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public boolean[][] getHorario() {
		return this.horario.getHorario();
	}

	public String getFullName() {
		return this.getApellidos() + ", " + this.getNombre();
	}

	public Turno getTurno() {
		return turno;
	}
}
