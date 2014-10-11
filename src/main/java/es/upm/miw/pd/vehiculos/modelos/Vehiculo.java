package es.upm.miw.pd.vehiculos.modelos;

public abstract class Vehiculo {
	protected int identificador;
	protected String descripcion;

	public Vehiculo(int identificador, String descripcion) {
		// TODO Auto-generated constructor stub
		this.identificador = identificador;
		this.descripcion = descripcion;

	}

	public abstract double calcularPrecio(int diasAlquiler);

	public abstract String toString();

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
