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

<<<<<<< HEAD
		if (!new File(rutaIndice).exists()) {
			this.mapPaciente = leerMapPaciente();
		} else {
			this.mapPaciente = new HashMap<String, Paciente>();
		}

//		String asd = "./resource/pacientes/null.dat";
//		Paciente paciente = DAOPaciente.getLeer(asd);
//		System.out.println(paciente.getFullName());

=======
		File file = new File("resource/pacientes");
		if (!file.exists())
			file.mkdir();

		if (!new File(rutaIndice).exists()) {
			this.mapPaciente = leerMapPaciente();
		} else {
			this.mapPaciente = new HashMap<String, Paciente>();
		}
>>>>>>> refs/remotes/practica/master
	}

<<<<<<< HEAD
	public void altaPaciente(Paciente paciente) {
//		paciente.setId(getUltimaId());
//		this.mapPaciente.put(paciente.getId(), paciente);
=======
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
>>>>>>> refs/remotes/practica/master
		grabarMapPaciente();
		grabarPaciente(paciente);
	}

<<<<<<< HEAD
	public void modificarPaciente(Paciente paciente) {
		this.mapPaciente.remove(paciente.getId());
		this.mapPaciente.put(paciente.getId(), paciente);
		grabarMapPaciente();
=======
	public boolean modificarPaciente(Paciente paciente) {
		this.mapPaciente.remove(paciente.getId());
		this.mapPaciente.put(paciente.getId(), paciente);
		return grabarMapPaciente() && grabarPaciente(paciente);
>>>>>>> refs/remotes/practica/master
	}

	public void darBajaPaciente(String id) {
		this.mapPaciente.remove(id);
	}

	public Paciente getPaciente(String id) {
		return this.mapPaciente.get(id);
	}

	private HashMap<String, Paciente> leerMapPaciente() {
<<<<<<< HEAD
		return this.DAOIndice.getLeer(rutaIndice);
=======
		return this.DAOIndice.leer(rutaIndice);
>>>>>>> refs/remotes/practica/master
	}

	private boolean grabarMapPaciente() {
<<<<<<< HEAD
		return this.DAOIndice.getGrabar(rutaIndice, this.mapPaciente, false);
=======
		return this.DAOIndice.grabar(rutaIndice, this.mapPaciente);
>>>>>>> refs/remotes/practica/master
	}

	private boolean grabarPaciente(Paciente paciente) {
<<<<<<< HEAD
		return this.DAOPaciente.getGrabar(rutaPacientes(paciente.getId()), paciente, false);
=======
		return this.DAOPaciente.grabar(rutaPacientes(paciente.getId()), paciente);
>>>>>>> refs/remotes/practica/master
	}

	private String rutaPacientes(String id) {
		return "./resource/pacientes/" + id + ".dat";
	}

	private String getUltimaId() {
		int contador = 0;
<<<<<<< HEAD
		for (java.util.Map.Entry<String, Paciente> paciente : this.mapPaciente.entrySet()) {
			if (contador < Integer.valueOf(paciente.getValue().getId()))
				contador = Integer.valueOf(paciente.getValue().getId());
=======
		for (String id : this.mapPaciente.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;
>>>>>>> refs/remotes/practica/master
		}
<<<<<<< HEAD
		return String.valueOf(contador);
=======
		return String.valueOf(contador + 1);
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return mapPaciente;
>>>>>>> refs/remotes/practica/master
	}

}
