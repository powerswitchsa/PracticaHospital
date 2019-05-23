package modelo;

import java.util.ArrayList;

public class Consulta {

	private boolean[][] horarios;
	private ArrayList<Medico> medicos;

	public Consulta() {
		super();
		this.medicos = new ArrayList<Medico>();
		this.horarios = new boolean[8][5];
	}

	/**
	 * Comprueba que la fecha que se solicita esta libre
	 * 
	 * @param i posiciones de la matriz
	 * @param j posiciones de la matriz
	 * @return true si esta libre
	 */
	public boolean comprobarHora(int i, int j) {
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
	public void asignarMedico(Medico medico) {
		// TODO Auto-generated method stub

	}
}
