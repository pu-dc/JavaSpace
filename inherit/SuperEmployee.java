package inherit;

public class SuperEmployee extends SuperPerson {
	long salary;

	public SuperEmployee(int id, String name, long salary) {
		// Reusing parent constructor
		super(id, name);
		this.salary = salary;
	}
	public void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}