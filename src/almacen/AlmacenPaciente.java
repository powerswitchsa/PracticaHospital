package almacen;

import java.io.File;
import java.util.HashMap;

import modelo.Paciente;

public class AlmacenPaciente {

	private DAO<Paciente> DAOPaciente;
	private DAO<HashMap<String, Paciente>> DAOIndice;

	private HashMap<String, Paciente> mapPaciente;

	private String rutaIndice = "./resource/IndicePaciente.dat";

	public AlmacenPaciente() {
		super();
		this.DAOIndice = new DAO<HashMap<String, Paciente>>();
		this.DAOPaciente = new DAO<Paciente>();
		this.mapPaciente = new HashMap<String, Paciente>();

		if (!new File(rutaIndice).exists())
			this.mapPaciente = leerMapPaciente();

	}

	public void altaPaciente(Paciente paciente) {
		paciente.setId(getUltimaId());
		this.mapPaciente.put(paciente.getId(), paciente);
		grabarMapPaciente();
		grabarPaciente(paciente);
	}

	public void modificarPaciente(Paciente paciente) {
		this.mapPaciente.remove(paciente.getId());
		this.mapPaciente.put(paciente.getId(), paciente);
		grabarMapPaciente();
	}

	public void darBajaPaciente(String id) {
		this.mapPaciente.remove(id);
	}

	public Paciente getPaciente(String id) {
		return this.mapPaciente.get(id);
	}

	private HashMap<String, Paciente> leerMapPaciente() {
		return this.DAOIndice.getLeer(rutaIndice);
	}

	private boolean grabarMapPaciente() {
		return this.DAOIndice.getGrabar(rutaIndice, this.mapPaciente, false);
	}

	private boolean grabarPaciente(Paciente paciente) {
		return this.DAOPaciente.getGrabar(rutaPacientes(paciente.getId()), paciente, false);
	}

	private String rutaPacientes(String id) {
		return "./resource/pacientes/" + id + ".dat";
	}

	private String getUltimaId() {
		int contador = 0;
		for (java.util.Map.Entry<String, Paciente> paciente : this.mapPaciente.entrySet()) {
			if (contador < Integer.valueOf(paciente.getValue().getId()))
				contador = Integer.valueOf(paciente.getValue().getId());
		}
		return String.valueOf(contador);
	}

}
