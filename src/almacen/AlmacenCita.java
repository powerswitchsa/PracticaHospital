package almacen;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.Cita;
import modelo.Especialidad;
import modelo.Medico;
import modelo.Paciente;
import modelo.Turno;

public class AlmacenCita {
	private DAO<ArrayList<Cita>> DAOindice;
	private ArrayList<Cita> ArrayCitasPendientes;
	private DAO<Cita> DAOcita;
	private String rutaDestino = "./resource/citas.dat";

	public AlmacenCita() {
		super();
//		valores para probar a pelo
		Medico medico= new Medico("Señor Don Gato", "Conejo", "a", "81274982", Especialidad.Cabecera, Turno.mañana);
		Paciente paciente= new Paciente("Susanita", "gato", "jiasjfi", "157812", "129582");
		Cita citaPrueba= new Cita(medico, paciente, "129", false, "bien");
		this.DAOindice = new DAO<ArrayList<Cita>>();
		this.DAOcita = new DAO<Cita>();
//		-------------------------------
		File file = new File(rutaDestino);
		if (!file.exists()) {
			this.ArrayCitasPendientes = new ArrayList< Cita>();
			grabarArrayCitaPendiente();
			} else {
			this.ArrayCitasPendientes = leerArrayCita();
		}
	}
	private ArrayList<Cita> leerArrayCita() {
		// TODO Auto-generated method stub
		return this.DAOindice.leer(rutaDestino);
	}

	private boolean grabarArrayCitaPendiente() {
		// TODO Auto-generated method stub
		return this.DAOindice.grabar(rutaDestino, this.ArrayCitasPendientes);
	}

	public ArrayList<Cita> getArrayCita() {
		// TODO Auto-generated method stub
		return ArrayCitasPendientes;
	}

}
