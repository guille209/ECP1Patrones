package es.upm.miw.pd.coleccionOperaciones;

public class Mutiplication extends Operation {
	
	public Mutiplication(final int operator1, final int operator2) {
		super(operator1,operator2);
	}

	public int getOperator1() {
		return operator1;
	}

	public int getOperator2() {
		return operator2;
	}

	@Override
	public String toString() {
		return "[" + operator1 + "x" + operator2 + "]";
	}

	@Override
	public int operate() {
		// TODO Auto-generated method stub
		return this.operator1 * this.operator2;
	}

}
