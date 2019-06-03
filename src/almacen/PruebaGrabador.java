package almacen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Paciente;

public class PruebaGrabador {
	public static void main(String[] args) {

		String carpPacientes = "resource/pacientes/1.dat";
		DAO<Paciente> dao = new DAO<Paciente>();
		dao.grabar(carpPacientes, new Paciente("hola", "hola", "hola", "hola", "hola"));

		Paciente paciente = leer(carpPacientes);
		System.out.println(paciente != null);

		System.out.println(paciente.getFullName());
	}

	public static Paciente leer(String ruta) {
		assert ruta != null;
		Paciente t = null;
		if (new File(ruta).exists()) {
			try {
				FileInputStream flujoR = new FileInputStream(ruta);
				ObjectInputStream lector = new ObjectInputStream(flujoR);
				t = (Paciente) lector.readObject();
				flujoR.close();
			} catch (Exception e) {
				System.out.println("No se puede leer");
			}
		}
		return t;
	}
}
