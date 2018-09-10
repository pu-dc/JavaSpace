/*
Persoalan:
	Ujilah kelas Math yang disediakan oleh Java apakah benar berfungsi dengan baik sebagaimana seharusnya atau terdapat batasan-batasan tertentu.
*/

package separate_whitespace_comment;

public class MathExplore {
	// Creates a new instance of MathExplore
	public MathExplore() {}

	static void test() {
		testE();
		testPI();
		testAbs();
	}
	static void betterTest() {
		testIntAbs();
	}
	static void testE() {
		System.out.println("Testing untuk Math.E");
		System.out.println("Math.E = " + Math.E);
		System.out.println();
	}
	static void testPI() {
		System.out.println("Testing untuk Math.E");
		System.out.println("Math.PI = " + Math.PI);
		System.out.println();
	}
	static void testAbs() {
		System.out.println("Testing untuk Math.abs()");
		System.out.println("Math.abs(-23.4) \t= " + Math.abs(-23.4));
		System.out.println("Math.abs(0.0) \t= " + Math.abs(0.0));
		System.out.println("Math.abs(23.5) \t= " + Math.abs(23.7));
		System.out.println("Double.MIN_VALUE \t= " + Double.MIN_VALUE);
		System.out.println("Math.abs(Double.MIN_VALUE) \t= " + Math.abs(Double.MIN_VALUE));
		System.out.println("Math.abs(-Double.MIN_VALUE) \t= " + Math.abs(-Double.MIN_VALUE));
		System.out.println("Double.MAX_VALUE \t= " + Double.MAX_VALUE);
		System.out.println("Math.abs(Double.MAX_VALUE) \t = " + Math.abs(Double.MAX_VALUE));
		System.out.println("Math.abs(-Double.MAX_VALUE) \t = " + Math.abs(-Double.MAX_VALUE));
		System.out.println();
	}
	static void testIntAbs() {
		System.out.println("Cara pengujian yang lebih baik - mendukung otomasi!");
		System.out.println("Testing untuk Math.abs() bagi bilangan bulat");

		if (Math.abs(-23) != 23) {
			System.out.println("Math.abs(-23) :: Error! Hasil harus 23");
		} else {
			System.out.println("Math.abs(-23) :: Correct!");
		}

		if (Math.abs(0) != 0) {
			System.out.println("Math.abs(0) :: Error! Hasil harus 0");
		} else {
			System.out.println("Math.abs(0) :: Correct!");
		}

		if (Math.abs(23) != 23) {
			System.out.println("Math.abs(23) :: Error! Hasil harus 23");
		} else {
			System.out.println("Math.abs(23) :: Correct!");
		}

		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Math.abs(Integer.MIN_VALUE) = " + Math.abs(Integer.MIN_VALUE));
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		
		if (Math.abs(Integer.MIN_VALUE) != Integer.MAX_VALUE) {
			System.out.println("Math.abs(Integer.MIN_VALUE) :: Error! Tidak sama");
		} else {
			System.out.println("Math.abs(Integer.MIN_VALUE) :: Correct!");
		}

		if (Math.abs(Integer.MIN_VALUE) < 0) {
			System.out.println("Math.abs(Integer.MIN_VALUE) :: Error! Hasil harus > 0");
		} else {
			System.out.println("Math.abs(Integer.MIN_VALUE) :: Correct!");
		}

		if (Math.abs(Integer.MAX_VALUE) != Integer.MAX_VALUE) {
			System.out.println("Math.abs(Integer.MAX_VALUE) :: Error! Tidak sama");
		} else {
			System.out.println("Math.abs(Integer.MAX_VALUE) :: Correct!");
		}

		System.out.println("\n\nPERHATIAN!");
		System.out.println(
			"Pengujian menunjukan hasil yang tidak sesuai dengan matematika! \n" +
			"Pengujian otomatis kadang tidak dapat menemukanya secara benar karena dibatasi juga \n" +
			"oleh kemampuan bahasa itu sendiri bila kesalahan adalah pada spesifikasi bahasa itu sendiri. \n" +
			"Pengujian otomatis akan benar ditangan yang ahli, pengujian dapat ditambah sebagai berikut :"
			);
		System.out.println(
			"\t Berdasarkan kenyataan bahwa hasil fungsi abs tidak boleh kurang dari nol \n" +
			"\t Di Java, Math.abs(Integer.MIN_VALUE) justru menghasilkan bilangan negatif. \n" +
			"\t Melanggar rumus matematika dimana hasil fungsi absolut selalu bernilai positif. \n" +
			"\t Hasil ini dapat ditelusuri karena representasi int adalah two's complement \n"
			);
	}
	static void testAcos() {
		System.out.println("Math.acos(0.9) = " + Math.acos(0.9));
	}
	/*
		Lanjutkan pengujian dibawah ini
	*/
	static void testCeil() {}
	static void testCos() {}
	static void testExp() {}
	static void testFloor() {}
	static void testLog() {}
	static void testMax() {}
	static void testMin() {}
	static void testPow() {}
	static void testSin() {}
	static void testSqrt() {}
	static void testTan() {}

	public static void main(String[] args) {
		test();
		betterTest();
	}
}

/*
Bahasan:
	Pengujian merupakan aktivitas yang sering diabaikan dalam pengembangan, terlebih di Indonesia. Pengujian memerlukan keahlian spesifik. Pengujian dapat menghindari peluang kerugian karena kesalahan telah ditemukan saat pengembangan bukan saat operasi produktif.

	Kesalahan program bisa berakibat sangat fatal bahkan sampai dapat menimbulkan kerugian jutaan dollar. Kasus nyata kerugian yang disebabkan kesalahan perangkat lunak antara lain :
		- Kesalahan injeksi insulin yang menyebabkan kematian karena akumulasi galat tetesan infus yang tidak diperhitungkan.
		- Ariane5: Roket pengangkut satelit milik masyarakat Eropa mengalami malfunction setelah 50 detik peluncuran, disebabkan overflow pemroses 32bit yang memperoleh data dari pemroses 64bit.

	Apabila itu berarti disiplin software engineering tidak mempunyai arti? software engineering telah bekerja bagus.

	Contoh kecil adalah berapa harga sistem software banking seluruh dunia, ditambah omset bisnis perbankan yang dikelolanya? Angka kerugian Ariane-5 kurang berarti dibanding harga sistem banking. Belum ditambah software telekomunikasi, kesehatan, asuransi, militer, dan sebagainya.

	Kita seharusnya dapat mencegah kesalahan fatal software atau mereduksinya serendah mungkin dengan pengujian berdisiplin.

	Pengujian menempati prioritas minor di kebanyakan pengembangan. Saat ini, kubu bernama "Extreme Programming" menempatkan pengujian pada tempat terhormat. Salah satu sloganya adalah "Buatlah Kode Pengujian Terlebih Dahulu Sebelum Membuat Kode Program!". Dampak aktivitas membuat kode pengujian terlebih dahulu adalah benar-benar memahami seperti apa seharusnya program yang dibuat tersebut berperilaku. Pengujian ini sekaligus dapat bertindak sebagai spesifikasi dan dokumentasi rinci.

	Meski terdapat penentang kubu "Extreme Programming", namun kebanyakan karena kenekatan dalam menghilangkan dokumentasi dan spesifikasi bukan karena penempatan prioritas tinggi pengujian. Kubu "Extreme Programming" berhasil menyadarkan pentingnya pengujian dan banyak kakas pengujian otomasi di kubu "Extreme Programming".

	Pengujian sebaiknya dilakukan secara otomatis, bukan secara interaktif. Setelah perbaikan program, kita dapat mengulangi pengujian tanpa harus berulang kali memasukan kasus pengujian lewat keyboard secara interaktif.
*/
