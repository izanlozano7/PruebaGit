package Operaciones;

public class operacioneses {

	private int opA,opB;
	
	public operacioneses(int opA,int opB) {
		super();
		this.opA=opA;
		this.opB=opB;
		
	}
	public int resta() {
		return opA-opB;
	}

	public int suma() {
		
		return opA+opB;
	}
	
	public int getOpA() {
		return opA;
	}

	public void setOpA(int opA) {
		this.opA = opA;
	}

	public int getOpB() {
		return opB;
	}

	public void setOpB(int opB) {
		this.opB = opB;
	}
	
	
	
}
