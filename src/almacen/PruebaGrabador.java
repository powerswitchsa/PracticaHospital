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

		String carpPacientes = "resource/pacientes";
		File file = new File(carpPacientes);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
		file.mkdir();

		Paciente paciente = new Paciente("fran", "delgado", "puebla", "4/10/96", "23423223230");

		Paciente aux = null;
		ArrayList<Paciente> list = new ArrayList<Paciente>();
		list.add(paciente);

		try {
			FileOutputStream flujoW = new FileOutputStream(carpPacientes + "/Nº1.dat");
			ObjectOutputStream adaptador = new ObjectOutputStream(flujoW);
			adaptador.writeObject(list);
			flujoW.close();
		} catch (Exception e) {
			System.out.println("No lo puede grabar");
		}

		try {
			FileInputStream flujoR = new FileInputStream(carpPacientes + "/Nº1.dat");
			ObjectInputStream lector = new ObjectInputStream(flujoR);
			list = (ArrayList<Paciente>) lector.readObject();
			flujoR.close();
		} catch (Exception e) {
			System.out.println("No lo puede leer");
		}

		for (Paciente paciente2 : list) {
			System.out.println(paciente2.getFullName());
		}
	}
}
