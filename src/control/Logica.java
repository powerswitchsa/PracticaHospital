package control;

import java.util.ArrayList;
import java.util.HashMap;

import almacen.AlmacenMedico;
import almacen.AlmacenPaciente;
import modelo.Paciente;

public class Logica {

	private AlmacenPaciente almacenPaciente;
	private AlmacenMedico almacenMedico;

	public Logica() {
		super();
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

}
