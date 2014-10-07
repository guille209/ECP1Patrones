package es.upm.miw.pd.vehiculos.modelos;

public class Moto extends Vehiculo {

	private static final double precioMenosSemana = 8.0;
	private static final double precioMasSemana = 7.0;

	public Moto(int identificador, String descripcion) {
		super(identificador, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio(int diasAlquiler) {
		// TODO Auto-generated method stub
		double precioFinal = 0.0;
		if(diasAlquiler<=7){
			precioFinal = precioMenosSemana;
		}else if(diasAlquiler<7){
			precioFinal = precioMasSemana;
		}
		return precioFinal;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "Coche \n " + "Id: " + this.identificador + "\n"
				+ "Descripcion: " + this.descripcion;
	}

}
