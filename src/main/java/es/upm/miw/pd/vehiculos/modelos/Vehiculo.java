package es.upm.miw.pd.vehiculos.modelos;

public abstract class Vehiculo {
	public int identificador;
	public String descripcion;

	public Vehiculo(int identificador, String descripcion) {
		// TODO Auto-generated constructor stub
		this.identificador = identificador;
		this.descripcion = descripcion;

	}

	public abstract double calcularPrecio(int diasAlquiler);

	public abstract String toString();
}
