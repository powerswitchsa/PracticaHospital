package control;

import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.HashMap;

import almacen.AlmacenMedico;
import almacen.AlmacenPaciente;
import modelo.Consulta;
import modelo.Especialidad;
import modelo.Medico;
import modelo.Paciente;

public class Logica {

	private AlmacenPaciente almacenPaciente;
	private AlmacenMedico almacenMedico;
	private ArrayList<Consulta> consulta;

	public Logica() {
		super();
		this.consulta = new ArrayList<Consulta>();
		this.almacenPaciente = new AlmacenPaciente();
		this.almacenMedico = new AlmacenMedico();
	}

	public boolean altaPaciente(ArrayList<String> paciente) {
		return this.almacenPaciente.altaPaciente(
				new Paciente(paciente.get(0), paciente.get(1), paciente.get(2), paciente.get(3), paciente.get(4)));
	}

	public boolean altaMedico(ArrayList<String> medico, Especialidad tipo) {
		return this.almacenMedico
				.altaMedico(new Medico(medico.get(0), medico.get(1), medico.get(2), medico.get(3), tipo));
	}

	public boolean bajaPaciente(String id) {
		return this.almacenPaciente.bajaPaciente(id);
	}

	public boolean modificarPaciente(String id, String telefono, String direccion) {
		Paciente paciente = this.almacenPaciente.getPaciente(id);
		paciente.setTelefono(telefono);
		paciente.setDireccion(direccion);
		return this.almacenPaciente.modificarPaciente(paciente);
	}

	public ArrayList<String> getConsultaVacante() {
		ArrayList<String> idConsulta = new ArrayList<String>();
		for (Consulta consulta : consulta) {
			if (consulta.getVacantes()) {
				idConsulta.add(consulta.getId());
			}
		}
		return idConsulta;
	}

	public ArrayList<Boolean> getPosHoraVacante() {
		ArrayList<Boolean> horaVacante = new ArrayList<Boolean>();
		for (Consulta consulta : consulta) {
			for (int i = 0; i < consulta.getHorarios().length; i++) {
				for (int j = 0; j < consulta.getHorarios()[0].length; j++) {
					if (consulta.getHorarios()[i][j] == false) {
						horaVacante.add(consulta.getHorarios()[i][j]);
					}
				}
			}
		}
		return horaVacante;

	}

	public ArrayList<Medico> getEspecialidadMedico(Especialidad especialidad) {
		return this.almacenMedico.getListaEspecialidad(especialidad);

	}

	public HashMap<String, Paciente> getMapPaciente() {
		return this.almacenPaciente.getMapPaciente();
	}

	public Paciente getPaciente(String id) {
		return this.almacenPaciente.getPaciente(id);
	}

	public Paciente getPacienteFullNombre(String fullNombre) {
		return this.almacenPaciente.getPacienteFullNombre(fullNombre);
	}

	public HashMap<String, Medico> getMapMedico() {
		return this.almacenMedico.getMapMedicos();
	}

	public Medico getMedico(String id) {
		return this.almacenMedico.getMedico(id);
	}

}
