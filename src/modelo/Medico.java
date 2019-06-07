package modelo;

import java.io.Serializable;
import java.util.ArrayList;

import modelo.enums.Especialidad;

public class Medico extends Persona implements Serializable {

	private Especialidad especialidad;
	private boolean[][] horario;

	public Medico(String nombre, String apellidos, String direccion, String telefono,
			Especialidad especialidad) {
		super(telefono, nombre, apellidos, direccion, null);
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
	public  String getFullName() {
		return this.getApellidos()+" "+this.getNombre();
	}
}
