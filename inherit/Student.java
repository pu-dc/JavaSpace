package inherit;

public class Student extends Person {
	private int sid;
	private String strata;
	private String department;

	//Create a new instance of Student
	public Student() {
		// Menjalankan constructor di superkelasnya
		super();
		sid = 0;
		strata = "";
		department = "";
	}
	public Student(String newName, String newAddress, String newCity, int newAge, int newSid, String newStrata, String newDepartment) {
		// super() Akan Memanggil constructor yang tidak memerlukan argumen, sepentara dibawah ini akan memanggil constructor yang memerlukan argumen berupa 4 String dan 1 int
		super(newName, newAddress, newCity, newAge);
		sid 		= newSid;
		strata 		= newStrata;
		department 	= newDepartment;
	}
	public void setSid(int newSid) {
		sid = newSid;
	}
	public void setStrata(String newStrata) {
		strata = newStrata;
	}
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	public int getSid() {
		return sid;
	}
	public String getStrata() {
		return strata;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		String str = 
			"Nama \t\t: " + name + "\n" +
			"Address \t: " + address + "\n" +
			"City \t\t: " + city + "\n" +
			"Age \t\t: " + age + "\n" +
			"SID \t\t: " + getSid() + "\n" +
			"Strata \t\t: " + getStrata() + "\n" +
			"Department \t: " + getDepartment() + "\n";
		return str;
	}

	static void ui() {
		Student s = new Student("BIL AWAL FATHUR RIZKY", "KP. PACING WARINGINJAYA", "CIKARANG", 20, 012201705014, "Strata 1", "Information System");
		System.out.println(s);
	}
	public static void main(String[] args) {
		ui();
	}
}