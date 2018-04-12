package KetvirtaPamoka;

public class PersonNames extends PersonAge{
	protected String name;


	public PersonNames(int age, String name) {
		super(age);
		this.name = name;
	}

	public PersonNames(int age) {
		super(age);
	}


	public PersonNames(String name, int age) {
		super(age);
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonNames [name=" + name + "]";
	}
	


}
