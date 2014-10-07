package es.upm.miw.pd.vehiculos.modelos;

public enum CategoriaCoche {
	A(10),
	B(15),
	C(20);
	
	public final int value;
	
	 private CategoriaCoche(final int nuevoValor) {
         value = nuevoValor;
     }

}
