package modelo;

public class Medico extends Persona {

	private Especialidad especialidad;
	private boolean[][] horario;

	public Medico(String telefono, String nombre, String apellidos, String direccion, String nacimiento,
			Especialidad especialidad) {
		super(telefono, nombre, apellidos, direccion, nacimiento);
		this.especialidad = especialidad;
		this.horario = new boolean[2][2];
		if (this.especialidad == Especialidad.Cabecera)
			this.horario = new boolean[8][5];
	}

	public Medico(Medico medico) {
		super(medico);
		this.especialidad = medico.getEspecialidad();
		this.horario = medico.getHorario();
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

}
