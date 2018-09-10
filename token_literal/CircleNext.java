/*
Sering di Java, konstanta berlaku untuk seluruh metode/fungsi di satu kelas. Konstanta ini biasa disebut konstanta kelas (class constant). Kita dapat membuat konstanta kelas dengan kata kunci static final.
*/

package token_literal;

public class CircleNext {
	public static final double PHI = 3.14;

	static void second() {
		CircleNext cn = new CircleNext();

		double radius = 100;
		System.out.println("Keliling lingkarang berjari-jari " + radius + " adalah " + cn.calculationCircumference(radius));
		System.out.println("Luas lingkarang berjari-jari " + radius + " adalah " + cn.calculationArea(radius));
	}

	public static void main(String[] args) {
		second();
	}

	static double calculationCircumference(double r) {
		return (2 * PHI * r);
	}
	static double calculationArea(double r) {
		return (PHI * r * r);
	}
}

/*
Pendefinisian konstanta dilakukan diluar metode main(). Dengan demikian, konstanta dapat digunakan di metode-metode lain di kelas yang sama.

Lebih lanjut lagi, konstanta di contoh dideklarasikan menggunakan access modifier bernilai public, maka metode-metode dikelas lain pun dapat menggunakan konstanta dengan mengacu nama konstanta dengan menyebut nama kelas sebagai berikut:
	<Nama Kelas>.<Nama Konstanta>

Pada contoh diatas konstanta PHI diacu menggunakan identifier berikut :
	CircleNext.PHI
*/
