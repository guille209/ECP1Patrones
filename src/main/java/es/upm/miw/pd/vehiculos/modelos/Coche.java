package es.upm.miw.pd.vehiculos.modelos;

public class Coche extends Vehiculo {
	private CategoriaCoche categoria;
	private static final double primerDescuento = 0.8;
	private static final double segundoDescuento = 0.5;

	public Coche(int identificador, String descripcion, CategoriaCoche categoria) {
		super(identificador, descripcion);
		this.categoria = categoria;
	}

	@Override
	public double calcularPrecio(int diasAlquiler) {
		// TODO Auto-generated method stub
		double precio = 0.0;
		for (int i = 1; i <= diasAlquiler; i++) {
			if(i>=1 && i<=3){
				precio += categoria.value;
			} else if(i>=4 && i<=7){
				precio += categoria.value*primerDescuento;
			} else if(i<=8){
				precio += categoria.value*segundoDescuento;
				
			}
		}
		return precio;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Coche \n " + "Id: " + this.identificador + "\n"
				+ "Descripcion: " + this.descripcion + "\n"
				+ "Precio Alquiler: " + this.categoria.value + "\n" + "Categoria: "
				+ this.categoria;
	}

}
