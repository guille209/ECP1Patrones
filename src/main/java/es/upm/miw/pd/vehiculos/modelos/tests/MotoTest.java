package es.upm.miw.pd.vehiculos.modelos.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.vehiculos.modelos.CategoriaCoche;
import es.upm.miw.pd.vehiculos.modelos.Coche;
import es.upm.miw.pd.vehiculos.modelos.Moto;

public class MotoTest {

	Moto moto;

	@Before
	public void before() {
		moto = new Moto(123, "desc");

	}

	@Test
	public void testCalcularPrecio() {
		int dias = 2;
		assertEquals(10.0,moto.calcularPrecio(dias),10e-3);
	}

	@Test
	public void testToString() {
		String msg="Coche \n " + "Id: " + this.identificador + "\n"
				+ "Descripcion: " + this.descripcion;
		assertEquals(msg,moto.toString());
	}


}
