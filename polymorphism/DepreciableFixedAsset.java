/*
Persoalan :
	Pada akuntansi harta tetap (fixed assets) bukan tanah terdapat depresiasi nilai barang. Benda-benda itu disebut benda yang dapat mengalami depresiasi (depreciable fixed asset).

	Terdapat beragam metode depresiasi :
		- Straight line
		- Double declining balance
		- Sum of the year digits
		- dan Sebagainya, masih banyak lagi

	Bagaimana kita dapat menyelesaikan persoalan dimana metode-metode bisa diganti dan boleh jadi ditemukan metode baru kalkulasi depresiasi.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buatlah kelas (DepreciableFixedAsset) yang menyediakan layanan perhitungan depresiasi yang mengakomodasikan beragam teknik depresiasi.

Modification :
	1. Deprecation is viewed as machine
	2. Using delegation
*/
package polymorphism;

public class DepreciableFixedAsset {
	// Atribut-atribut
	// Untuk mencatat properti-properti dari harta tetap
	private long origin 		= 0;
	private long value 			= 0;
	private double deprec 		= 0.0;
	private int numberOfYear 	= 0;
	private int year 			= 0;
	// Digunakan untuk mengacu metode depresiasi yang digunakan.
	DepreciationMethod depreciationM;

	// Constructor
	// Creates a new instance of Depreciable
	public DepreciableFixedAsset(long origin, int numberOfYear, DepreciationMethod depreciationM) throws Exception {
		this.origin 		= origin;
		this.numberOfYear 	= numberOfYear;
		this.value 			= origin;
		// Pada argumen depreciationM, maka semua object bertipe DepreciationMethod dan turunan-turunanya dapat dimasukkan. Dengan demikian, kelas DepreciableFixedAsset dapat ditutup dari perubahan yang disebabkan oleh keanekaragaman DepreciationMethod
		this.depreciationM 	= depreciationM;

		// Layanan ini akan mencatat atribut-atribut awal yang perlu diketahui DepreciableFixedAsset, serta object DepreciationMethod yang akan digunakan metode calculationDeprec() di kelas DepreciableFixedAsset
	}
	public int getYear() {
		return year;
	}
	public long getValue() {
		return value;
	}
	public double getDeprec() {
		return deprec;
	}
	public int getNumberOfYear() {
		return numberOfYear;
	}
	@Override
	public String toString() {
		String str =
			"Akhir tahun " + year + " Depresiasi = " + Math.round(deprec) + " Nilai sekarang : " + value;
                return str;
	}
	// Pada tahun berikutnya maka
	public void next() throws Exception {
		year++;
		deprec = depreciationM.calculationDeprec(origin, value, numberOfYear, year);
		value -= deprec;
		// Akan menggunakan metode depresiasi di atribut depreciationM yang dimasukkan saat constructor dijalankan
	}
	static void ui() throws Exception {
		long money 	= 444444444;
		int year 	= 10;
		StraightLineMethod straightLM 			= new StraightLineMethod();
		DepreciableFixedAsset depreciableFA 	= new DepreciableFixedAsset(money, year, straightLM);

		for (int i = 0; i <= year; i++) {
			System.out.println(depreciableFA);
			depreciableFA.next();
		}
	}
	public static void main(String[] args) throws Exception {
		ui();
	}
}

// Kelas abstrak dimana kelas-kelas turunan akan merupakan kelas kongkret yang dapat diinstaniasi
abstract class DepreciationMethod {
	abstract double calculationDeprec(long origin, long value, int numberOfYear, int year) throws Exception;
	// Hanya kelas payung
}

/*
Bahasan :
	Kita dapat menerapkan prinsip open-close secara bagus dipendekatan orientasi object. Dimana kelas atau metode yang dibuat dapat ditutup (tidak perlu dimodifikasi lagi) terhadap kebutuhan baru dengan memberikan objek-objek berbeda ke kelas atau metode itu. Objek-objek ini dapat sangat beragam bahkan merupakan kelas baru asalkan merupakan turunan kelas yang telah ditetapkan dimetode yang ditutup.

Seperti yang sudah dijelaskan :
	Layanan dipisahkan secara tegas antara layanan query dan command :
		- Layanan query :
			public int getYear()
			public double getValue()
			public double getDeprec()
			public int getNumberOfYear()
			Metode toString() adalah layanan query khusus untuk memberikan state objek secara lengkap dan jelas.
		- Layanan command :
			public void next() throws Exception {}
			Constructor merupakan layanan command sebagai masukan secara khusus

Catatan :
	Penggunaan objek kelas lain untuk melakukan aksi di atas berarti kedua kelas memiliki hubungan using. DepreciableFixedAsset using DepreciationMethod.

	Kita dapat menggambarkan asosiasi ini menggunakan diagram kelas UML. Hubungan using biasa diterapkan dengan melewatkan object kelas yang digunakan sebagai argumen di metode di kelas pengguna.

	Contohnya :
		public void calcDeprec(DepreciationMethod depreciationM) throws Exception {}

	Maka ketika dipanggil, metode calculationDeprec() harus diperi argumen berupa objek untuk kalkulasi depresiasi. Kelas DepreciableFixedAsset using (menggunakan) DepreciationMethod, utamanya saat menjalankan metode calculationDeprec().

	Penyelesaian persoalan sebaiknya mengikuti pola rancangan 'Strategy'.
*/