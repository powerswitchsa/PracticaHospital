package modelo;

public class Respuesta {

	private boolean resultado;
	private String comentario;

	public Respuesta(boolean resultado, String comentario) {
		super();
		this.resultado = resultado;
		this.comentario = comentario;
	}

	public boolean isResultado() {
		return resultado;
	}

	public String getComentario() {
		return comentario;
	}

}
