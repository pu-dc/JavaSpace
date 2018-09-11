/*
Persoalan :
	Diketahui persamaan :
		y = x^5 + 3x^2 - 10
	Carilah x sehingga y = 0.
	Kita melakukan penyusunan kembali terhadap persamaan sebagai berikut :
		x = (10 - 3x^2)^1/5
	Persoalan ini dapat diselesaikan dengan beragam cara, diantaranya adalah teknik yang dikemukakan oleh Newton.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buatlah kelas (EquationRoot) yang menyediakan layanan penghitungan akar persamaan menggunakan metode Newton.

*/
package block_env;

public class EquationRoot {
	private static final double GALAT = 0.00001;
	// Atribut ini adalah konstanta untuk mencatat galat jawaban yang diperbolehkan.
	private double guess;
	// Atribut ini adalah nilai tebakan awal dari akar yang dicari.
	private double root;
	// Atribut ini adalah nilai tebakan awal dari akar yang dicari.
	private long count = 0;
	// Atribut ini adalah angka iterasi yang dilakukan program untuk sampai ke solusi yang memenuhi konstrain galat yang diterapakan.
	private final Equation e;
	// Atribut ini bertipe Equation. Dengan cara ini, kita dapat mengganti e dengan object yang merupakan pertanyaan yang diharapkan.
	// Atribut ini mencatat apakah nilai-nilai yang dihasilkan adalah sah.
	private boolean fValid = true;

	// Creates a new instance of EquationRoot
	public EquationRoot(double guess, Equation e) {
		this.guess = guess;
		this.e = e;
		calcRoot();
	}
	public void setGuess(double guess) {
		this.guess 	= guess;
		this.fValid = true;
		calcRoot();
	}
	public long getCount() {
		// Precondition : isValid() == true
		return count;
	}
	public double getRoot() {
		// Precondition : isValid() true
		return root;
	}
	public boolean isValid() {
		return fValid;
	}
	// Metode ini digunakan untuk mencari akar-akar pembentuk nilai nol.
	@Override
	public String toString() {
		String str;
		if (isValid()) {
			str =
				"Sampai iterasi ke " + count + "\n" +
				"Akar = " + root;
		} else {
			str =
				"Tebakan awal tidak menyebabkan konvergen";
		}
		return str;
		// Kita memanfaatkan toString() untuk mencari akar-akar menyatakan state object secara menyeluruh.
	}

	static void userInterface() {
		Equation e = new Equation();
		EquationRoot er = new EquationRoot(1.0, e);

		if (er.isValid()) {
			System.out.println(er);
		} else {
			System.out.println("Kesalahan :: tebakan tidak divergen");
		}
	}

	public static void main(String[] args) {
		userInterface();
	}

	private void calcRoot() {
		double probe;
		double error;
		while (true) {
			count++;
			if (count > 50) {
				return;
			}
			probe = e.calcF1(guess);
			if (probe > 0.0) {
				root = e.calcF2(guess);
				error = Math.abs(root - guess);
				if (error > GALAT) {
					guess = root;
				} else {
					return;
				}
			} else {
				fValid = false;
				return;
			}
		}
	}
}

