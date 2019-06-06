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
		boolean resultado = Pattern.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$*", nombre);
		return new Respuesta(resultado, (resultado? "nombre valido" : "nombre invalido"));
	}

	public static Respuesta validarApellido(String apellido) {
		return new Respuesta(Pattern.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$*", apellido), "");
	}

	// que no tenga numero el nombre de la calle, que empieze por C/, al final ponga un numero
	public static Respuesta validarDireccion(String direccion) {
		boolean resultado = Pattern.matches("C/[ ]([A-Z]{1}[a-z]+[ ]?){1,}$*[0-9]{1,}", direccion);
		return new Respuesta(resultado, (resultado? "direccion correcta" : "direccion incorrecta"));
	}

	public static Respuesta validarTelefono(String telefono) {
		return new Respuesta(Pattern.matches("[6-7-9]\\d{8}", telefono), "Es valido el telefono de contacto");
	}

	public static Respuesta validarNacimiento(String nacimiento) {
		boolean resultado = Pattern.matches("[0-9]{1,2}(/|-)[0-9]{1,2}(/|-)[0-9]{4}", nacimiento);
		return new Respuesta(resultado, (resultado? "fecha correcta" : "fecha incorrecta")) ;
	}

	public static Respuesta validarId(String id) {
		boolean resultado = Pattern.matches("[0-9]{1,}", id);
		return new Respuesta(resultado, (resultado? "ID correcta" : "ID incorrecta"));

	}
	
	
	

}
