package modelo;

public class Tratamiento {

	private int idPaciente;
	private Medicamento medicamento;
	private String dosis;
	private String inicio;
	private String fin;

	public Tratamiento(int idPaciente, Medicamento medicamento, String dosis, String inicio, String fin) {
		super();
		this.idPaciente = idPaciente;
		this.medicamento = medicamento;
		this.dosis = dosis;
		this.inicio = inicio;
		this.fin = fin;
	}

	public int getIdPaciente() {
		return idPaciente;
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
