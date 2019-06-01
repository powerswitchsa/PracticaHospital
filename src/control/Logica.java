package control;

import java.util.ArrayList;

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
	}

	public Paciente getPaciente(int id) {
		return null;
	}

	public Paciente getPaciente(String nombre) {
		return null;
	}

	public ArrayList<Paciente> getListPaciente() {
		return null;
	}

	public Medico getMedico(int id) {
		return null;
	}

	public Medico getMedico(String nombre) {
		return null;
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
}
