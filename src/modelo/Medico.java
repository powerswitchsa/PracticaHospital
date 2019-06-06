package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Medico extends Persona implements Serializable {

	private Especialidad especialidad;
	private boolean[][] horario;

	public Medico(String nombre, String apellidos, String direccion, String telefono,
			Especialidad especialidad) {
		super(nombre, apellidos, direccion, telefono, null);
		this.especialidad = especialidad;
		this.horario = new boolean[2][2];
		if (this.especialidad == Especialidad.Cabecera)
			this.horario = new boolean[8][5];
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
//	@Override
//	public String toString() {
//		return super.setFullName();
//	}

}
