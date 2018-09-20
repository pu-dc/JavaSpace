/*
Persoalan :
	Buatlah kelas Student dimana Student terdaftar di Department tertentu. Kita juga dapat mengetahui dari Student mengenai nama, dan ketua di Department dimana Student itu berada.
*/

package message;

public class StudentNext extends Person {
	String sid;
	String strata;
	Department department;

	// Creates a new instance of StudentNext
	public StudentNext() {
		super();
		sid 		= "";
		strata 		= "";
		department 	= null;
	}
	public StudentNext(String newName, String newAddress, String newCity, int newAge, String newSid, String newStrata, Department newDepartment) {
		super(newName, newAddress, newCity, newAge);
		sid 		= newSid;
		strata 		= newStrata;
		department 	= newDepartment;
	}
	public void setSid(String newSid) {
		sid = newSid;
	}
	public String getSid() {
		return sid;
	}
	public void setStrata(String newStrata) {
		strata = newStrata;
	}
	public String getStrata() {
		return strata;
	}
	public void setDepartment(Department newDepartment) {
		department = newDepartment;
	}
	public Department getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		String str =
			"Nama \t: " + name + "\n" +
			"Alamat \t: " + address + "\n" +
			"Kota \t: " + city + "\n" +
			"Umur \t: " + age + "\n" +
			"SID \t: " + sid + "\n" +
			"Strata \t: " + strata + "\n" +
			"Jurusan \t: ";
			if (getDepartment() != null) {
				str += getDepartment().getName();
			}
		return str;
	}

	static void second() {
		Department d = new Department("Sistem Informasi", "Rikip Ginanjar");
		StudentNext sn = new StudentNext("Adam Smith", "Jl. Pegangsaan Raya No. 47", "Bekasi", 20, "012201705014", "Strata 1", d);
		
		System.out.println(sn.getName());
		System.out.println(sn.getAddress());
		System.out.println(sn.getCity());
		System.out.println(sn.getAge());
		System.out.println(sn.getSid());
		System.out.println(sn.getStrata());
		System.out.println(sn.getDepartment().getName());
		System.out.println(sn.getDepartment().getHeadMaster());
		System.out.println();
		System.out.println(sn);
	}

	public static void main(String[] args) {
		second();
	}

    private static class Department {
        protected String name;
        protected String headMaster;
        public Department(String name, String headMaster) {
            this.name = name;
            this.headMaster = headMaster;
        }
        public String getName() {
            return name;
        }
        public String getHeadMaster() {
            return headMaster;
        }
    }
}

/*
Bahasan :
	Persoalan diatas merupakan persoalan asosiasi dua kelas yaitu kelas Student dan Department. Asosiasi biasanya diberi nama misalnya terdaftar atau berada, yaitu Student berada di Department.

	Bergantung pada multiplisitas yang terjadi pada asosiasi maka kita dapat menerapkan beragam implementasi.

	Terdapat tiga kemungkinan multiplisitas asosiasi yang terjadi
	- 1 ke 1
	- N ke 1
	- M ke N

	Bila hubungan Student dan Department adalah N:1 dimana satu Student jelas hanya terdaftar disatu jurusan sementara Department dapat mendaftarkan diri lebih dari satu Student.

	Untuk hubungan N:1 semacam ini, penerjemahan yang terjadi adalah kelas N memiliki reference ke objek kelas 1.

	Dengan demikian, field-field di Student menjadi
		String sid;
		String strata;
		Department department;
	Department bukan atribut biasa, namun reference ke objek Department yang merupakan department dimana mahasiswa berada.

	Kita memanfaatkan constructor untuk mengisi atribut-atribut beserta objek yang berasosiasi dengan objek StudentNext, yaitu :

		public StudentNext(
			String newName, 
			String newAddress, 
			String newCity, 
			int newAge, 
			String newSid, 
			String newStrata, 
			Department newDepartment) {
				super(newName, newAddress, newCity, newAge);
				sid 		= newSid;
				strata 		= newStrata;
				department 	= newDepartment;
		}

	Department akan diacukan ke objek yang berasosiasi dengan objek Student.

	Fasilitas garbage collector sungguh akan sangat memudahkan pemrograman berorientasi objek.

	Saat kita memberi null ke department. Bil di program masih ada variable/objek lain yang mengacu ke objek yang sebelumnya ditunjuk department maka objek tidak dimusnahkan. Namun, bila sudah tidak terdapat variable/objek lain yang mengacu maka garbage collector akan mengembalikan memori yang digunakan memory pool sehingga dapat digunakan ulang untuk keperluan lain. Garbage Collector cukup canggih sehingga dapat mengetahui kaitan-kaitan melingkar padahal tidak diacu lagi oleh objek yang masih digunakan diprogram.

	Kita tidak dibebani mengurusi sampah memori yang tercipta karena objek-objek tidak digunakan.

	Bila tanpa garbage collector maka kita harus menetapkan objek mana yang memiliki tugas pengelolaan siklus hidup objek. Pada persoalan diatas, apakah objek Student harus mengurusi siklus hidup objek Department? Objek yang tidak diacu lagi olehnya harus dikembalikan ke memory pool, atau merupakan tanggung jawab pihak lain yang mengelolanya. Tapa garbage collector, tanggung jawab ini haruslah jelas.

	Kita tidak memiliki masalah ini di sistem Java karena tersedia fasilitas garbage collector. Bil satu objek diacu dua variable/objek maka pada saat saru acuan menjadi null, maka objek itu masih tetap eksis. Saat kedua acuan menjadi null, maka objek itu menjadi tidak bertuan. Objek ini akan menjadi sasaran kerja garbage collector. Kita tidak perlu pusing mengurusi sampah objek. Garbage collector telah menyederhanakan banyak tugas pemrograman.
*/
