package control;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Cita;
import modelo.Especialidad;
import modelo.Medico;
import modelo.Paciente;
import vista.paciente.CitaOperacion;

public class Control {

	private Logica logica;

	public Control() {
		super();
		this.logica = new Logica();
	}

	public boolean getAltaPaciente(ArrayList<String> paciente) {
		return this.logica.altaPaciente(paciente);
	}

	public boolean getAltaMedico(ArrayList<String> medico, Especialidad tipo) {
		return this.logica.altaMedico(medico, tipo);
	}

	public boolean getBajaPaciente(String id) {
		return this.logica.bajaPaciente(id);
	}

	public boolean getModificarPaciente(String id, String nombrePaciente, String direccion, String telefono) {
		return this.logica.modificarPaciente(id, telefono, direccion);
	}

	public Medico getConsultarMedico(String nombre, String id) {
		return null;
	}

	public Paciente getConsultarPaciente(String nombre, String id) {
		return null;
	}

	public ArrayList<Cita> getConsultarCitas(String nombre, String id) {
		return null;
	}

	public boolean getCitaPrimaria(String id, String nombrePaciente, String nombreMedico) {
		return false;
	}

	public boolean getCitaOperacion(CitaOperacion citaOperacion) {
		return false;
	}

	public boolean getCitaEspecialista(String... info) {
		return false;
	}

	public void getVerHistorial() {

	}

	public ArrayList<Integer> getVacanteConsulta() {
		return this.logica.getConsultaVacante();
	}

	public ArrayList<Boolean> getHoraLibre() {
		return this.logica.getPosHoraVacante();
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return this.logica.getMapPaciente();
	}

	public Paciente getPaciente(String id) {
		return this.logica.getPaciente(id);
	}

	public Paciente getPacienteNombre(String nombre) {
		return this.logica.getPacienteNombre(nombre);
	}

	public Paciente getPacienteFullNombre(String fullNombre) {
		return this.logica.getPacienteFullNombre(fullNombre);
	}

	public HashMap<String, Medico> getMapMedico() {
		return this.logica.getMapMedico();
	}

	public Medico getMedico(String id) {
		return this.logica.getMedico(id);
	}

}
