package es.upm.miw.pd.vehiculos.modelos;

public class GestorVehiculos {
	private Vehiculo[] vehiculos = new Vehiculo[3];

	public void aņadirVehiculo(Vehiculo vehiculo) {

	}

	public void mostrarVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.toString());
		}
	}
	


}
