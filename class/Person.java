import javax.swing.*;
public class Person {
	String name;
        String address;
        String city;
	int age;

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

        @Override
	public String toString() {
		String str =
			"Name \t\t: " + name + "\n" +
			"Address \t: " + address + "\n" +
			"City \t\t: " + city + "\n" +
			"Age \t\t: " + age + "\n";
		return str;
	}


	static void userInterface() {
		String nam, add, cit, age, output;
		nam = JOptionPane.showInputDialog("What's your name?");
		add = JOptionPane.showInputDialog("Your at address?");
		cit = JOptionPane.showInputDialog("Current city?");
		age = JOptionPane.showInputDialog("Your age?");
		int ag = Integer.parseInt(age);
		Person o = new Person(nam, add, cit, ag);
		System.out.println(o.getName());
		System.out.println(o.getAddress());
		System.out.println(o.getCity());
		System.out.println(o.getAge());
		System.out.println(o);
		System.exit(0);
	}

	public static void main(String[] args) {
		userInterface();
	}
}