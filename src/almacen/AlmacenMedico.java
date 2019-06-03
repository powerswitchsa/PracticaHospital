package almacen;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.Medico;

public class AlmacenMedico {

	private DAO<HashMap<String, Medico>> DAO;
	private HashMap<String, Medico> mapMedicos;
	private String rutaDestino = "./resource/Medicos/medicos.dat";

	public AlmacenMedico() {
		super();
		this.DAO = new DAO<HashMap<String, Medico>>();
		File file = new File(rutaDestino);
		if (!file.exists()) {
			file.mkdir();
		}
	}
	public boolean bajaMedico(String id) {
		this.mapMedicos.remove(id);
		return false;
		
	}
	private boolean grabarMapMedico() {
		return this.DAO.grabar(rutaDestino, this.mapMedicos);
	}
}
