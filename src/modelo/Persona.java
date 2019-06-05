package modelo;

import java.io.Serializable;
import java.util.regex.Pattern;

public abstract class Persona implements Serializable {

	private String id;
	private String telefono;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String nacimiento;

	public Persona(String telefono, String nombre, String apellidos, String direccion, String nacimiento) {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDireccion(direccion);
		this.setNacimiento(nacimiento);
		this.setTelefono(telefono);
	}

	public Persona(String telefono, String nombre, String apellidos, String direccion) {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
	}

	public String getId() {
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

	public void setId(String id) {
		assert id != null && validarId(id).isResultado();
		this.id = id;
	}

	public void setTelefono(String telefono) {
		assert telefono != null && validarTelefono(telefono).isResultado();
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		assert nombre != null && validarNombre(nombre).isResultado();
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		assert apellidos != null && validarApellido(apellidos).isResultado();
		this.apellidos = apellidos;
	}

	public void setDireccion(String direccion) {
		assert direccion != null && validarDireccion(direccion).isResultado();
		this.direccion = direccion;
	}

	public void setNacimiento(String nacimiento) {
		assert nacimiento != null && validarNacimiento(nacimiento).isResultado();
		this.nacimiento = nacimiento;
	}

	public String setFullName() {
		return this.apellidos + ", " + this.nombre;
	}

	@Override
	public String toString() {
		return setFullName();
	}

	// validadores

	public static Respuesta validarNombre(String nombre) {
		return new Respuesta(Pattern.matches("", nombre), "");
	}

	public static Respuesta validarApellido(String apellido) {
		return new Respuesta(Pattern.matches("", apellido), "");
	}

	public static Respuesta validarDireccion(String direccion) {
		return new Respuesta(Pattern.matches("", direccion), "");
	}

	public static Respuesta validarTelefono(String telefono) {
		return new Respuesta(Pattern.matches("", telefono), "");
	}

	public static Respuesta validarNacimiento(String nacimiento) {
		return new Respuesta(Pattern.matches("", nacimiento), "");
	}

	public static Respuesta validarId(String id) {
		return new Respuesta(Pattern.matches("", id), "");

	}

}
