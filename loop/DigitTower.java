/*
Persoalan :
	Program keempat dengan keluaran sebagai berikut :
	Bentuk keluaran

	        1
	      2 3 2
	    3 4 5 4 3
	  4 5 6 7 6 5 4
	5 6 7 8 9 8 7 6 5

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buatlah kelas (DigitTower) yang menyediakan layanan pembangkit pola menara segitiga angka.
*/
package loop;

public class DigitTower {
	private int size;

	//Creates a new instance of DigitTower
	public DigitTower(int size) {
		this.size = size;
	}

	private int decrementDigit(int d) {
		d--;
		if (d == -1) {
			return 9;
		}
		return d;
	}
	private int incrementDigit(int i) {
		i++;
		if (i == 10) {
			return 0;
		}
		return i;
	}

	public String toString() {
		String str = "";
		int digit;
		for (int i = 1; i <= size; i++) {
			for (int space = 0; space < (size - i); space++) {
				str += " ";
			}
			digit = i % 10;
			for (int number = 0; number < (i - 1); number++) {
				str += digit;
				digit = incrementDigit(digit);
			}
			str += digit;
			for (int number = 0; number < (i - 1); number++) {
				digit = decrementDigit(digit);
				str += digit;
			}
			str += "\n";
		}
		//for (int i = (size / 2 - 1); i >= 0; i--) {
		for (int i = size; i > 0; i--) {
			for (int space = 0; space < (size - i); space++) {
				str += " ";
			}
			digit = i % 10;
			for (int number = 0; number < (i - 1); number++) {
				str += digit;
				digit = incrementDigit(digit);
			}
			str += digit;
			for (int number = 0; number < (i - 1); number++) {
				digit = decrementDigit(digit);
				str += digit;
			}
			str += "\n";
		}
		return str;
	}

	static void userInterface() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(new DigitTower(i));
		}		
	}
	public static void main(String[] args) {
		userInterface();
	}
}
