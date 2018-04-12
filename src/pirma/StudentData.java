package pirma;

public class StudentData {
	private final int Id;
	private String Name;
	private final String Metai;
	public StudentData(int id, String name, String metai) {
		
		Id = id;
		Name = name;
		Metai = metai;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMetai() {
		return Metai;
	}
	
	

	@Override
	public String toString() {
		return "StudentData [Id=" + Id + ", Name=" + Name + ", Metai=" + Metai + "]";
	}

	public void keistiVaradai(String vardas) {
		setName(vardas);
		
	}
	
	

}
