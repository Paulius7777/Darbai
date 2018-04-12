package KetvirtaPamoka;

public class AtraUzduotisA {

	public static void main(String[] args) {
		ClassA a = new ClassA(5,7);
		a.setPirmas(5);
		a.setAntras(7);
		a.print();
		ClassB b = new ClassB(2,7);
		b.print();
		ClassC c = new ClassC();
		c.print();

	}

}
