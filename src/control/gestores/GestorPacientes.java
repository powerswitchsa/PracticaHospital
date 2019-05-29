package control.gestores;

import java.util.ArrayList;

import modelo.Paciente;
import modelo.historial.Cita;
import modelo.historial.Intervencion;

public class GestorPacientes {

	private ArrayList<Paciente> pacientes;
	private String ruta = "";

	public GestorPacientes() {
		super();
		this.pacientes = new ArrayList<Paciente>();
	}

	/**
	 * busca al paciente por su id
	 * 
	 * @param nombre
	 * @return el paciente con esa id
	 */
	public Paciente getPaciente(int id) {
		return null;
	}

	/**
	 * busca al paciente por su nombre
	 * 
	 * @param nombre
	 * @return el paciente con ese nombre
	 */
	public Paciente getPaciente(String nombre) {
		return null;
	}

	/**
	 * hay que utilizar la id del paciente que le entra para buscarlo en la lista y
	 * sustituirlo , ademas hay que buscar su archivo y volverlo a grabar en cima
	 * para guardar los cambios
	 * 
	 * @param paciente
	 * @return true si se ha realizado con exito
	 */
	public boolean getModificarCliente(Paciente paciente) {
		return false;
	}

	/**
	 * debe dar alta al cliente en la lista y aparte grabar y crear un nuevo archivo
	 * de este
	 * 
	 * @param paciente
	 * @return true si se ha realizado con exito
	 */
	public boolean getAltaPAciente(Paciente paciente) {
		return false;
	}

	/**
	 * retorna la lista que se encuentra dentro del cliente, este metodo esta
	 * pensado para el panel de consulta citas
	 * 
	 * @param id
	 * @return lista de citas pendientes
	 */
	public ArrayList<Cita> getCitasPendientes(int id) {
		return null;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

}
