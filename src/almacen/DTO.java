package almacen;

public class DTO<T> {

	private DAO<T> dao = new DAO<T>();

	public boolean grabar(T object, String ruta) {
		return dao.grabar(ruta, object);
	}

	public T leer(String ruta) {
		return dao.leer(ruta);
	}
}
