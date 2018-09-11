/*
Persoalan :
	Pembahasan bilangan factorial dengan teknik rekursif adalah biasa. Bagaimana bila memandang persoalan itu sebagai satu mesin? Teknik ini dikemukakan Bertrand Meyer untuk menangani segala macam persoalan yang memiliki nilai yang berkaitan erat dengan nilai sebelumnya. Jadi bila persoalan dapat dipandang sebgai barisan, maka persoalan itu dapat diselesaikan dengan pendekatan ini.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (FactorialMachine) yang menyediakan layanan pembangkitan bilangan factorial menggunakan teknik mesin angka.
		- next
		- prev
		- get
*/
package jump;

public class FactorialMachine {
	private int number 	= 0;
	private long result = 1;

	// Creates a new instance of FactorialMachine
	public FactorialMachine() {
		reset();
	}
	public FactorialMachine(int number) {
		this.number = number;
		for (int i = 0; i < number; i++) {
			next();
		}
	}
	public int getNumber() {
		return number;
	}
	// Untuk bergerak maju
	public void next() {
		number++;
		result *= number;
	}
	// Untuk bergerak mundur
	public void prev() {
		result /= number;
		number--;
	}
	// Untuk memperoleh nilai dimana mesin saat itu berada
	public long get() {
		return result;
	}
	public void clear() {
		reset();
	}

	static void userInterface() {
		FactorialMachine fm = new FactorialMachine();
		System.out.println("Bergerak maju :");
		for (int i = 0; i < 11; i++) {
			System.out.println("Factorial ke " + i + " : " + fm.get());
			fm.next();
		}
		System.out.println("Bergerak mundur :");
		for (int i = fm.getNumber(); i > 0; i--) {
			System.out.println("Factorial ke " + i + " : " + fm.get());
			fm.prev();
		}
	}

	public static void main(String[] args) {
		userInterface();
	}

	private void reset() {
		number = 0;
		result = 1;
	}
}

/*
Bahasan :
	Factorial secara berurutan untuk argumen 0, 1, 2, 3, 4, ... dapat dipandang sebagai mesin yang dapat berjalan ke depan. Mesin ini memiliki tombol kendali dan memperoleh layanan, yaitu :
		Tombol kendali utama :
			public void next()
			public void prev()

		Tombol layanan utama :
			public long get()
*/