package almacen;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import modelo.Paciente;

public class AlmacenPaciente {

	private DAO<Paciente> DAOPaciente;
	private DAO<Map<Integer, String>> DAOIndice;

	private String rutaPacientes = "./resource/Pacientes/";
	private String rutaIndice = "./resource/IndicePaciente.dat";
	private String extension = ".dat";

	private ArrayList<Paciente> pacientes;
	private Map<Integer, String> indicePaciente;

	public AlmacenPaciente() {
		super();
		this.DAOPaciente = new DAO<Paciente>();
		this.DAOIndice = new DAO<Map<Integer, String>>();
		File fileIndice = new File(rutaIndice);
		if (fileIndice.exists())
			actualizarIndicePaciente();
		File filePacientes = new File(this.rutaPacientes);
		String[] archivos = filePacientes.list();
		if (archivos.length > 0)
			actualizarListPaciente();
	}

	public void getAltaPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
		this.indicePaciente.put(paciente.getId(), paciente.getNombre());
		grabarIndicePaciente();
		grabarPaciente(paciente);
	}

	public void getModificarPaciente(Paciente pacienteModificado) {
		for (Paciente paciente : this.pacientes) {
			if (pacienteModificado.getId() == paciente.getId()) {
				paciente = pacienteModificado;
				grabarPaciente(paciente);
			}
		}
	}

	public Paciente getPaciente(int id) {
		for (Paciente paciente : this.pacientes) {
			if (paciente.getId() == id)
				return paciente;
		}
		return null;
	}

	public boolean getBajaPaciente(int id) {
		for (Iterator iterator = this.pacientes.iterator(); iterator.hasNext();) {
			Paciente paciente = (Paciente) iterator.next();
			if (paciente.getId() == id)
				iterator.remove();
		}
		this.indicePaciente.remove(id);
		grabarIndicePaciente();
		File file = new File(rutaPacientes + id + this.extension);
		return file.delete();
	}

	private void actualizarIndicePaciente() {
		this.DAOIndice.getLeer(rutaIndice);
	}

	private void grabarIndicePaciente() {
		this.DAOIndice.getGrabar(rutaIndice, this.indicePaciente, false);
	}

	private boolean grabarPaciente(Paciente paciente) {
		return this.DAOPaciente.getGrabar(rutaPacientes + paciente.getId() + this.extension, paciente, false);
	}

	private void actualizarListPaciente() {
		File file = new File(rutaPacientes);
		String[] archivos = file.list();
		this.pacientes.clear();
		for (int i = 0; i < archivos.length; i++) {
			this.pacientes.add(this.DAOPaciente.getLeer(rutaPacientes + i + this.extension));
		}
	}

}
