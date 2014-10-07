package es.upm.miw.pd.vehiculos.modelos;

public abstract class Vehiculo {
	protected int identificador;
	protected String descripcion;

	public Vehiculo(int identificador, String descripcion) {
		// TODO Auto-generated constructor stub

	}

	public abstract double calcularPrecio(int diasAlquiler);

	public abstract String toString();
}
