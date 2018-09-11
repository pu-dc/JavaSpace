/*
Persoalan :
	Nilai Euler dapat dihitung melalui fungsi berikut :
		E = 1 / (1!) + 1 / (2!) + 1 / (3!) + 1 (4!) + ...

	Sementara
		E^x atau fungsi exp() dapat juga dihitung melalui rumus. Carilah rumus exp().

	Buat komputasi E dan exp() menggunakan pendekatan memandang sebagai mesin.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (Euler) yang menyediakan layanan pembangkit bilangan Euler dan pangkat dari bilangan Euler.
*/
package jump;

public class Euler {
	static void t01() {
		for (int i = 0; i < 10; i++) {
			Eul e = new Eul(i);
			System.out.println("Sampai " + i + " suku e \t: " + e.get());
			System.out.println("Math.E adalah \t\t: " + Math.E);
			System.out.println("Selisih \t\t: " + Math.abs(e.get() - Math.E));
		}
		
	}
	static void t02() {
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > 0; j--) {
				Exp exp = new Exp(i, j);
				System.out.println("Sampai " + i + " suku exp(" + j +") \t: " + exp.get());
				System.out.println("Math.exp(" + j +") adalah \t\t: " + Math.exp(5.0));
				System.out.println("Selisih \t\t\t: " + Math.abs(exp.get() - Math.exp(5.0)));
			}
		}
		
	}
	static void space() {
		System.out.println();
	}

	static void userInterface() {
		t01();
		space();
		t02();
		space();
	}

	public static void main(String[] args) {
		userInterface();
	}
}
/*
Bahasan :
	Kita melihat tiga mesin, factorial, e dan exp yang seluruhnya hanya memiliki metode next(), prev(), dan get(). Kita dapat mengangkat ketiganya sebagai mewarisi satu kelas misalnya SequenceMachine.

*/