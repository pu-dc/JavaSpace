/*
Persoalan :
	Diketahui besaran dalam rupiah kemudian hitung berapa lebar 100 ribu, 50 ribu, 20 ribu, 10 ribu, 5 ribu, 1 ribu, 500 rupiah, kemudian koin 100 rupiah, 50 rupiah, 25 rupiah, 10 rupiah, 5 rupiah, dan 1 rupiah.

Bahasan awal :
	Kita perlu membuat pernyataan ulang persoalan. Kita telah dipenuhi dengan aroma algoritmik sehingga persoalan sering diberikan dalam aroma algoritmik. Pemrograman orientasi objek memandang objeklah unit terkecil terpenting yang seharusnya menjadi abstraksi persoalan.

	Persoalan menjadi buat kelas dengan layanan memberi informasi jumlah lembar atau koin 100 ribu, 50 ribu, 20 ribu, 10 ribu, 5 ribu, 1 ribu, 500 rupiah, 100 rupiah, 50 rupiah, 25 rupiah, 10 rupiah, 5 rupiah, dan 1 rupiah.
*/

package operator_integer;

public class RupiahDistribution {
	// State yang perlu dicatat adalah jumlah rupiah menggunakan amount. Setelah itu atribut-atribut untuk mencatat jumlah lembar dan koin
	private long amount = 0;
	private long rp100ribu = 0;
	private long rp50ribu = 0;
	private long rp20ribu = 0;
	private long rp10ribu = 0;
	private long rp5ribu = 0;
	private long rp1ribu = 0;
	private long rp500 = 0;
	private long rp100 = 0;
	private long rp50 = 0;
	private long rp25 = 0;
	private long rp10 = 0;
	private long rp5 = 0;
	private long rp1;

	// Creates a new instance of RupiahDistribution
	public RupiahDistribution() {}
	public RupiahDistribution(long amount) {
		this.amount = amount;
		distributeAmount();
	}
	public void setAmount(long amount) {
		this.amount = amount;
		distributeAmount();
	}
	// Metode untuk mengakses jumlah yang dimasukan dan masing-masing lembar/koin uang
	public long getAmount() {
		return amount;
	}
	public long getRp100Ribu() {
		return rp100ribu;
	}
	public long getRp50Ribu() {
		return rp50ribu;
	}
	public long getRp20Ribu() {
		return rp20ribu;
	}
	public long getRp10Ribu() {
		return rp10ribu;
	}
	public long getRp5Ribu() {
		return rp5ribu;
	}
	public long getRp1Ribu() {
		return rp1ribu;
	}
	public long getRp500() {
		return rp500;
	}
	public long getRp100() {
		return rp100;
	}
	public long getRp50() {
		return rp50;
	}
	public long getRp25() {
		return rp25;
	}
	public long getRp10() {
		return rp10;
	}
	public long getRp5() {
		return rp5;
	}
	public long getRp1() {
		return rp1;
	}
	// Redefinisi terhadap metode
	public String toString() {
		String str =
			"Besar Rupiah \t= " + amount + "\n" +
			"Rp 100,000 \t= " + rp100ribu + "\n" +
			"Rp 50,000 \t= " + rp50ribu + "\n" +
			"Rp 10,000 \t= " + rp10ribu + "\n" +
			"Rp 5,000 \t= " + rp5ribu + "\n" +
			"Rp 1,000 \t= " + rp1ribu + "\n" +
			"Rp 500 \t= " + rp500 + "\n" +
			"Rp 100 \t= " + rp100 + "\n" +
			"Rp 50 \t= " + rp50 + "\n" +
			"Rp 25 \t= " + rp25 + "\n" +
			"Rp 10 \t= " + rp10 + "\n" +
			"Rp 5 \t= " + rp5 + "\n" +
			"Rp 1 \t= " + rp1 + "\n"
			;
		return str;
		// Dibanding kita menggunakan System.out.println() secara terpisah, kita buat saja toString() untuk memperlihatkan informasi state objek. Apabila dikehendaki maka kapanpun kita dapat menggunakan toString() untuk memperlihatkan kondisi objek secara menyeluruh
	}

	static void second() {
		RupiahDistribution rd = new RupiahDistribution(130700);

		System.out.println(rd);
	}
	public static void main(String[] args) {
		second();
	}

	// Metode perhitungan
	private void distributeAmount() {
		long a = amount;

		rp100ribu = a / 100000;
		a -= (rp100ribu * 100000);

		rp50ribu = a / 50000;
		a -= (rp50ribu * 50000);

		rp20ribu = a / 20000;
		a -= (rp20ribu * 20000);

		rp10ribu = a / 10000;
		a -= (rp10ribu * 10000);

		rp5ribu = a / 5000;
		a -= (rp5ribu * 5000);

		rp1ribu = a / 1000;
		a -= (rp1ribu * 1000);

		rp500 = a / 500;
		a -= (rp500 * 500);

		rp100 = a / 100;
		a -= (rp100 * 100);

		rp50 = a / 50;
		a -= (rp50 * 50);

		rp25 = a / 25;
		a -= (rp25 * 25);

		rp10 = a / 10;
		a -= (rp10 * 10);

		rp5 = a / 5;
		a -= (rp5 * 5);

		rp1 = a / 1;

		// Perhitungan mulai dari satuan tertinggi rp100ribu, menggunakan operator div (/) dan mod (%). Setelah itu amount dikurangi jumlah yang telah disebarkan di rp100ribu, angka ini kemudian disebarkan ke rp50ribu, dan seterusnya
	}
}