/*
Pendekatatan kedua :
	Contoh penggunaan metode clone() sebagai berikut :
		Complex c1 = new Complex(1.0, 2.0);
		Complex c2 = c1.clone();
	
Pada contoh diatas :
	1. Baris pertama, objek c1 diciptakan menggunakan operator new(), sedangkan objek c2 hanya dideklarasikan.
	2. Baris kedua, objek c2 tidak diciptakan menggunakan operator new(), tapi diciptakan saat memanggil metode clone() untuk menciptakan clone dari c1.

Agar dapat berkemampuan clone() seperti diatas maka kita memrogram kelas Complex mengimplementasikan interface Cloneable sebagai berikut:
*/
package object_class;

public class Complex {
	private double re;
	private double im;

	static void userInterface() {
		System.out.println("Aplikasi Aritmatika Bilangan Komplex");
		Complex c1 = new Complex(1.0, 2.0);
		Complex c2 = new Complex(3.0, 4.0);
		Complex c3 = (Complex) c1.clone();

		System.out.println("Bilangan c1 \t: " + c1.toString());
		System.out.println("Bilangan c2 \t: " + c2.toString());
		try {			
			c3.mul(c2);
			System.out.println(c3.toString());
		} catch (Exception E) {
			System.out.println("Tidak dapat diclone : " + E.getMessage());
		}
	}

	public static void main(String[] args) {
		userInterface();
	}

	// Constructor
	public Complex() {
		re = 0.0;
		im = 0.0;
	}
	public Complex(double newRe, double newIm) {
		re = newRe;
		im = newIm;
	}
	public Complex(Complex theC) {
		re = theC.re;
		im = theC.im;
	}
	@Override
	protected Object clone() {
		Complex theComplex = new Complex();
		theComplex.re = re;
		theComplex.im = im;
		return theComplex;
	}
	@Override
	public String toString() {
		Double reDouble = new Double(re);
		Double imDouble = new Double(im);
		return (reDouble.toString() + ", " + imDouble.toString() + "i");
	}
	// Accessing operations
	public void setRe(double newRe) {
		re = newRe;
	}
	public double getRe() {
		return re;
	}
	public void setIm(double newIm) {
		im = newIm;
	}
	public double getIm() {
		return im;
	}
	// Computation operations
	public void add(Complex theComplex) {
		re = re + theComplex.re;
		im = im + theComplex.im;
	}

	/* INSTRUKSI
		public void mul(Complex theComplex)
		Buatlah operasi untuk perkalian
		
		public void div(Complex theComplex)
		Buatlah operasi untuk pembagian
	*/
	public void min(Complex theComplex) {
		re = re - theComplex.re;
		im = im - theComplex.im;
	}
	public void mul(Complex theComplex) {
		re = re * theComplex.re;
		im = im * theComplex.im;
	}
	public void div(Complex theComplex) {
		re = re / theComplex.re;
		im = im / theComplex.im;
	}
}
