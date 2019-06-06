package almacen;

import java.io.File;
import java.util.HashMap;

import modelo.Consulta;
import modelo.Medico;

public class AlmacenConsulta {
	private DAO<HashMap<String, Consulta>> dao;
	private HashMap<String, Consulta> mapConsulta;
	private String rutaDestino = "./resource/consultas.dat";

	public AlmacenConsulta() {
		super();
		this.dao = new DAO<HashMap<String, Consulta>>();
		File file = new File(rutaDestino);
		if (!file.exists()) {
			this.mapConsulta = new HashMap<String, Consulta>();
			for (int i = 0; i < 5; i++) {
				altaConsulta(new Consulta(getUltimaIdConsulta())); 
			}
		} else {
			this.dao.leer(rutaDestino);
		}
	}

	public HashMap<String, Consulta> getMapaConsulta() {
		return mapConsulta;
	}

	public boolean altaConsulta(Consulta consulta) {
		consulta.setId(getUltimaIdConsulta());
		this.mapConsulta.put(consulta.getId(), consulta);
		return dao.grabar(rutaDestino, this.mapConsulta);
	}

	private String getUltimaIdConsulta() {
		int contador = 0;
		for (String id : this.mapConsulta.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;
		}
		return String.valueOf(contador + 1);
	}
	public boolean[][] getHorario(Medico medico){
		for (Consulta consulta : this.mapConsulta.values()) {
				if (consulta.isTrabajando(medico)) {
					return consulta.getHorarios();
				}
		}
		return null;
		
	}
}
