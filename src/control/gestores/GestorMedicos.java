package control.gestores;

import java.util.ArrayList;

import modelo.Medico;

public class GestorMedicos {

	private ArrayList<Medico> medicos;
	private String ruta = "";

	public GestorMedicos() {
		super();
		this.medicos = new ArrayList<Medico>();
	}

	/**
	 * busca al medico por la id y lo retorna
	 * 
	 * @param id
	 * @return null si no existe
	 */
	public Medico getMedico(int id) {
		return null;
	}

	/**
	 * busca al medico por el nombre y lo retorna
	 * 
	 * @param nombre
	 * @return null si no existe
	 */
	public Medico getMedico(String nombre) {
		return null;
	}

	/**
	 * añade un nuevo medico a la lista , ademas debe grabar la lista de medicos
	 * 
	 * @param medico
	 * @return true si se ceardo con exito
	 */
	public boolean getAltaMedico(Medico medico) {
		return false;
	}

}
