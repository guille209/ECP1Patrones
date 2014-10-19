package es.upm.miw.pd.vehiculos.controladores;

import upm.jbb.IO;
import es.upm.miw.pd.vehiculos.modelos.Bicicleta;
import es.upm.miw.pd.vehiculos.modelos.Coche;
import es.upm.miw.pd.vehiculos.modelos.GestorVehiculos;
import es.upm.miw.pd.vehiculos.modelos.Moto;
import es.upm.miw.pd.vehiculos.modelos.Vehiculo;

public class VehiculoController {

	GestorVehiculos gestorVehiculos = new GestorVehiculos();

	public void mostrarVehiculos() {
		IO.out.clear();
		IO.out.println(gestorVehiculos.obtenerVehiculos());
	}

	public void mostrarFormAltaCoche() {
		this.gestorVehiculos.añadirVehiculo((Vehiculo) IO.in.read(Coche.class,
				"Introduzca un id y una descripción."));
	}

	public void mostrarFormAltaMoto() {
		this.gestorVehiculos.añadirVehiculo((Vehiculo) IO.in.read(Moto.class,
				"Introduzca un id y una descripción."));
	}

	public void mostrarFormAltaBicicleta() {
		this.gestorVehiculos.añadirVehiculo((Vehiculo) IO.in.read(
				Bicicleta.class, "Introduzca un id y una descripción."));
	}
	public void mostrarPrecio() {
		IO.out.clear();
        IO.out.println(this.gestorVehiculos.buscarVehiculo(IO.in.readInt("Introduzca el id del vehículo.")).calcularPrecio(IO.in.readInt("Introduzca el número de días a alquilar.")) + "€");
	}
}
