package almacen;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import modelo.Cita;
import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;

public class GestorDTO {

	private DTO<Paciente> dtoPaciente = new DTO<Paciente>();

	private DTO<ArrayList<Cita>> dtoCitas = new DTO<ArrayList<Cita>>();

	private DTO<HashMap<String, Paciente>> dtoMapPaciente = new DTO<HashMap<String, Paciente>>();
	private DTO<HashMap<String, Medico>> dtoMapMedico = new DTO<HashMap<String, Medico>>();
	private DTO<HashMap<String, Consulta>> dtoConsulta = new DTO<HashMap<String, Consulta>>();

	private final String rutaMapPaciente = "./resource/MapPacientes.dat";
	private final String rutaMapMedico = "./resource/MapMedicos.dat";
	private final String rutaListCitas = "./resource/ListCitas.dat";
	private final String rutaMapConsulta = "./resource/MapConsultas.dat";

	private final String rutaDirectorioPacientes = "resource/pacientes";

	public GestorDTO() {
		super();
		File file = new File(this.rutaDirectorioPacientes);
		if (!file.exists())
			file.mkdir();
	}

	public boolean getGrabarPaciente(Paciente paciente) {
		return this.dtoPaciente.grabar(paciente, getRutaPaciente(paciente.getId()));
	}

	public Paciente getLeerPaciente(String id) {
		return this.dtoPaciente.leer(getRutaPaciente(id));
	}

	public boolean getGrabarMapPaciente(HashMap<String, Paciente> object) {
		return this.dtoMapPaciente.grabar(object, this.rutaMapPaciente);
	}

	public HashMap<String, Paciente> getLeerMapPaciente() {
		return this.dtoMapPaciente.leer(this.rutaMapPaciente);
	}

	public boolean getGrabarMapMedico(HashMap<String, Medico> object) {
		return this.dtoMapMedico.grabar(object, this.rutaMapMedico);
	}

	public HashMap<String, Medico> getLeerMapMedico() {
		return this.dtoMapMedico.leer(this.rutaMapMedico);
	}

	public boolean getGrabarCitas(ArrayList<Cita> citas) {
		return this.dtoCitas.grabar(citas, this.rutaListCitas);
	}

	public ArrayList<Cita> getLeerListCitas() {
		return this.dtoCitas.leer(this.rutaListCitas);
	}

	public boolean getGrabarMapConsulta(HashMap<String, Consulta> consultas) {
		return this.dtoConsulta.grabar(consultas, this.rutaMapConsulta);
	}

	public HashMap<String, Consulta> getLeerMapConsulta() {
		return this.dtoConsulta.leer(this.rutaMapConsulta);
	}

	public boolean getEliminarPaciente(String id) {
		return new File(getRutaPaciente(id)).delete();
	}

	private String getRutaPaciente(String id) {
		return "./resource/pacientes/" + id + ".dat";
	}

}
