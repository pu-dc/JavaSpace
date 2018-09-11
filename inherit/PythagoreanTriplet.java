/*
Persoalan :
	Segitiga siku-siku dapat mempunyai panjang sisi yang merupakan bilangan bulat. Himpunan tiga bilangan bulat untuk panjang sisi-sisi di segitiga siku-siku disebut tripel Pithagoras (Pythagorean Triplet).

	Ciri-ciri dari triple ini adalah :
		a^2 + b^2 = c^2

	Buat program untuk mencari seluruh triple kurang dari bilangan tertentu.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (PythagoreanTriplet) yang menyediakan layanan pembangkitan himpunan triplet pythagoras.
*/
package inherit;

public class PythagoreanTriplet {
	// Atribut-atribut
	private int number 			= 0;
	// Mencatat angka maksimum dari sisi segitiga
	private int numberOfTriplet = 0;
	// Mencatat jumlah triple yang diperoleh
	final int MAX_OF_TRIPLETS 	= 100;

	// Merupakan array untuk mencatat himpunan Triplet Pythagoras
	// Menggunakan teknik brute-force, menelusuri seluruh kemungkinkan.
	private int[] tripletA = new int[MAX_OF_TRIPLETS];
	private int[] tripletB = new int[MAX_OF_TRIPLETS];
	private int[] tripletC = new int[MAX_OF_TRIPLETS];

	// Creates a new instance of PythagoreanTriplet
	public PythagoreanTriplet(int number) {
		this.number = number;
		bruteForce();
		// Saat constructor dipanggil, langsung melakukan komputasi. Pemasukan number memicu objek menanggapi berupa pembentukan state benar yang menyatakan himpunan Triple Pythagoras
	}
	public int getNumberOfTriplet() {
		return numberOfTriplet;
	}
	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < numberOfTriplet; i++) {
			str += tripletA[i] + "\t" + tripletB[i] + "\t" + tripletC[i] + "\n";
		}
		return str;
	}

	static void ui() {
		for (int i = 0;  i <= 100; i++) {
			System.out.printf("\n[%d]\n", i);
			System.out.println(new PythagoreanTriplet(i));
		}		
	}
	static void space() {
		System.out.println();
	}
	public static void main(String[] args) {
		ui();
	}

	//Metode berikut adalah pencarian seluruh tripel sampai bilangan tertentu atau apabila telah tercapai maksimum jumlah solusi(MAX_OF_TRIPLETS)
	private void bruteForce() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				for (int k = 1; k <= number; k++) {
					if ((i * i) == (j*j + k*k)) {
						tripletA[numberOfTriplet] = i;
						tripletB[numberOfTriplet] = j;
						tripletC[numberOfTriplet] = k;
						numberOfTriplet++;
						if (numberOfTriplet == MAX_OF_TRIPLETS) {
							return;
						}
					}
				}
			}
		}
	}
}
