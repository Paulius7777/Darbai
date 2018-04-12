package KetvirtaPamoka;

public class ClassA {
	protected int pirmas;
	protected int antras;
	
	
	public ClassA() {
		pirmas = 0;
		antras = 0;
	}


	public ClassA(int a, int b) {
		this.pirmas = a;
		this.antras = b;
	}


	public int getPirmas() {
		return pirmas;
	}


	public void setPirmas(int pirmas) {
		this.pirmas = pirmas;
	}


	public int getAntras() {
		return antras;
	}


	public void setAntras(int antras) {
		this.antras = antras;
	}
	
	public final void print(){
		System.out.println(getPirmas() + getAntras());
	}
}
