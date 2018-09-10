/*
Di Java, kita menggunakan kata kunci (keyword) final untuk menunjukan konstanta
*/

package token_literal;

public class Circle {
	public static void main(String[] args) {
		final double PHI = 3.14;
		double radius = 100;

		System.out.println("Keliling lingkaran berjari-jari " + radius + " adalah " + (2 * PHI * radius));
	}
}

/*
Kata kunci final mengindikasikan nilai ke variable dilakukan sekali saja, setelah itu nilai di variable itu tidak dapat diubah selamanya.

Konvensi :
	Nama konstanta adalah huruf besar seluruhnya, misalnya :
	final double PHI = 3.14
	final double CM_PER_INCH = 2.54;

*/
