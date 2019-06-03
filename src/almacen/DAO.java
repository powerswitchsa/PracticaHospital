
package almacen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAO<T> {

	public boolean grabar(String ruta, T t) {
		assert ruta != null && t != null;
		boolean retorno = true;
		try {
			FileOutputStream flujoW = new FileOutputStream(ruta);
			ObjectOutputStream adaptador = new ObjectOutputStream(flujoW);
			adaptador.writeObject(t);
			flujoW.close();
		} catch (Exception e) {
			System.out.println("No se puede grabar");
			retorno = false;
		}
		return retorno;

	}

	public T leer(String ruta) {
		assert ruta != null;
		T t = null;
		if (new File(ruta).exists()) {
			try {
				FileInputStream flujoR = new FileInputStream(ruta);
				ObjectInputStream lector = new ObjectInputStream(flujoR);
				t = (T) lector.readObject();
				flujoR.close();
			} catch (Exception e) {
				System.out.println("No se puede leer");
			}
		}
		return t;
	}

}
