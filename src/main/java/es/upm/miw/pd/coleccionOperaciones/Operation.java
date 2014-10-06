package es.upm.miw.pd.coleccionOperaciones;

public abstract class Operation {

	protected final int operator1;
	protected final int operator2;

	public Operation(int operator1, int operator2) {
		this.operator1 = operator1;
		this.operator2 = operator2;

	}

	public abstract int operate();
}
