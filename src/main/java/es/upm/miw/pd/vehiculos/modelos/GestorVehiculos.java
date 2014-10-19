package es.upm.miw.pd.vehiculos.modelos;

//En el gestor nunca un metodo llamado mostrar algo
import java.util.HashMap;
import java.util.Map;

public class GestorVehiculos {
	Map<Integer, Vehiculo> vehiculos = new HashMap<Integer, Vehiculo>();

	public void añadirVehiculo(Vehiculo vehiculo) {
		vehiculos.put(vehiculo.identificador, vehiculo);
	}

	public Map<Integer, Vehiculo> obtenerVehiculos() {
		return vehiculos;
	}

	public Vehiculo buscarVehiculo(int id) {
		return vehiculos.get(id);

	}

	public double darPrecio(int id, int diasAlquiler) {

		Vehiculo vehiculo = vehiculos.get(id);
		double precio = -1.0;
		if (vehiculo != null) {
			precio = vehiculo.calcularPrecio(diasAlquiler);
		}
		return precio;
	}

}
