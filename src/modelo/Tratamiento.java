package modelo;

import java.io.Serializable;

import modelo.enums.Medicamento;

public class Tratamiento implements Serializable {

	private Medicamento medicamento;
	private String dosis;
	private String inicio;
	private String fin;

	public Tratamiento(Medicamento medicamento, String dosis, String inicio, String fin) {
		super();
		this.medicamento = medicamento;
		this.dosis = dosis;
		this.inicio = inicio;
		this.fin = fin;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public String getDosis() {
		return dosis;
	}

	public String getInicio() {
		return inicio;
	}

	public String getFin() {
		return fin;
	}

}
