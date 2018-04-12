package KetvirtaPamoka;

public class Person extends PersonNames {

	
	public Person(String name, int age) {
		super(name, age);

	}

	@Override
	public String toString() {
		return "Person (name=" + name + " age=" + this.age + ")";
	}


}
