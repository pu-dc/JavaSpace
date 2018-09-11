/*
Persoalan :
	Buat fungsi gcd(greatest common divisor) untuk mencari faktor persekutuan terbesar dari dua bilangan.

Misalkan :
	gcd(3,6) mengirim 3 dimana 3 adalah pembagi terbesar dari 3 dan 6
	gcd(3,12) mengirim 4 dimana 4 adalah pembagi terbesar dari 8 dan 12

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas Math yang menyediakan layanan-layanan gcd.
*/
package method;

public class Math {
	public static int gcd(int m, int n) {
		int t;
		while((m % n) != 0) {
			t = m;
			m = n;
			n = t % n;
		}
		return n;
	}
	public static long gcd(long m, long n) {
		long t;
		while((m % n) != 0) {
			t = m;
			m = n;
			n = t % n;
		}
		return n;
	}

	static void userInterface() {
		long x, y;
		x = 4;
                y = 5;
		System.out.println("gcd("+x+","+y+") = " + gcd(x,y));
		
	}

	public static void main(String[] args) {
		userInterface();
	}
}