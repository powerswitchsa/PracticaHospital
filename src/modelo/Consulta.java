package modelo;

import java.io.Serializable;
import java.util.ArrayList;

import modelo.enums.Especialidad;
import modelo.enums.TipoOperacion;

public class Consulta implements Serializable {

	private String id;
	private Horario horario;
	private ArrayList<Medico> medicos;
	private Especialidad especialidad;

	public Consulta(String id, Especialidad especialidad) {
		super();
		this.medicos = new ArrayList<Medico>();
		this.horario = new Horario();
		this.id = id;
		if (especialidad==Especialidad.Especialista) {
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

	/**
	 * Comprueba que la fecha que se solicita esta libre
	 * 
	 * @param i posiciones de la matriz
	 * @param j posiciones de la matriz
	 * @return true si esta libre
	 */
	public boolean validarHora(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Quita al medico de la lista
	 * 
	 * @param id del medico que queremos eliminar
	 */
	public void eliminarMedico(int id) {
		// TODO Auto-generated method stub

	}

	/**
	 * Se encarga de añadir un nuevo medico a la consulta
	 * 
	 * @param medico que queremos asignar
	 */
	public void asignarMedico(String id) {
		// TODO Auto-generated method stub
	}

	public boolean getVacantes() {
		return this.medicos.size() < 5;
	}

	public String getId() {
		return id;
	}

	public boolean[][] getHorarios() {
		return this.horario.getHorario();
	}

	public void setId(String string) {
		this.id = string;
	}

	public boolean isTrabajando(Medico medico) {
		return this.medicos.contains(medico);
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void asignarHora(int i, int j) {
		this.horario.setAsignarCasilla(i, j);
	}
}
