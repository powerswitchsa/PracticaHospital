package modelo;

import java.io.Serializable;

import modelo.enums.Especialidad;
import modelo.enums.Turno;

public class Medico extends Persona implements Serializable {

	private Especialidad especialidad;
	private boolean[][] horario = new boolean[8][5];
	private Turno turno;

	public Medico(String nombre, String apellidos, String direccion, String telefono, Especialidad especialidad,
			Turno turno) {
		super(telefono, nombre, apellidos, direccion, null);
		this.especialidad = especialidad;
		this.turno = turno;
		this.horario = new boolean[8][5];
		if (especialidad == Especialidad.Especialista) {
			for (int i = 0; i < horario.length; i++) {
				for (int j = 0; j < horario[i].length; j++) {
					if (j == 1 || j == 3)
						this.horario[i][j] = false;
					else
						this.horario[i][j] = true;
				}
			}
		}
	}

	public void asignarHora(int i, int j) {
		this.horario[i][j] = true;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public boolean[][] getHorario() {
		return horario;
	}

	public void setHorario(boolean[][] horario) {
		this.horario = horario;
	}

	public String getFullName() {
		return this.getApellidos() + " " + this.getNombre();
	}

	public Turno getTurno() {
		return turno;
	}
}
