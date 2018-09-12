/*
Persoalan :
	Buat table kuadrat dan pangkat tiga bilangan 0 sampai 10 sebagai berikut :
	Angka		kuadrat 	Kubik
	0			0			0
	1			1			1
	2			4			8
	3			9			27
	4			16			64
	...			...			...

Bahasan awal :
	Pandangan orientasi objek adalah terdapat kelas yang memberikan / menyediakan layanan menampilkan table kuadrat dan kubik. Jadi kita lebih dahulu bertumpu pada struktur yang jelas (kelas misalnya PowerTable) baru layanan-layanan yang disediakan, yang kemudian diterjemahkan dalam komputasi tertentu.

	Seperti kita sehari-hari, kesan fisik adalah yang umumnya diterima atau dipersepsi. Keberadaan mobil, kesan fisik diterima berupa mendaftarkan layanan-layanan yang diberikan mobil :
		- Mengemukakan warna, merek, jenis, dan sebagaianya
		- Memberi aksi bergerak, membuka pintu, dan sebagainay

	Yang dipersepsi manusia sebagain besar adalah rancangan fisik panca indera kemudian layanan fisik dan mental yang diterimanya.
*/

package operator;

public class PowerTable {
	private int numberOfRows;

	// Creates a new instance of PowerTable
	public PowerTable() {}
	public PowerTable(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	public void setNumber(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	public int getNumberOfRows() {
		return numberOfRows;
	}

	static void second() {
		PowerTable pt = new PowerTable(11);
		pt.printTable();
	}

	public static void main(String[] args) {
		second();
	}

	public void printTable() {
		System.out.println("N\tS\tC");
		for (int i = 0; i < numberOfRows; i++) {
			System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
		}
	}
}