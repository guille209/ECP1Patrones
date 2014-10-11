package es.upm.miw.pd.vehiculos.modelos.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.vehiculos.modelos.CategoriaCoche;
import es.upm.miw.pd.vehiculos.modelos.Coche;
import es.upm.miw.pd.vehiculos.modelos.GestorVehiculos;
import es.upm.miw.pd.vehiculos.modelos.Moto;

public class GestorVehiculosTest {

	GestorVehiculos gestorVehiculos;

	@Before
	public void before() {
		gestorVehiculos = new GestorVehiculos();

	}

	@Test
	public void testAñadirBuscarVehiculo() {
		Coche coche = new Coche(111, "Descripcion", CategoriaCoche.A);
		gestorVehiculos.añadirVehiculo(coche);
		assertEquals(coche, gestorVehiculos.buscarVehiculo(111));

	}

	@Test
	public void testDarPrecio() {
		Moto moto= new Moto(222, "Descripcion");
		assertEquals(8.0,gestorVehiculos.darPrecio(222, 8),10e-3);
	}
}
