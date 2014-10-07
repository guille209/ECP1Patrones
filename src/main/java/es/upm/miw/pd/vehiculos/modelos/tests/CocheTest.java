package es.upm.miw.pd.vehiculos.modelos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.vehiculos.modelos.CategoriaCoche;
import es.upm.miw.pd.vehiculos.modelos.Coche;

public class CocheTest {

	Coche coche;

	@Before
	public void before() {
		coche = new Coche(123, "desc",CategoriaCoche.A);

	}

	@Test
	public void testCalcularPrecio() {
		int dias = 2;
		assertEquals(10.0,coche.calcularPrecio(dias));
	}

	@Test
	public void testToString() {
		String msg="Coche \n " + "Id: 123\n"
				+ "Descripcion: desc\n"
				+ "Precio Alquiler: 99\n"
				+ "Categoria: A";
		assertEquals(msg,coche.toString());
	}

}
