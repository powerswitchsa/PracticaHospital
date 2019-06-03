package control;

import java.util.ArrayList;

import java.util.HashMap;

import almacen.AlmacenMedico;
import almacen.AlmacenPaciente;
import modelo.Consulta;
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
		this.almacenPaciente.altaPaciente(
				new Paciente(paciente.get(0), paciente.get(1), paciente.get(2), paciente.get(3), paciente.get(4)));
		return false;
	}

	public boolean modificarPaciente(String id, String telefono, String direccion) {
		Paciente paciente = this.almacenPaciente.getPaciente(id);
		paciente.setTelefono(telefono);
		paciente.setDireccion(direccion);
		return this.almacenPaciente.modificarPaciente(paciente);
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return this.almacenPaciente.getMapPaciente();
	}

	public Paciente getPaciente(String id) {
		return this.almacenPaciente.getPaciente(id);
	}


	public ArrayList<Medico> getListMedico() {
		return null;
	}

	public ArrayList<Integer> getConsultaVacante() {
		ArrayList<Integer> idConsulta = new ArrayList<Integer>();
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
}
