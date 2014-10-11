package es.upm.miw.pd.vehiculos.modelos;

//En el gestor nunca un mostrar algo
import java.util.ArrayList;

public class GestorVehiculos {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public void añadirVehiculo(Vehiculo vehiculo) {

		vehiculos.add(vehiculo);
	}

	public void mostrarVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.toString());
		}
	}

	public double darPrecio(int id, int diasAlquiler) {
		int indice = 0;
		double precio = 0.0;
		do {
			if (vehiculos.get(indice).identificador == id) {
				precio =  vehiculos.get(indice).calcularPrecio(diasAlquiler);
			}
			indice++;
		} while (indice < vehiculos.size());
		return precio;
	}

}
