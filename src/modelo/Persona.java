package modelo;

public abstract class Persona {

	private int id;
	private String telefono;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String nacimiento;

	public Persona(Medico medico) {
		super();
		this.telefono = medico.getTelefono();
		this.nombre = medico.getNombre();
		this.apellidos = medico.getApellidos();
		this.direccion = medico.getDireccion();
		this.nacimiento = medico.getNacimiento();
	}

	public Persona(String telefono, String nombre, String apellidos, String direccion, String nacimiento) {
		super();
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.nacimiento = nacimiento;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setId(int id) {
		this.id = id;
	}

}
