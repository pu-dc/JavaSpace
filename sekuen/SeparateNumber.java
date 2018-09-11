/*
Persoalan :
	Pemisahan angka-angka
	Terdapat angka banyak digit maka pisahkan angka menjadi digit-digit pembentukanya dan cetak masing-masing digit dipisahkan dengan.

Contoh :
	Terhadap 45988, maka program mencetak :
	45988 adalah 4 5 9 8 8

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (SeparateNumber) yang menyediakan layanan pemisahan angka atas digit-digitnya.
*/
package sekuen;

public class SeparateNumber {
	// Atribut
	private final long number;

	public SeparateNumber(long number) {
		this.number = number;
	}
	public long getNumber() {
		return number;
	}
    @Override
	public String toString() {
		String str =
			number + " dapat dipisahkan menjadi : " + separate();
		return str;
	}

	static void userInterface() {
		for (long i = 999999999999999990l; i <= 999999999999999999l; i++) {
			System.out.println(new SeparateNumber(i));	
		}
	}

	public static void main(String[] args) {
		userInterface();
	}

	private String separate() {
		String n = "" + number;
		String str = "";
		for (int i = 0; i < n.length(); i++) {
			str += n.substring(i, i + 1) + " ";
		}
		return str;
	}
}
