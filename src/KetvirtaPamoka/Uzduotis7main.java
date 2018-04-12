package KetvirtaPamoka;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Uzduotis7main {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("alex", 25));
		list.add(new Person("john", 30));
		list.add(new Person("mike", 42));
		list.add(new Person("matt", 29));
		list.add(new Person("chris", 16));
		list.add(new Person("johnson", 52));

//---------------------------7.c------------------------------		
		List<String> names = list.stream()
							.map(Person::getName)
							.map(i-> "Names: " +i)
							.collect(Collectors.toList());
		print(names);
		
//---------------------------7.d------------------------------
		List<String> namesUper = list.stream()
								.map(Person::getName)
								.map(name->name.toUpperCase())
								.map(i-> "Nmames to upercase: " + i)
								.collect(Collectors.toList());
		print(namesUper);
//---------------------------7.e----------------------
		List<Person> jaunesni30 = list.stream()
								.filter(age-> age.getAge() < 30)
								.map(temp->{
									Person obj = new Person(temp.getName(), temp.getAge());
									obj.setName("Jaunesni negu 30: " + temp.getName());
									return obj;
								})
								.collect(Collectors.toList());
		print(jaunesni30);
//--------------------------7.d------------------------		
	

		List<Person> listM = list.stream()
							.filter(firstChar->firstChar.getName().toLowerCase().startsWith("m"))
							.filter(age-> age.getAge() < 30)
							.collect(Collectors.toList());
		print(listM);
	
	}
	private static void print(List<?> names) {
			names.forEach(element-> System.out.println(element.toString()));
			
		
	}

}
