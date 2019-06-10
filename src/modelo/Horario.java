package modelo;

import java.io.Serializable;

public class Horario implements Serializable {

	private boolean[][] horario = new boolean[8][5];

	public void setAsignarCasilla(int i, int j) {
		this.horario[i][j] = true;
	}

	public void setAllFalse() {
		for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario.length; j++) {
				this.horario[i][j] = false;
			}
		}
	}

	public boolean[][] getHorario() {
		return horario;
	}

	public void setDesmarcar(int i, int j) {
		this.horario[i][j] = false;
	}
}
