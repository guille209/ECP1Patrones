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
		this.gestorVehiculos.a�adirVehiculo((Vehiculo) IO.in.read(Coche.class,
				"Introduzca un id y una descripci�n."));
	}

	public void mostrarFormAltaMoto() {
		this.gestorVehiculos.a�adirVehiculo((Vehiculo) IO.in.read(Moto.class,
				"Introduzca un id y una descripci�n."));
	}

	public void mostrarFormAltaBicicleta() {
		this.gestorVehiculos.a�adirVehiculo((Vehiculo) IO.in.read(
				Bicicleta.class, "Introduzca un id y una descripci�n."));
	}
	public void mostrarPrecio() {
		IO.out.clear();
        IO.out.println(this.gestorVehiculos.buscarVehiculo(IO.in.readInt("Introduzca el id del veh�culo.")).calcularPrecio(IO.in.readInt("Introduzca el n�mero de d�as a alquilar.")) + "�");
	}
}
