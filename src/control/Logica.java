package control;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;

import almacen.GestorDTO;
import modelo.Calendario;
import modelo.Cita;
import modelo.Consulta;
import modelo.Intervencion;
import modelo.Medico;
import modelo.Paciente;
import modelo.Tratamiento;
import modelo.enums.*;
import vista.medico.AltaMedico;

public class Logica {

	private GestorDTO gestorDTO;
	private HashMap<String, Paciente> mapPaciente;
	private HashMap<String, Medico> mapMedico;
	private HashMap<String, Consulta> mapConsulta;
	private ArrayList<Cita> citas;
	private Calendario calendario;

	public Logica() {
		super();
		this.gestorDTO = new GestorDTO();

		this.calendario = this.gestorDTO.getLeerCalendario();
		if (this.calendario == null)
			this.calendario = new Calendario();

		this.mapPaciente = this.gestorDTO.getLeerMapPaciente();
		if (this.mapPaciente == null)
			this.mapPaciente = new HashMap<String, Paciente>();

		this.mapMedico = this.gestorDTO.getLeerMapMedico();
		if (this.mapMedico == null)
			this.mapMedico = new HashMap<String, Medico>();

		this.mapConsulta = this.gestorDTO.getLeerMapConsulta();
		if (this.getMapConsulta() == null) {
			this.mapConsulta = new HashMap<String, Consulta>();
			for (int i = 0; i < 4; i++) {
				if (i > 1) {
					this.mapConsulta.put(String.valueOf(i), new Consulta(String.valueOf(i), Especialidad.Cabecera));
				} else {
					this.mapConsulta.put(String.valueOf(i), new Consulta(String.valueOf(i), Especialidad.Especialista));
				}
			}
		}
		this.citas = this.gestorDTO.getLeerListCitas();
		if (this.citas == null)
			this.citas = new ArrayList<Cita>();
	}

	public boolean getAltaPaciente(Paciente paciente) {
		paciente.setId(getUltimaIdPaciente());
		this.mapPaciente.put(paciente.getId(), paciente);
		return this.gestorDTO.getGrabarPaciente(paciente) && this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public boolean getAltaMedico(Medico medico, Especialidad tipo, Turno turno,String id) {
		medico.setId(getUltimaIdMedico());
		this.mapMedico.put(medico.getId(), medico);
		this.mapConsulta.get(id).getAsignarMedico(medico);
		return this.gestorDTO.getGrabarMapMedico(this.mapMedico) && this.gestorDTO.getGrabarMapConsulta(this.mapConsulta);
	}

	public boolean getBajaPaciente(String id) {
		this.mapPaciente.remove(id);
		return this.gestorDTO.getEliminarPaciente(id);
	}

	public boolean modificarPaciente(String id, String telefono, String direccion) {
		Paciente paciente = this.mapPaciente.get(id);
		paciente.setTelefono(telefono);
		paciente.setDireccion(direccion);
		this.mapPaciente.remove(id);
		this.mapPaciente.put(paciente.getId(), paciente);
		return this.gestorDTO.getGrabarPaciente(paciente) && this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public ArrayList<String> getConsultaVacante(Especialidad tipo) {
		ArrayList<String> idConsulta = new ArrayList<String>();
		for (Consulta consulta : this.mapConsulta.values()) {
			if (consulta.getVacantes() && consulta.getEspecialidad() == tipo) {
				idConsulta.add(consulta.getId());
			}
		}
		return idConsulta;
	}

	public Especialidad getEspecialidadCombo(String especialidad) {
		for (Especialidad espe : Especialidad.values()) {
			if (espe.name() == especialidad) {
				return espe;
			}
		}
		return null;
	}

	private String getUltimaIdPaciente() {
		int contador = 0;
		for (String id : this.mapPaciente.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;
		}
		return String.valueOf(contador + 1);
	}

	private String getUltimaIdMedico() {
		int contador = 0;
		for (String id : this.mapMedico.keySet()) {
			int num = Integer.valueOf(id);
			contador = contador < num ? num : contador;
		}
		return String.valueOf(contador + 1);
	}

	public Medico getMedicoFromName(String fullName) {
		for (Medico medico : this.mapMedico.values()) {
			if (medico.getFullName().equals(fullName))
				return medico;
		}
		return null;
	}

	public Paciente getPacienteFromNombre(String fullName) {
		for (Paciente paciente : this.mapPaciente.values()) {
			if (paciente.getFullName().equals(fullName))
				return paciente;
		}
		return null;
	}

	public ArrayList<Medico> getEspecialidadMedico(Especialidad especialidad) {
		ArrayList<Medico> seleccionados = new ArrayList<Medico>();
		for (Medico medico : this.mapMedico.values()) {
			if (medico.getEspecialidad() == especialidad) {
				seleccionados.add(medico);
			}
		}
		return seleccionados;
	}

	public boolean getCitaOperacion(String nombreCirujano, String nombreMedico, String idPaciente,
			TipoOperacion tipoOperacion) {
		Intervencion intervencion = new Intervencion(getMedicoFromName(nombreMedico), getMedicoFromName(nombreMedico),
				tipoOperacion, false, "");
		Paciente paciente = this.mapPaciente.get(idPaciente);
		this.gestorDTO.getGrabarPaciente(paciente);
		this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
		paciente.asiganarIntervencion(intervencion);
		return this.gestorDTO.getGrabarPaciente(paciente) && this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public boolean getCita(String id, String nombreMedico, String coordenada, String hora) {
		String[] posicion = coordenada.split(";");
		int i = Integer.valueOf(posicion[0]);
		int j = Integer.valueOf(posicion[1]);
		Medico medico = getMedicoFromName(nombreMedico);
		Cita cita = new Cita(medico, getPaciente(id), this.calendario.getDiaSemana()[j] + ", " + hora, false, "");
		Paciente paciente = cita.getPaciente();
		this.citas.add(cita);
		paciente.addCita(cita);
		medico.asignarHora(i, j);
		for (Consulta consultas : this.mapConsulta.values()) {
			if (consultas.getMedicos().contains(medico)) {
				consultas.asignarHora(i, j);
			}
		}
		return this.gestorDTO.getGrabarCitas(this.citas) && this.gestorDTO.getGrabarPaciente(paciente)
				&& this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public ArrayList<Medico> getMedicosAtenderCita() {
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		for (Cita cita : this.citas) {
//			System.out.println(cita.getFecha() + " " + this.calendario.getFecha());
			if (cita.getFecha().equals(this.calendario.getFecha()))
				medicos.add(cita.getMedico());
		}
		return medicos;
	}

	public Cita getCitaPorMedico(String medico) {
		for (Cita cita : citas) {
			if (cita.getMedico() == getMedicoFromName(medico) && cita.getFecha().equals(this.calendario.getFecha())) {
				return cita;
			}
		}
		return null;
	}

	public void getAddTratamiento(String nombrePaciente, String dosis, String periodo, Medicamento medicamento) {
		Paciente paciente = this.getPacienteFromNombre(nombrePaciente);
		Cita cita = null;
		for (Cita a : citas) {
			if (cita.getPaciente() == getPacienteFromNombre(nombrePaciente)
					&& cita.getFecha().equals(this.calendario.getFecha())) {
				cita = a;
			}
		}
		cita.setAsistencia(true);
		this.citas.remove(cita);
		paciente.getAddTratamiento(new Tratamiento(medicamento, dosis, periodo));
		this.gestorDTO.getGrabarPaciente(paciente);
		this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public void getPasarHora() {
		this.calendario.sumarHora();
		for (Iterator iterator = citas.iterator(); iterator.hasNext();) {
			Cita cita = (Cita) iterator.next();
			if (this.calendario.isRealizado(cita.getFecha())) {
				cita.setAsistencia(true);
				this.gestorDTO.getGrabarPaciente(cita.getPaciente());
				iterator.remove();
			}
		}
		this.gestorDTO.getGrabarCalendario(this.calendario);
		this.gestorDTO.getGrabarCitas(this.citas);
		this.gestorDTO.getGrabarMapPaciente(this.mapPaciente);
	}

	public String getFecha() {
		return this.calendario.getFecha();
	}

	public HashMap<String, Paciente> getMapPaciente() {
		return this.mapPaciente;
	}

	public Paciente getPaciente(String id) {
		return this.mapPaciente.get(id);
	}

	public HashMap<String, Medico> getMapMedico() {
		return this.mapMedico;
	}

	public Medico getMedico(String id) {
		return this.mapMedico.get(id);
	}

	public HashMap<String, Consulta> getMapConsulta() {
		return this.mapConsulta;
	}

}
