/*
Persoalan :
	Bilangan rasional adalah bilangan yang terbentuk a/b, dimana a dan b adalah bilangan bulat denga b != 0.

Tugas :
	Tulis implementasi bilangan rasional dengan bilangan rasional sebagai kelas dengan field pebilang dan field penyebut untuk aritmatika bilangan rasional berikut:
		1. Penjumlahan
		2. Pengurangan
		3. Perkalian
		4. Pembagian
		5. Ope1rasi relasional yang menyatakan
			- Relasi < dua bilangan rasional
			- Relasi > dua bilangan rasional
			- Relasi <= dua bilangan rasional
			- Relasi >= dua bilangan rasional
			- Relasi == dua bilangan rasional
			- Relasi != dua bilangan rasional

Pembahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (Fraction) yang menyediakan layanan-layanan aritmatika bilangan pecahan.
*/
package method;
import javax.swing.*;

public class Fraction {
	// Untuk mencatat pembilang (numerator) dan penyebut (denominator).
	private final int num;
	private final int denom;

	public Fraction(int num, int denom) {
		// Kita mencari gcd(num, denom) setelah memperolehnya, kita gunakan untuk membagi num dan denom.
		int t 		= Math.gcd(num, denom);
		// Kita dapat menyimpan hasil num dan denom dengan angka yang telah dibagi dengan hasil gcd().
		this.num 	= num / t;
		this.denom 	= denom / t;
	}
	// Metode penjumlahan mengirim object baru yang menampung hasil penjumlahan dua pecahan. Metode add() sebagai berikut :
	public Fraction add(Fraction theF) {
		int tNum    = (num * theF.denom) + (theF.num * denom);
		int tDenom  = denom * theF.denom;
		return (new Fraction(tNum, tDenom));
	}
        public Fraction min(Fraction theF) {
		int tNum    = (num * theF.denom) - (theF.num * denom);
		int tDenom  = denom * theF.denom;
		return (new Fraction(tNum, tDenom));
	}
        public Fraction multiple(Fraction theF) {
            int tNum, tDenom;
            tNum   = num * theF.num;
            tDenom = denom * theF.denom;
            return (new Fraction(tNum, tDenom));
        }
        public Fraction divide(Fraction theF) {
            int tNum, tDenom;
            tNum = num * theF.denom;
            tDenom = denom * theF.num;
            return (new Fraction(tNum, tDenom));
        }
        @Override
	public String toString() {
        double n, d, nd;
        n = (double) num;
        d = (double) denom;
        nd = n / d;
		return num + "/" + denom + "\t(" + nd + ")";
	}

	static void userInterface() {
		System.out.println("Aplikasi aritmatika bilangan pecahan");
		// Karena metode mencipatakan metode baru maka saat pemanggilnya kita tampung dalam suatu reference ke objek. Kita tidak perlu menciptakan objek penampung, sebagai berikut :
		String numAIn, denAIn, numBIn, denBIn;
		numAIn = JOptionPane.showInputDialog("Insert numerator A :");
		denAIn = JOptionPane.showInputDialog("Insert denominator "+ numAIn +"/x :");
		numBIn = JOptionPane.showInputDialog("Insert numerator B :");
		denBIn = JOptionPane.showInputDialog("Insert denominator "+ numBIn +"/x :");
		int numA, denA, numB, denB;
		numA = Integer.parseInt(numAIn);
		denA = Integer.parseInt(denAIn);
		numB = Integer.parseInt(numBIn);
		denB = Integer.parseInt(denBIn);
		Fraction a = new Fraction(numA, denA);
		Fraction b = new Fraction(numB, denB);
		// Variable c adalah hanya reference object, kita tidak perlu menciptakan objectnya karena metode add() akan mengirim object Fraction.
		Fraction cAdd = a.add(b);
                Fraction cMin = a.min(b);
                Fraction cMul = a.multiple(b);
                Fraction cDiv = a.divide(b);
		System.out.println();
		System.out.printf("A = %s\n", a);
		System.out.printf("B = %s\n", b);
		System.out.printf("A + B = %s\n", cAdd);
                System.out.printf("A - B = %s\n", cMin);
                System.out.printf("A x B = %s\n", cMul);
                System.out.printf("A : B = %s\n", cDiv);
		System.out.println();
		System.exit(0);
	}

	public static void main(String[] args) {
		userInterface();
	}
}
