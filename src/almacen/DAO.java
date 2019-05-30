package almacen;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.imageio.stream.FileImageInputStream;

public class DAO<T> {

	public boolean getGrabar(String ruta, T t, boolean adicion) {
		assert ruta != null && t != null;
		boolean retorno = true;
		boolean existe = new File(ruta).exists();
		FileOutputStream flujoG = abrir(ruta, adicion);
		ObjectOutputStream adaptador = null;
		try {
			adaptador = new ObjectOutputStream(flujoG);
			adaptador.writeObject(t);
		} catch (Exception e) {
			e.printStackTrace();
			retorno = false;
		}
		cerrarFlujo(adaptador);
		cerrarFlujo(flujoG);
		return retorno;
	}

	public T getLeer(String ruta) {
		assert ruta != null;
		T t = null;
		FileInputStream flujoI = abrir(ruta);
		if (flujoI != null) {
			try {
				ObjectInputStream adaptador = new ObjectInputStream(flujoI);
				t = (T) adaptador.readObject();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
				t = null;
			}
			cerrarFlujo(flujoI);
		}
		return t;
	}

	private boolean cerrarFlujo(Closeable closeable) {
		boolean retorno = true;
		try {
			closeable.close();
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}

	private FileInputStream abrir(String path) {
		File file = new File(path);
		assert file.exists();
		FileInputStream flujoR = null;
		try {
			flujoR = new FileInputStream(path);
		} catch (FileNotFoundException e) {
		}
		return flujoR;
	}

	private FileOutputStream abrir(String path, boolean adicion) {
		FileOutputStream flujoW = null;
		File file = new File(path);
		try {
			flujoW = new FileOutputStream(file, adicion);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flujoW;
	}
}
