package almacen;

import java.util.ArrayList;

import modelo.Medico;

public class AlmacenMedico {

	private DAO<ArrayList<Medico>> DAO;
	private ArrayList<Medico> medicos;
	private String rutaDestino = "./resource/Medicos/medicos.dat";

	public AlmacenMedico() {
		super();

	}

}
