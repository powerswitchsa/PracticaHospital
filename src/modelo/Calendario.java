package modelo;

import java.io.Serializable;

public class Calendario implements Serializable {

	private int dia;
	private String hora;

	private String[] diaSemana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };

	public Calendario() {
		super();
		this.dia = 0;
		this.hora = "00:00";
	}

	public void sumarHora() {
		String[] h = hora.split(":");
		int i = Integer.valueOf(h[0]);
		i++;
		if (i == 24) {
			hora = "00:00";
			dia++;
		} else {
			if (i < 10)
				hora = "0" + i + ":" + h[1];
			else
				hora = i + ":" + h[1];
		}
		if (dia == 5)
			dia = 0;
	}

	public boolean isRealizado(String fecha) {
		String[] cadena = fecha.split(", ");
		int diaCita = 0, horaCita = 0, horaActual = 0;
		for (int i = 0; i < this.diaSemana.length; i++) {
			if (this.diaSemana[i] == cadena[0]) {
				diaCita = i;
			}
		}
		String[] horasSeparada = cadena[1].split(":");
		horaCita = Integer.valueOf(horasSeparada[0]);
		horasSeparada = this.hora.split(":");
		horaActual = Integer.valueOf(horasSeparada[0]);
		return this.dia >= diaCita && horaActual > horaCita;
	}

	public String getFecha() {
		return this.diaSemana[this.dia] + ", " + hora;
	}

	public int getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

	public String[] getDiaSemana() {
		return diaSemana;
	}

}
