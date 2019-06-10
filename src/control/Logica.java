package control;

import java.util.ArrayList;

import java.util.HashMap;
import almacen.GestorDTO;
import modelo.Cita;
import modelo.Consulta;
import modelo.Intervencion;
import modelo.Medico;
import modelo.Paciente;
import modelo.enums.*;

public class Logica {

	private GestorDTO gestorDTO;
	private HashMap<String, Paciente> mapPaciente;
	private HashMap<String, Medico> mapMedico;
	private HashMap<String, Consulta> mapConsulta;
	private ArrayList<Cita> citas;

	public Logica() {
		super();
		this.gestorDTO = new GestorDTO();

		this.mapPaciente = this.gestorDTO.getLeerMapPaciente();
		if (this.mapPaciente == null)
			this.mapPaciente = new HashMap<String, Paciente>();

		this.mapMedico = this.gestorDTO.getLeerMapMedico();
		if (this.mapMedico == null)
			this.mapMedico = new HashMap<String, Medico>();

		this.mapConsulta = this.gestorDTO.getLeerMapConsulta();
		if (this.getMapConsulta() == null)
			this.mapConsulta = new HashMap<String, Consulta>();

		this.citas = this.gestorDTO.getLeerListCitas();
		if (this.citas == null)
			this.citas = new ArrayList<Cita>();
	}

	public boolean getAltaPaciente(Paciente paciente) {
		paciente.setId(getUltimaIdPaciente());
		this.mapPaciente.put(paciente.getId(), paciente);
		return this.gestorDTO.getGrabarPaciente(paciente) && this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public boolean getAltaMedico(Medico medico, Especialidad tipo, Turno turno) {
		medico.setId(getUltimaIdMedico());
		this.mapMedico.put(medico.getId(), medico);
		return this.gestorDTO.getGrabarMapMedico(this.mapMedico);
	}

	public boolean getBajaPaciente(String id) {
		this.mapPaciente.remove(id);
		return this.gestorDTO.getEliminarPaciente(id);
	}

	public boolean modificarPaciente(String id, String telefono, String direccion) {
		Paciente paciente = this.mapPaciente.get(id);
		paciente.setTelefono(telefono);
		paciente.setDireccion(direccion);
		this.mapPaciente.remove(id);
		this.mapPaciente.put(paciente.getId(), paciente);
		return this.gestorDTO.getGrabarPaciente(paciente) && this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public ArrayList<String> getConsultaVacante() {
		ArrayList<String> idConsulta = new ArrayList<String>();
		for (Consulta consulta : this.mapConsulta.values()) {
			if (consulta.getVacantes()) {
				idConsulta.add(consulta.getId());
			}
		}
		return idConsulta;
	}

	private String getUltimaIdPaciente() {
		int contador = 0;
		for (String id : this.mapPaciente.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;
		}
		return String.valueOf(contador + 1);
	}

	private String getUltimaIdMedico() {
		int contador = 0;
		for (String id : this.mapMedico.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;
		}
		return String.valueOf(contador + 1);
	}

	public Medico getFullNameMedico(String fullName) {
		for (Medico medico : this.mapMedico.values()) {
			if (medico.getFullName().equals(fullName))
				return medico;
		}
		return null;
	}

	public Paciente getPacienteFullNombre(String fullName) {
		for (Paciente paciente : this.mapPaciente.values()) {
			if (paciente.getFullName().equals(fullName))
				return paciente;
		}
		return null;
	}

	public ArrayList<Medico> getEspecialidadMedico(Especialidad especialidad) {
		ArrayList<Medico> seleccionados = new ArrayList<Medico>();
		for (Medico medico : this.mapMedico.values()) {
			if (medico.getEspecialidad() == especialidad) {
				seleccionados.add(medico);
			}
		}
		return seleccionados;
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return this.mapPaciente;
	}

	public Paciente getPaciente(String id) {
		return this.mapPaciente.get(id);
	}

	public HashMap<String, Medico> getMapMedico() {
		return this.mapMedico;
	}

	public Medico getMedico(String id) {
		return this.mapMedico.get(id);
	}

	public HashMap<String, Consulta> getMapConsulta() {
		return this.mapConsulta;
	}

}
