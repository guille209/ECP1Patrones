package es.upm.miw.pd.vehiculos.modelos;

public class Bicicleta extends Vehiculo {
	public static final double primerPrecio = 3.0;
	public static final double segundoPrecio = 2.0;

	public Bicicleta(int identificador, String descripcion) {
		super(identificador, descripcion);

	}

	@Override
	public double calcularPrecio(int diasAlquiler) {
		// TODO Auto-generated method stub
		double precio = 0.0;
		for (int i = 1; i <= diasAlquiler; i++) {
			if (i >= 2) {
				precio = 3.0;
			} else if (i < 2) {
				precio = 2.0;		
				}
		}

		return precio;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bici \n " + "Id: " + this.identificador + "\n"
				+ "Descripcion: " + this.descripcion + "\n";
	}

}
