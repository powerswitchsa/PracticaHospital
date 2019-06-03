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

		File file = new File("resource/pacientes");
		if (!file.exists())
			file.mkdir();

		if (!new File(rutaIndice).exists()) {
			this.mapPaciente = leerMapPaciente();
		} else {
			this.mapPaciente = new HashMap<String, Paciente>();
		}
	}

	public boolean bajaPaciente(String id) {
		this.mapPaciente.remove(id);
		File file = new File(rutaPacientes(id));
		file.delete();
		grabarMapPaciente();
		return file.exists() ? false : true;
	}

	public void altaPaciente(Paciente paciente) {
		paciente.setId(getUltimaId());
		this.mapPaciente.put(paciente.getId(), paciente);
		grabarMapPaciente();
		grabarPaciente(paciente);
	}

	public boolean modificarPaciente(Paciente paciente) {
		this.mapPaciente.remove(paciente.getId());
		this.mapPaciente.put(paciente.getId(), paciente);
		return grabarMapPaciente() && grabarPaciente(paciente);
	}

	public void darBajaPaciente(String id) {
		this.mapPaciente.remove(id);
	}

	public Paciente getPaciente(String id) {
		return this.mapPaciente.get(id);
	}

	private HashMap<String, Paciente> leerMapPaciente() {
		return this.DAOIndice.leer(rutaIndice);
	}

	private boolean grabarMapPaciente() {
		return this.DAOIndice.grabar(rutaIndice, this.mapPaciente);
	}

	private boolean grabarPaciente(Paciente paciente) {
		return this.DAOPaciente.grabar(rutaPacientes(paciente.getId()), paciente);
	}

	private String rutaPacientes(String id) {
		return "./resource/pacientes/" + id + ".dat";
	}

	private String getUltimaId() {
		int contador = 0;
		for (String id : this.mapPaciente.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;

		}
		return String.valueOf(contador + 1);
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return mapPaciente;
	}

}
