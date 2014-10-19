package es.upm.miw.pd.vehiculos.main;
import es.upm.miw.pd.vehiculos.controladores.VehiculoController;
import upm.*;
import upm.jbb.IO;

public class VehiculosMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiculoController controller = new VehiculoController();
		IO.out.addController(controller);

	}

}
