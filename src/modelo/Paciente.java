package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Paciente extends Persona implements Serializable {

	private ArrayList<Cita> citas;
	private ArrayList<Cita> citasPendientes;
	private ArrayList<Tratamiento> tratamientos;
	private ArrayList<Intervencion> intervenciones;

	public Paciente(String nombre, String apellidos, String direccion, String nacimiento, String telefono) {
		super(telefono, nombre, apellidos, direccion, nacimiento);
		this.citas = new ArrayList<Cita>();
		this.citasPendientes = new ArrayList<Cita>();
		this.tratamientos = new ArrayList<Tratamiento>();
		this.intervenciones = new ArrayList<Intervencion>();
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public ArrayList<Cita> getCitasPendientes() {
		return citasPendientes;
	}

	public ArrayList<Tratamiento> getTratamientos() {
		return tratamientos;
	}

	public ArrayList<Intervencion> getIntervenciones() {
		return intervenciones;
	}

	public String getFullName() {
		return getApellidos() + ", " + getNombre();

	}

	public void asignarCita(Cita cita) {
		this.citas.add(cita);
	}

	public void asigarTratamiento(Tratamiento tratamiento) {
		this.tratamientos.add(tratamiento);
	}

}
