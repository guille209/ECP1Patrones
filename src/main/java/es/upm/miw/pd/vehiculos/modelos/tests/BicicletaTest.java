package es.upm.miw.pd.vehiculos.modelos.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.vehiculos.modelos.Bicicleta;

public class BicicletaTest {

	Bicicleta bicicleta;
	
	@Before
	public void before(){
		bicicleta = new Bicicleta(112,"desc");
	}
	@Test
	public void testCalcularPrecio() {
		int dias = 2;
		assertEquals(3.0,bicicleta.calcularPrecio(dias),10e-3);
	}

	@Test
	public void testToString() {
		String msg="Bici \n " + "Id: " + bicicleta.identificador + "\n"
				+ "Descripcion: " + bicicleta.descripcion;
		assertEquals(msg,bicicleta.toString());
	}

}
