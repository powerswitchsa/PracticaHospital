package almacen;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.Especialidad;
import modelo.Medico;
import modelo.Paciente;

public class AlmacenMedico {

	private DAO<HashMap<String, Medico>> DAO;
	private HashMap<String, Medico> mapMedicos;
	private String rutaDestino = "./resource/medicos.dat";

	public AlmacenMedico() {
		super();
		this.DAO = new DAO<HashMap<String, Medico>>();
		File file = new File(rutaDestino);
		if (!file.exists()) {
			this.mapMedicos = new HashMap<String, Medico>();
			grabarMapMedico();
		} else {
			this.mapMedicos = leerMapMedico();
		}
	}

	public boolean altaMedico(Medico medico) {
		medico.setId(getUltimaId());
		this.mapMedicos.put(medico.getId(), medico);
		return grabarMapMedico();
	}

	public Medico getMedico(String id) {
		return this.mapMedicos.get(id);
	}

	private boolean grabarMapMedico() {
		return this.DAO.grabar(rutaDestino, this.mapMedicos);
	}

	private HashMap<String, Medico> leerMapMedico() {
		return this.DAO.leer(rutaDestino);
	}

	public HashMap<String, Medico> getMapMedicos() {
		return mapMedicos;
	}

	private String getUltimaId() {
		int contador = 0;
		for (String id : this.mapMedicos.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;
		}
		return String.valueOf(contador + 1);

	}
	
	public ArrayList<Medico> getListaEspecialidad(Especialidad especialidad) {
		ArrayList<Medico> seleccionados = new ArrayList<Medico>();
		for (Medico medico : this.mapMedicos.values()) {
			if (medico.getEspecialidad()==especialidad) {
				seleccionados.add(medico);
			}
		}
		return seleccionados;
		
	}
	// falta por hacer metodo para actualizar el horario???? preguntar a jose
}
