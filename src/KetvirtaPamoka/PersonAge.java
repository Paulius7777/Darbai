package KetvirtaPamoka;

public class PersonAge {
	protected int age;

	public PersonAge(int age) {
		this.age = age;
	}
	

	public PersonAge() {
		super();
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonAge [age=" + age + "]";
	}
	
	
}
