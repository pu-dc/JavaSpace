package message;

public class Person {
	protected String name;
	protected String address;
	protected String city;
	protected int age;

	// Creates a new instance of Person
	public Person() {
		name 	= "";
		address = "";
		city 	= "";
		age 	= 0;
	}
	public Person(String newName, String newAddress, String newCity, int newAge) {
		name 	= newName;
		address = newAddress;
		city 	= newCity;
		age 	= newAge;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	public void setCity(String newCity) {
		city = newCity;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		String str = 
			"Name \t\t: " + getName() + "\n" +
			"Address \t: " + getAddress() + "\n" +
			"City \t\t: " + getCity() + "\n" +
			"Age \t\t: " + getAge() + "\n";
		return str;
	}

	static void userInterface() {
		Person p = new Person("Adam Smith", "Pegangsaan Raya No. 45", "Bekasi", 20);
		System.out.println("Adam Smith sebagai Person :");
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getCity());
		System.out.println(p.getAge());
		System.out.println(p);
	}
	public static void main(String[] args) {
		userInterface();
	}
}
