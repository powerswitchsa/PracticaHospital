package control;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.Consulta;
import modelo.Controller;
import modelo.Medico;
import modelo.Paciente;
import modelo.enums.Especialidad;
import modelo.enums.Turno;
import vista.paciente.CitaOperacion;

public class Control {

	private Logica logica;
	private Controller controller;

	public Control() {
		super();
		this.logica = new Logica();
		this.controller = new Controller();
	}

	public boolean getAltaPaciente(ArrayList<String> paciente) {
		return this.logica.getAltaPaciente(paciente);
	}

	public boolean getAltaMedico(ArrayList<String> medico, Especialidad tipo, Turno turno) {
		return this.logica.getAltaMedico(medico, tipo, turno);
	}

	public boolean getBajaPaciente(String id) {
		return this.logica.getBajaPaciente(id);
	}

	public boolean getModificarPaciente(String id, String direccion, String telefono) {
		return this.logica.modificarPaciente(id, telefono, direccion);
	}

	public boolean getCitaPrimaria(String id, String nombreMedico, String horario) {
		// horarios = "i + " " + j" hace referencia a la posicion de la matriz horario
		return false;
	}

	public Medico getFullNameMedico(String fullName) {
		return this.logica.getFullNameMedico(fullName);

	}

	public boolean getCitaOperacion(CitaOperacion citaOperacion) {
		return false;
	}

	public boolean getCitaEspecialista(String... info) {
		return false;
	}

	public ArrayList<String> getVacanteConsulta() {
		return this.logica.getConsultaVacante();
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return this.logica.getMapPaciente();
	}

	public Paciente getPaciente(String id) {
		return this.logica.getPaciente(id);
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

	public HashMap<String, Consulta> getMapaConsulta() {
		return this.logica.getMapConsulta();

	}

	public ArrayList<Medico> getEspecialidadMedico(Especialidad especialidad) {
		return this.logica.getEspecialidadMedico(especialidad);
	}

	public boolean[][] getHorario(Medico medico) {
		for (Consulta consulta : getMapaConsulta().values()) {
			if (consulta.isTrabajando(medico)) {
				return consulta.getHorarios();
			}
		}
		return null;
	}
}
