package control;

import java.util.ArrayList;

import modelo.Consulta;

public class GestorConsulta {

	private ArrayList<Consulta> consultas;

	public GestorConsulta(int numConsultas) {
		super();
		for (int i = 0; i < numConsultas; i++) {
			this.consultas.add(new Consulta());
		}
	}
}
