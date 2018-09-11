/*
Persoalan :
	Pada perhitungan pajak, diskon dan sebagainya sering dijumpai persoalan perhitungan naik perlahan (incremental). Pada persoalan pajak penghasilan misalnya :
		Penghasilan 		Rate
		10,000				0%
		20,000				10%
		40,000				15%
		100,000				25%
		>100,000			30%

	Bila penghasilanya adalah 65,000 maka pajaknya adalah?
	Buat program untuk melakukan perhitungan kenaikan perlahan tersebut.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (IncrementalCalculator) yang menyediakan layanan perhitungan secara "incremental".

Bahasan :
	1. Pembacaan dan penegasan spesifikasi
	2. Generalisasi dengan table

Pertanyaan :
	1. Apakah memang demikian yang dikehendaki, berapakah pajak pendapatan bagi yang berpenghasilan 1,000?
	2. Apakah memang memakai Math.floor()?, bagaimana aturan pembulatan yang dilakukan berdasarkan peraturan yang ada?
*/
package approximate_object_oriented;

public class IncrementalCalculator {
	// Creates a new instance of IncrementalCalculator
	public IncrementalCalculator() {}

	static void userInterface() {
		t01();
		t02();
		t03();
	}
	static void t01() {
		for (int i = 999; i < 1000000; i++) {
				System.out.println("Pajak untuk " + i + " \t: " + calculationTax(i));		
		}		
	}
	static void t02() {
		for (int i = 999; i < 1000000; i++) {
			System.out.println("Pajak untuk " + i + " \t: " + calculationTaxBetter(i));

		}
	}
	static void t03() {
		double[] upper = {1000, 10000, 20000, 40000, 100000};
		double[] rate = {0.0, 0.1, 0.15, 0.2, 0.25, 0.3};
		try {
			for (int i = 999; i < 1000000; i++) {
				System.out.println("Pajak untuk " + i + " \t: " + calculationTaxIncome(i, upper, rate));			
			}
		} catch(Exception e) {
			System.out.println("Kesalahan : " + e);
		}
	}

	public static void main(String[] args) {
		userInterface();
	}

	public static double calculationTax(double income) {
		double taxIncome;
		if (income < 1000) {
			return 0;
		}
		if (income < 10000) {
			double forRate0 = 1000;
			double forRate1 = income - forRate0;
			return Math.floor(0.1 * forRate1);
		}
		if (income < 20000) {
			double forRate0 = 1000;
			double forRate1 = 10000 - forRate0;
			double forRate2 = income - 10000;
			// Benarkah demikian ?
			return Math.floor(0.1 * forRate1 + 0.15 * forRate2);
			// Atau, apakah hasilnya berbeda?
			//return Math.floor(0.1 * forRate1) + Math.floor(0.15 * forRate2);
		}
		if (income < 40000) {
			double forRate0 = 1000;
			double forRate1 = 10000 - forRate0;
			double forRate2 = 20000 - 10000;
			double forRate3 = income - 20000;
			return Math.floor(0.1 * forRate1 + 0.15 * forRate2 + 0.2 * forRate3);
		}
		if (income < 100000) {
			double forRate0 = 1000;
			double forRate1 = 10000 - 1000;
			double forRate2 = 20000 - 10000;
			double forRate3 = 40000 - 20000;
			double forRate4 = income - 60000;
			return Math.floor(0.1 * forRate1 + 0.15 * forRate2 + 0.2 * forRate3 + 0.25 * forRate4);
		}
		if (income >= 100000) {
			double forRate0 = 1000;
			double forRate1 = 10000 - 1000;
			double forRate2 = 20000 - 10000;
			double forRate3 = 40000 - 20000;
			double forRate4 = 100000 - 40000;
			double forRate5 = income - 100000;
			return Math.floor(0.1 * forRate1 + 0.15 * forRate2 + 0.2 * forRate3 + 0.25 * forRate4 + 0.3 * forRate5);
		}
		return 0.0;
	}
	public static double calculationTaxBetter(double income) {
		double taxRate[][] = {
			{1000, 0.0},
			{10000, 0.1},
			{20000, 0.15},
			{40000, 0.2},
			{100000, 0.25}
		};
		final double HIGHEST_RATE = 0.3;
		double tax = 0.0;
		double forRate[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		// Kasus terbawah
		if (income <= taxRate[0][0]) {
			return 0.0;
		}
		// Kasus teratas
		if (income > taxRate[4][0]) {
			for (int i = 1; i < 5; i++) {
				tax += (taxRate[i][0] - taxRate[i - 1][0]) * taxRate[i][1];
			}
			tax += (income - taxRate[4][0]) * HIGHEST_RATE;
			return Math.floor(tax);
		}
		int highest = 1;
		while(highest < 5 && income > taxRate[highest][0]) highest++;
		for (int i = 1; i < highest; i++) {
			tax += ((taxRate[i][0] - taxRate[i - 1][0]) * taxRate[i][1]);
		}
		tax += ((income - taxRate[highest - 1][0]) * taxRate[highest][1]);
		return Math.floor(tax);
	}
	public static double calculationTaxIncome(int income, double[] upper, double[] rate) throws Exception {
		if (rate.length != upper.length + 1) {
			throw (new Exception("Array rate harus lebih besar!"));
		}
		double tax = 0.0;
		double forRate[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		// Kasus terbawah
		if (income <= upper[0]) {
			return 0.0;
		}
		// Kasus teratas
		if (income > upper[upper.length - 1]) {
			for (int i = 1; i < upper.length; i++) {
				tax += (upper[i] - upper[i - 1]) * rate[i];
			}
			tax += (income - upper[upper.length - 1]) * rate[rate.length - 1];
			return Math.floor(tax);
		}
		int highest = 1;
		while (highest < upper.length && income > upper[highest]) {
			highest++;
		}
		for (int i = 1; i < highest; i++) {
			tax += ((upper[i] - upper[i - 1]) * rate[i]);
		}
		tax += ((income - upper[highest - 1]) * rate[highest]);
		return Math.floor(tax);		
	}
}
