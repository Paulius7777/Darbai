package pirma;

public class Pirma {

	public static void main(String[] args) {

			TestFinal a1 = new TestFinal(0);
			a1.plotas(2);
			System.out.println();
			
			StudentData st = new StudentData(18, "antras", "1999");
			st.setName("pirmas");
			System.out.println(st.toString());
			st.keistiVaradai("naujas vardas");
			System.out.println(st.toString());
			
	}

}
