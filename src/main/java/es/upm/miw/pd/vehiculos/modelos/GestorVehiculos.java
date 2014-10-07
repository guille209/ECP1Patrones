package es.upm.miw.pd.vehiculos.modelos;

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

	public int darPrecio(int id, int diasAlquiler) {
		return 0;
	}

}
