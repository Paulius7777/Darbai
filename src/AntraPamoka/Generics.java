package AntraPamoka;


public class Generics <T, V>{
	T key;
	V values;
	
	public Generics(){
	}

	public Generics(T key, V values) {
		this.key = key;
		this.values = values;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public V getValues() {
		return values;
	}

	public void setValues(V values) {
		this.values = values;
	}
	
	public static void main(String[] args) {

		System.out.println("Max of 3, 4, 5 :   " + max(30, 4, 5));
		System.out.println("Min of 3, 4, 5 :   " + min(-10, 4, 5));
		addition(2.5f, 9);
		Generics<String, Integer> pirma = new Generics<>();
		pirma.setKey("a");
		pirma.setValues(1);
		System.out.println("spausdinam String Integer: " + pirma.getKey() + " " + pirma.getValues());
		Generics<Integer, String> antras = new Generics<>(2,"b");
		System.out.println("spausdinam String Integer: " + antras.getKey() + " " + antras.getValues());
		
	}



	private static <T extends Number> double addition(T x, T y) {
		System.out.println("Paduodami skirtingi tipai: " + x + " ir "+ y);
		double sum = x.doubleValue() + y.doubleValue();
		System.out.println("Suma skirtingu tipu: " + sum);
		return sum;
		
	}

	public static  <T extends Comparable<T>> T min(T x, T y, T z) {
		T min = x;
		if (y.compareTo(min) < 0) {
			min = y;
		}
		if (z.compareTo(min) < 0) {
			min = z;
		}
		return min;
	}

	private static <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	
	
}
