/*
Persoalan :
	Buatlah barisan bilangan asli, bilangan ganjil, bilangan genap, dengan memandangnya sebagai mesin.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (SequenceMachine) yang menyediakan layanan-layanan pembangkita barisan bilangan menggunakan teknik mesin bilangan
*/
package object;

public class SequenceMachine {
	public SequenceMachine() {}

	static void naturalSequence() {
		NaturalSequence ns = new NaturalSequence();
		System.out.println("Aplikasi Barisan Asli");
		System.out.println("Item ke \t: " + ns.getTH());
		System.out.println("Nilai item \t: " + ns.item());
		for (int i = 0; i <= 10; i++) {
			System.out.printf("Nilai item ke %d \t: %d\n", i, ns.itemTH(i));
		}		
	}
	static void oddSequence() {
		OddSequence os = new OddSequence();
		System.out.println("Aplikasi Barisan Ganjil");
		System.out.println("Item ke \t: " + os.getTH());
		System.out.println("Nilai item \t: " + os.item());
		for (int i = 0; i <= 10; i++) {
			System.out.printf("Nilai item ke %d \t: %d\n", i, os.itemTH(i));
		}		
	}
	static void evenSequence() {
		EvenSequence es = new EvenSequence();
		System.out.println("Aplikasi Barisan Genap");
		System.out.println("Item ke \t: " + es.getTH());
		System.out.println("Nilai item \t: " + es.item());
		for (int i = 0; i <= 10; i++) {
			System.out.printf("Nilai item ke %d \t: %d\n", i, es.itemTH(i));
		}		
	}
	static void fibonacciSequence() {
		FibonacciSequence fs = new FibonacciSequence();
		System.out.println("=========================");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Nilai item ke " + i +" \t: " + fs.item());
			fs.next();
		}
		fs.reset();
		System.out.println("Aplikasi Barisan Fibonacci");
		System.out.println("Nilai item \t: " + fs.item());
		for (int i = 0; i <= 10; i++) {
			System.out.printf("Nilai item ke %d \t: %d\n", i, fs.itemTH(i));
			fs.next();
		}
	}

	static void userInterface() {
		System.out.println("Aplikasi Barisan Bilangan");
		System.out.println("=========================");
		naturalSequence();
		space();
		oddSequence();
		space();
		evenSequence();
		space();
		fibonacciSequence();
		space();

	}
	static void space() {
		System.out.println();
	}

	public static void main(String[] args) {
		userInterface();
	}
}

// Kelas berikut merupakan kelas moyang dari barisan yang telah menyediakan layanan-layanan dasar dari barisan
abstract class Sequence {
	protected int th;
	public Sequence() {
		th = 0;
	}
	public void reset() {
		th  = 0;
	}
	public int getTH() {
		return th;
	}
}

// Java menggunakan kata kunci extends untuk memperluas kelas
abstract class IntegerSequence extends Sequence {
	protected int value;

	public IntegerSequence() {
		super();
		value = 1;
	}
	public void reset() {
		super.reset();
		value = 1;
	}
	public int item() {
		return value;
	}

	abstract public void next();

	public int itemTH (int Nr) {
		reset();
		for (int i = 0; i < Nr; i++) {
			next();
		}
		return value;
	}
}