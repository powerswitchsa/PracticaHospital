package modelo;

import java.io.Serializable;

import modelo.enums.Medicamento;

public class Tratamiento implements Serializable {

	private Medicamento medicamento;
	private String dosis;
	private String periodo;

	public Tratamiento(Medicamento medicamento, String dosis, String periodo) {
		super();
		this.medicamento = medicamento;
		this.dosis = dosis;
		this.periodo = periodo;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public String getDosis() {
		return dosis;
	}

	public String getInicio() {
		return periodo;
	}

}
