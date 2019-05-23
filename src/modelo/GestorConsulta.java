package modelo;

import java.util.ArrayList;

public class GestorConsulta {

	private ArrayList<Consulta> consultas;

	public GestorConsulta(int numConsultas) {
		super();
		for (int i = 0; i < numConsultas; i++) {
			this.consultas.add(new Consulta());
		}
	}
}
