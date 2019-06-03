package modelo;

import java.util.ArrayList;

public class Consulta {

	private int id;
	private boolean[][] horarios;
	private ArrayList<String> idMedicos;

	public Consulta(int id) {
		super();
		this.idMedicos = new ArrayList<String>();
		this.horarios = new boolean[8][5];
		this.id = id;
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
		return this.idMedicos.size() < 5;
	}

	public int getId() {
		return id;
	}

	public boolean[][] getHorarios() {
		return horarios;
	}
}
