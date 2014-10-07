package es.upm.miw.pd.vehiculos.controladores;

import es.upm.miw.pd.vehiculos.modelos.GestorVehiculos;
import es.upm.miw.pd.vehiculos.modelos.Vehiculo;

public class VehiculoController {

	GestorVehiculos gestorVehiculos = new GestorVehiculos();

	public void a�adirVehiculo(Vehiculo vehiculo) {
		gestorVehiculos.a�adirVehiculo(vehiculo);
	}

	public void mostrarVehiculos() {
		gestorVehiculos.mostrarVehiculos();
	}

	public int darPrecio(int id, int diasAlquiler) {
		return 0;
	}
}
