/*
Persoalan :
	Bilangan faktorial sebagai perhitungan menggunakan teknik rekursif.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (Factorial) yang menyediakan layanan pembangkitan bilangan factorial.
*/
package jump;

public class Factorial {
	private int number = 0;

	//Creates a new instance of Factorial
        public Factorial() {}
	public Factorial(int number) {
		this.number = number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public long get() {
		return calculation(number);
	}

	static void userInterface() {
		Factorial f = new Factorial();
		for (int i = 0; i < 10; i++) {
			f.setNumber(i);
			System.out.println("Factorial dari " + i + " adalah " + f.get());
		}
	}

	public static void main(String[] args) {
		userInterface();
	}

	private long calculation(int n) {
		if (n > 1) {
			return (n * calculation(n - 1));
		} else {
			return 1;
		}
	}
}

/*
Bahasan :
	Java mendukung metode rekursif. Metode rekursif mempermudah abstraksi penyelesain serta memiliki analisis kinerja algoritma yang sangat mudah. Implementasi metode rekursif harus dilakukan secara hati-hati, yaitu :
		1. Buatlah psedocode atau rumus rekursif penyelesain masalah yang akan diterapkan di metode rekursif lebih dulu,
		2. Teliti apakah bagian rekursi memiliki kecendurungan semakin mengecil sehingga akan sampai ke bagian basis.
*/