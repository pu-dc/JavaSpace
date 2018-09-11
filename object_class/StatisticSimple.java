/*
Persoalan :
	Buat program untuk menghitung besaran-besaran statistik.
	- Rataan (Average)
	- Varian (Variance)
	- Deviasi Standar (Standard Deviation)
	- Mean
	- Median
	- Modus

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (StatisticSimple) yang menyediakan layanan-layanan informasi besaran-besaran statistik sederhana.
*/
package object_class;
import java.util.Arrays;
import java.util.Collections;

public class StatisticSimple {
	private final Integer[] value;
	private final Integer[] frequency;
   	private int sum 			= 0;
   	private int population 		= 0;
   	private int median 			= 0;
   	private double average 		= 0.0;
   	private double mean 		= 0.0;
	private double modus  		= 0.0;		
	private double variance 	= 0.0;
	private double deviation 	= 0.0;
		
	private String test_result = "";

	// Creates a new instance of StatisticSimple
	// Mencatat masing-masing besaran statistik. Kita akan menggunakan perhitungan sekali yaitu dilakukan saat constructor.
	public StatisticSimple(Integer[] val, Integer[] fre) {
		this.value 		= val;
		this.frequency 	= fre;
		// Saat calculation(), metode melakukan pengisian besaran-besaran statistik ke atribut-atribu. Kita kemudian tinggal membuat metode query terhadap besaran-besaran statistik dengan sekadar mengirim atribut-atribut itu.
		calculation();
	}
	public double getAverage() {
		return average;
	}
	public double getMean() {
		return mean;
	}
	public double getModus() {
		return modus;
	}
	public double getMedian() {
		return median;
	}
	public double getVariance() {
		return variance;
	}
	public double getDeviation() {
		return deviation;
	}	
	@Override
	public String toString() {
		String data = "Data \nValue \t Valuency\n";
		for (int i = 0; i < value.length; i++) {
			data += value[i] + " \t " + frequency[i] + "\n";
		}
		data += "\n";

		String str = data 		+
			"Hasil \n" 			+ 
			"Total \t\t: " 		+ sum 			+ "\n" +
			"Populasi \t: " 	+ population 	+ "\n" +
			"Rata-rata \t: " 	+ average		+ "\n" +
			"Modus \t\t: " 		+ modus		+ "\n" +
			"Median \t\t: " 	+ median 	+ "\n" +
			"Deviasi \t: " 		+ deviation 	+ "\n" +
			"Varian \t\t: " 	+ variance		+ "\n" +			
			"Test \t: " 		+ test_result
			;
		return str;
	}

	static void userInterface() {
		Integer[] value 	= {51, 60, 70, 80, 90, 100};
		Integer[] frequency = {1, 2, 3, 4, 5, 6};
		System.out.println(new StatisticSimple(value, frequency));
	}

	public static void main(String[] args) {
		userInterface();
	}

	private void calculation() {
		calculationSum_Average();
		calculationModus();
		calculationMedian();
		calculationDeviation_Variance();		
	}
	private void calculationSum_Average() {
		for (int i = 0; i < value.length; i++) {
			sum += (value[i] * frequency[i]);
			population += frequency[i];
		}
		average = sum / population;
	}
	private void calculationModus() {
		double tb, d1, d2, c;
		int getFrequencyMax, getFrequencyIndex = 0, getFrequencyD1 = 0, getFrequencyD2 = 0;

		getFrequencyMax = Collections.max(Arrays.asList(frequency));

		for (int i = 0; i < frequency.length; i++) {
			if (getFrequencyMax == frequency[i]) {
				getFrequencyIndex = i;
				if (i == 0) {
					getFrequencyD1 = frequency.length - 1;
					getFrequencyD2 = i + 1;	
				}
				if (i == (frequency.length - 1)) {
					getFrequencyD1 = i - 1;
					getFrequencyD2 = 0;	
				}
				if (i != 0 && i != (frequency.length - 1)) {
					getFrequencyD1 = i - 1;
					getFrequencyD2 = i + 1;
				}				
			}
		}

		tb 	= value[getFrequencyIndex] - 0.5;
		d1 	= frequency[getFrequencyIndex] - frequency[getFrequencyD1];
		d2 	= frequency[getFrequencyIndex] - frequency[getFrequencyD2];
		c 	= 1;

		modus = tb + ((d1 / (d1 + d2)) * c);
	}
	private void calculationMedian() {
		int getValueMax, getValueMin;

		getValueMax = Collections.max(Arrays.asList(value));
		getValueMin = Collections.min(Arrays.asList(value));

		median = getValueMax - getValueMin;
	}
	private void calculationDeviation_Variance() {
		double sumOfSquare = 0.0;
		for (int i = 0; i < value.length; i++) {
			sumOfSquare += frequency[i] * (value[i] - average) * (value[i] - average);
		}
		variance 	= sumOfSquare / value.length;
		deviation 	= Math.sqrt(sumOfSquare / value.length);
	}	
}
/*
Bahasan :
	Atribut-atribut :
		private final double[] value;
		private final int[] frequency;
	Keduanyan untuk mencatat titik-titk sample beserta frequensi kemunculan titik sample.

	Mencatat jumlah populasi yang berarti total dari jumlah sample :
		private double sum 			= 0.0;
		private double average 		= 0.0;
		private double variance 	= 0.0;
		private double deviation 	= 0.0;
		private double mean 		= 0.0;
		private double median 		= 0.0;
		private double modus  		= 0.0;

	Kalkulasi terhadap :
		- Populasi
		- Total nilai seluruhnya
		- Rataan
	Dapat dilakukan secara bersamaan dengan :
		private void calculationSum_Average() {}

	Kalkulasi terhadap :
		- Standard deviation
		- Variance
	Datap dilakukan secara bersamaan dengan :
		private void calculationDeviation_Variance() {}


Berpikir dan Bertindak Lokal :
	Pada pendekatan ini, kita biasanya dapat melakukan optimasi skala layanan-layanan (Metode-metode) di kelas. Pada saat melakukan perhitungan rataan (Average), pasti diperoleh nilai populasi dan Sum. Kita dapat mencatat di atribut population, sum, dan sekaligus average. Pada saat perhitungan Standard Deviation, pasti diperoleh Variace, dan seterusnya. Kalkulasi-kalkulasi ini tidak perlu diketahui pemakai. Pemakai tinggal memakai layanan-layanan yang dijanjikan serta memperoleh sesuai janji. Tidak lebih dari itu.

	Setelah semuanya dikalkulasi maka pemakai merasakan layanan berkecepatan tinggi karena beberapa layanan disediakan melalui penyimpanan (By storage), tidak perlu melakukan komputasi / perhitungan terlebih dahulu.

	Pemakai akan memperoleh layanan :
		public double getAverage()
		public double getDeviation()
		public double getMean()
		public double getSum()
		public double getMedian()
		public double getModus()
	Secara cepat karena metode-metode hanya mengirim nilai tersimpan.


Kesimpulan :
	- Optimasi secara lokal sulit diterapkan digaya pemrograman yang tidak menerapkan ADT (Cara pandang orientasi object)
	- Pembuatan kelas mengajak berpikir dan bertindak secara lokal untuk lebih dulu mengupayakan efektifitas dan efisiensi (optimasi) relatif di kelas itu.
	- Object ibarat roh dan badan yang perlu dimanipulasi yang telah disatukan di satu wadah. Tidak perlu asumsi lebih banyak karena metode hanya perlu dipikirkan untuk mengolah data di satu wadah. Pasti berinteraksi dengan yang lain, namun rancangan yang baik seharusnya telah berusaha meminimalkan interaksi dengan yang lain. Modul adalah bagus bila semakin "self-contained", segala keperluanya telah dipenuhi sendiri, didalam dirinya.
*/