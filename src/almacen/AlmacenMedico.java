package almacen;

import java.io.File;
import java.util.ArrayList;

import modelo.Medico;

public class AlmacenMedico {

	private DAO<ArrayList<Medico>> DAO;
	private ArrayList<Medico> medicos;
	private String rutaDestino = "./resource/Medicos/medicos.dat";

	public AlmacenMedico(ArrayList<Medico> medicos) {
		super();
		this.DAO = new DAO<ArrayList<Medico>>();
		File file = new File(this.rutaDestino);
		if (!file.exists())
			this.medicos = new ArrayList<Medico>();
		else
			this.medicos = this.DAO.getLeer(this.rutaDestino);
	}

	private boolean grabar() {
		return this.DAO.getGrabar(rutaDestino, this.medicos, false);
	}

	private void leer() {
		this.DAO.getLeer(rutaDestino);
	}

	public boolean getAltaMedico(Medico medico) {
		boolean retorno = false;
		if (!this.medicos.contains(medico)) {
			this.medicos.add(medico);
			grabar();
			retorno = true;
		}
		return retorno;
	}

	public Medico getMedico(int id) {
		for (Medico medico : this.medicos) {
			if (medico.getId() == id)
				return medico;
		}
		return null;
	}

	public Medico getMedico(String nombre) {
		for (Medico medico : this.medicos) {
			if (medico.getNombre().equals(nombre))
				return medico;
		}
		return null;
	}

	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

}
