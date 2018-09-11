/*
Persoalan :
	Tulis program aritmatika dua bilangan bulat sangat besar bahkan sampai 300 digit atau lebih. Salah satu pendekatan memandang tiap bilangan sebagai satu list, masing-masing memiliki elemen-elemen satu blok bilangan digit.

Contoh :
	Bilangan 179,534,672,198 disimpan dengan
	Blok[1] = 198
	Blok[2] = 672
	Blok[3] = 534
	Blok[4] = 179

(a) Buat prosedur penjumlahan kedua bilangan dengan penambahan bilangan demi bilangan, serta perlakukan carry dari satu elemen ke elemen berikutnya.
(b) Buat prosedur pengurangan kedua bilangan.
(c) Buat prosedur perkalian kedua bilangan.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (ArrayBigInteger) yang menyediakan layanan aritmatika bilangan besar yang dipresentasikan array. Layanan-layanan yang tersedia :
			1. Penjumlahan
			2. Pengurangan
			3. dan Seterusnya.
*/

package array;

public class BigInteger {
	private int[] digits;
	private int length = 0;
	private int modPerCell = 1000;
	public BigInteger() {}

	//Menyatakan bahwa constructor akan melemparkan Exception.
	public BigInteger(int[] digits) throws Exception {
		if (digits == null || digits.length < 1) {
			throw (new Exception ("Array harus berisi, tidak null"));
		}
		if (digits[0] == 0) {
			throw (new Exception("Digit pertama tidak boleh nol"));
		}
		setDigits(digits);
		length = digits.length;
	}
	public BigInteger(int length) {
		this.length = length;
		digits = new int[length];
		for (int i = 0; i < length; i++) {
			digits[i] = 0;
		}
	}
	public BigInteger(int length, int modPerCell) {
		this.length = length;
		this.modPerCell = modPerCell;
		digits = new int[length];
		for (int i = 0; i < length; i++) {
			digits[i] = 0;
		}
	}

	public int getLength() {
		return length;
	}

	public BigInteger add(BigInteger a) {
		BigInteger bi;
		int carry = 0;
		if (a.length > this.length) {
			bi = new BigInteger(a.length + 1);
			bi.digits[0] = (this.digits[0] + a.digits[0]) % modPerCell;
			carry = (this.digits[0] + a.digits[0] + carry) / modPerCell;
			for (int i = 1; i < this.length; i++) {
				bi.digits[i] = (this.digits[i] + a.digits[i] + carry) % modPerCell;
			}
			for (int i = this.length; i < a.length; i++) {
				bi.digits[i] = (a.digits[i] + carry) % modPerCell;
				carry = (a.digits[i] + carry) / modPerCell;
			}
			bi.digits[bi.digits.length - 1] = carry;
		} else {
			bi = new BigInteger(this.length + 1);
			bi.digits[0] = (this.digits[0] + a.digits[0]) % modPerCell;
			carry = (this.digits[0] + a.digits[0]) / modPerCell;
			for (int i = 1; i < a.length; i++) {
				bi.digits[i] = (this.digits[i] + a.digits[i] + carry) % modPerCell;
			}
			for (int i = a.length; i < this.length; i++) {
				bi.digits[i] = (this.digits[i] + carry) % modPerCell;
				carry = (this.digits[i] + carry) / modPerCell;
			}
		}
		if (bi.digits[bi.length - 1] == 0) {
			BigInteger bi2 = new BigInteger(bi.length - 1);
                    System.arraycopy(bi.digits, 0, bi2.digits, 0, bi2.length);
			bi = bi2;
		}
		return bi;
	}

	public void printDigits() {
		System.out.print(digits[digits.length - 1]);
		if (digits.length > 1) {
			for (int i = digits.length - 2; i >= 0; i--) {
				System.out.print(".");
				if (digits[i] == 0) {
					System.out.print("000");
				}
				else if (digits[i] < 10) {
					System.out.print("00");
				}
				else if (digits[i] < 100) {
					System.out.print("0");
				}
				if (digits[i] != 0) {
					System.out.print(digits[i]);
				}
			}
		}
		System.out.println();
	}
    
    //Kita kembali dapat melihat keampuhan toString() sebagai sarana mengirim string yang merupakan gambaran jelas state object. Dengan toString() maka format tampilan tidak diperhatikan, terserah pemanggilnya untuk melakukan format.
    @Override
	public String toString() {
		String str = "";
		str += digits[digits.length -1];
		if (digits.length > 1) {
			for (int i = digits.length -2; i >= 0; i--) {
				str = ".";
				if (digits[i] == 0) {
					str += "000";
				}
				else if (digits[i] < 10) {
					str += "00";
				}
				else if (digits[i] < 100) {
					str += "0";
				}
				if (digits[i] != 0) {
					str += digits[i];
				}
			}
		}
		return str;
	}

	//Menyatakan metode akan melemparkan Exception. Deklarasi ini menyatakan harus terdapat kode yang menangkapnya.
	static void t01() throws Exception {
		int[] digitsA = {1};
		BigInteger dA = new BigInteger(digitsA);
		System.out.println("1a = " + dA);

		int[] digitsB = {1, 2};
		BigInteger dB = new BigInteger(digitsB);
		System.out.println("1b = " + dB);

		int[] digitsC = {1, 2, 3, 4, 5, 6, 7, 8, 9, 999};
		BigInteger dC = new BigInteger(digitsC);
		System.out.println("1c = " + dC);
		//Pada metode t01() pemanggilan constructor tidak diapit try ... catch ..., maka tindakan ini akan mengakibatkan penghentian kompilasi bila deklarasi metode t01() tidak menyatakan throws.
	}
	//Menyatakan metode akan melemparkan Exception. Deklarasi ini menyatakan harus terdapat kode yang menangkapnya.
	static void t02() throws Exception {
		int[] digitsA = {1, 0, 672, 198};
		BigInteger dA = new BigInteger(digitsA);
		System.out.println("2a = " + dA);

		int[] digitsB = {1, 0, 0, 0, 0, 0, 0, 0};
		BigInteger dB = new BigInteger(digitsB);
		System.out.println("2b = " + dB);

		BigInteger dC = dA.add(dB);
		System.out.println("2A + 2B = " + dC);
		//Pada metode t02() pemanggilan constructor tidak diapit try ... catch ..., maka tindakan ini akan mengakibatkan penghentian kompilasi bila deklarasi metode t02() tidak menyatakan throws.
	}
	//Menyatakan metode akan melemparkan Exception. Deklarasi ini menyatakan harus terdapat kode yang menangkapnya.
	static void t03() {
		try {
			BigInteger bi = new BigInteger(null);
		} catch (Exception e) {
			System.out.println(e);
		}
		//Metode yang dideklarasi dengan try berarti tidak menangkap Exception, serta melemparkan ke metode memanggil metode t01() untuk menanganinya.
	}
	static void userInterface() throws Exception {
		t01();
		space();
		t02();
		space();
		t03();
	}
	static void space() {
		System.out.println();
	}

	//Demikian seterusnya, sampai metode main() pun menyerahkan Exception yang mungkin terjadi ke yang lebih tinggi.
	public static void main(String[] args) throws Exception {
		//Di atas metode main() berarti sistem Java yang bila menangkap Exception akan menghentikan program serta mencetak stack pemanggilan.
		userInterface();
	}

	private void setDigits(int[] digits) {
		this.digits = new int[digits.length];
		for (int i = 0; i < digits.length; i++) {
			this.digits[i] = digits[digits.length - 1 - i];
		}
	}
}

/*
Default
	Penanganan sistem Java adalah menghentikan program. Apabila kita tidak menghendaki hal ini terjadi maka kita harus menangani Exception yang dilempar metode di block try .. catch, serta harus menanganinya secara bagus.

Exception handling
	Merupakan sarana penanganan kesalahan paling mutahir yang memiliki karakteristik-karakteristik unggul.
*/
