package control;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Cita;
import modelo.Medico;
import modelo.Paciente;
import modelo.Respuesta;
import vista.paciente.CitaOperacion;

public class Control {

	private Logica logica;

	public Control() {
		super();
		this.logica = new Logica();
	}

	/**
	 * añade un nuevo paciente , hay que validar sus datos
	 * 
	 * @param paciente
	 * @return true si se ha podido crear
	 */
	public boolean getAltaPaciente(ArrayList<String> paciente) {
		this.logica.altaPaciente(paciente);
		return false;
	}

	/**
	 * añade un nuevo medico , hay que validar sus datos
	 * 
	 * @param medico
	 * @return true si se ha podido crear
	 */
	public boolean getAltaMedico(Medico medico) {
		return false;
	}

	/**
	 * elima todo lo relacionado con el paciente
	 * 
	 * @param paciente
	 * @return true si se ha podido eliminar
	 */
	public boolean getBajaPaciente(Paciente paciente) {
		return false;
	}

	/**
	 * retorna un paciente para rellenar los campos de la vista , este se puede
	 * buscar por el nombre o por la id , por lo que uno de los dos sera nulo cuando
	 * se entre por parametro dentro del metodo
	 * 
	 * @param nombre
	 * @param id
	 * @return
	 */
	public Medico getConsultarMedico(String nombre, String id) {
		return null;
	}

	/**
	 * retorna un paciente para rellenar los campos de la vista , este se puede
	 * buscar por el nombre o por la id , por lo que uno de los dos sera nulo cuando
	 * se entre por parametro dentro del metodo
	 * 
	 * @param nombre del pciente que buscamos
	 * @param id     del pciente que buscamos
	 * @return el paciente
	 */
	public Paciente getConsultarPaciente(String nombre, String id) {
		return null;
	}

	/**
	 * retorna la lista de citas de el paciente que buscamos
	 * 
	 * @param nombre del paciente
	 * @param id     del paciente
	 * @return lista de citas
	 */
	public ArrayList<Cita> getConsultarCitas(String nombre, String id) {
		return null;
	}

	/**
	 * crea la cita con el medico de atencion primaria
	 * 
	 * @param id
	 * @param nombrePaciente
	 * @param nombreMedico
	 * @return
	 */
	public boolean getCitaPrimaria(String id, String nombrePaciente, String nombreMedico) {
		return false;
	}

	/**
	 * crea la cita con el cirujano
	 * 
	 * @param citaOperacion panel con la informacion
	 * @return true si se ha realizado con exito
	 */
	public boolean getCitaOperacion(CitaOperacion citaOperacion) {
		return false;
	}

	/**
	 * crea la cita con el especialista
	 * 
	 * @param citaEspecialista panel con la informacion
	 * @return true si se ha realizado con exito
	 */
	public boolean getCitaEspecialista(String... info) {
		return false;
	}

	public void getVerHistorial() {
		// hay que cambiar la vista de este panel
	}

	/**
	 * modificamos al paciente que obtenemos mediante el nombre o la id
	 * 
	 * @param id             del paciente
	 * @param nombrePaciente del paciente
	 * @param direccion      nueva direccion
	 * @param telefono       nuevo telefono
	 * @return true si se ha modificado con exito
	 */
	public boolean getModificarPaciente(String id, String nombrePaciente, String direccion, String telefono) {

		return false;
	}
	public ArrayList<Integer> getVacanteConsulta(){
		return this.logica.getConsultaVacante();
		
	}
	public ArrayList<Boolean> getHoraLibre(){
		return this.logica.getPosHoraVacante();
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return this.logica.getMapPaciente();
	}

	public Paciente getPaciente(String id) {
		return this.logica.getPaciente(id);
	}

}
