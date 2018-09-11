/*
Persoalan :
	Hitunglah persamaan Pi berdasarkan deret tak terhingga
	Pi = 4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + ...

	Tulis table yang menunjukan Pi didekati 1 suku, 2 suku, 3 suku, 4 suku, dan seterusnya.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buatlah kelas (PiCalculation) yang menyediakan layanan pembangkitan bilangan Pi.
*/
package encapsulation;

public class PiCalculation {
	private int numberOfTerm;
	private double buffer = 0.0;

	// Creates a new instance of PiCalculation
	public PiCalculation(int numberOfTerm) {
		this.numberOfTerm = numberOfTerm;
	}
	public void setNumber(int numberOfTerm) {
		this.numberOfTerm = numberOfTerm;
	}
	public int getNumberOfTerm() {
		return numberOfTerm;
	}
	public double getPI() {
		return calculationPi();
	}
	public String toString() {
		String str =
			"Pi " + getNumberOfTerm() + " suku = " + getPI();
		return str;
	}

	static void userInterface() {
		System.out.println(new PiCalculation(5));
		space();
		PiCalculation pc = new PiCalculation(100000);
		System.out.println(pc);
		System.out.println("Pi dari Math.Pi = " + Math.PI);
		System.out.println("Selisih absolut adalah = " + Math.abs(Math.PI - pc.getPI()));
	}
	static void space() {
		System.out.println();
	}

	public static void main(String[] args) {
		userInterface();
	}

	private double calculationPi() {
		double pi, num, denom, sign;
		pi 		= 4.0;
		num 	= 4.0;
		denom 	= 3.0;
		sign 	= -1.0;

		for (int i = 0; i < numberOfTerm; i++) {
			double term = sign * num / denom;
			pi 		+= term;
			denom 	+= 2.0;
			sign 	*= -1.0;
		}

		buffer = pi;
		return pi;
	}
}
/*
Bahasan :
	Program untuk rekreasi otak dalam memecahkan persoalan matematika yang telah diketahui. program ini mengasah otak dalam membuat bentukan loop.
*/
