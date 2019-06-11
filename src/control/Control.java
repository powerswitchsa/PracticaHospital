package control;

import java.util.ArrayList;

import java.util.HashMap;

import modelo.Consulta;
import modelo.Controller;
import modelo.Medico;
import modelo.Paciente;
import modelo.enums.Especialidad;
import modelo.enums.TipoOperacion;
import modelo.enums.Turno;
import vista.medico.AltaMedico;

public class Control {

	private Logica logica;
	private Controller controller;

	public Control() {
		super();
		this.logica = new Logica();
		this.controller = new Controller();
	}

	public boolean getAltaPaciente(ArrayList<String> infoPaciente) {
		Paciente paciente = new Paciente(infoPaciente.get(0), infoPaciente.get(1), infoPaciente.get(2),
				infoPaciente.get(3), infoPaciente.get(4));
//		return this.controller.validarPaciente(paciente) ? this.logica.getAltaPaciente(paciente) : false;
		return this.logica.getAltaPaciente(paciente);
	}

	public boolean getAltaMedico(ArrayList<String> infoMedico, Especialidad tipo, Turno turno) {
		Medico medico = new Medico(infoMedico.get(0), infoMedico.get(1), infoMedico.get(2), infoMedico.get(3), tipo,
				turno);
//		return this.controller.validarMedico(medico) ? this.logica.getAltaMedico(medico, tipo, turno) : false;
		return this.logica.getAltaMedico(medico, tipo, turno);
	}

	public boolean getModificarPaciente(String id, String direccion, String telefono) {
		return this.controller.validarDireccion(direccion) && this.controller.validarTelefono(telefono)
				? this.logica.modificarPaciente(id, telefono, direccion)
				: false;
	}

	public boolean getCitaOperacion(String nombreCirujano, String nombreMedico, String idPaciente,
			TipoOperacion tipoOperacion) {
		return this.logica.getCitaOperacion(nombreCirujano, nombreMedico, idPaciente, tipoOperacion);
	}

	public boolean getBajaPaciente(String id) {
		return this.logica.getBajaPaciente(id);
	}

	public boolean getCita(String id, String nombreMedico, String coordenada, String hora) {
		return this.logica.getCita(id, nombreMedico, coordenada, hora);
	}

	public Medico getFullNameMedico(String fullName) {
		return this.logica.getMedicoFromName(fullName);

	}

	public ArrayList<Medico> getMedicosAtenderCita() {
		return this.logica.getMedicosAtenderCita();
	}

	public ArrayList<String> getVacanteConsulta(AltaMedico ataAltaMedico) {
		return this.logica.getConsultaVacante(ataAltaMedico);
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

	public Especialidad getEspecialidadCombo(String especialidad) {
		return this.logica.getEspecialidadCombo(especialidad);
	}

	public String getFecha() {
		return this.logica.getFecha();
	}

	public void getPasarHora() {
		this.logica.getPasarHora();
	}
}
