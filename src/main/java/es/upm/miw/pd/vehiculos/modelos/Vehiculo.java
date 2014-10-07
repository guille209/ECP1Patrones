package es.upm.miw.pd.vehiculos.modelos;

public abstract class Vehiculo {
	private int identificador;
	private String descripcion;
	private int precioAlquiler;
	private int diasAlquiler;
	
	public abstract int calcularPrecio();
	public abstract int darPrecio(int id, int diasAlquiler);
	public abstract String toString();
}
