/*
Persoalan :
	Persoalan menara Hanoi terkenal menggambarkan keampuhan algoritma rekursif, yaitu :
		- Terdapat tiga menara sebenarnya lebih tepat sebagai tiang, katakan sebagai tiang A, B, dan C.
		- Pada salah satu tiang terdapat n piringan, misalnya piringan-piringan tersebut terletak di tiang A.
		- Persoalanya adalah memindahkan piringan-piringan dari tiang A ke tiang C dimana urutan piringan harus seperti semula. Piringan lebih bawah lebih besar dibanding piringan lebih atas.
		- Untuk memindahkan seluruh piringan ke tiang C dari tiang A, kita harus menggunakan tiang perantara B.

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (HanoiTower) dengan layanan penyelesaian soal menara Hanoi.
*/
package sekuen;

public class HanoiTower {
	private int numberOfDisk 		= 0;
	private char originPole 		= 'A';
	private char destinationPole 	= 'B';
	private char targetPole 		= 'C';
	private String str 				= "";

	//Creates a new instance of HanoiTower
	public HanoiTower(int numberOfDisk) {
		this.numberOfDisk = numberOfDisk;
		transfer();
	}
	@Override
	public String toString() {
		str = 
			"Menara Hanoi dengan " + numberOfDisk + " piringan\n" +
			"Asal \t\t: " + originPole + "\n" +
			"Tujuan \t\t: " + destinationPole + "\n" +
			"Perantara \t: " + targetPole + "\n" + str;
		return str;
	}

	static void userInterface() {
		System.out.println(new HanoiTower(10));
	}

	public static void main(String[] args) {
		userInterface();
	}

	private void diskMove(char originPole, char destinationPole) {
		str += "dari " + originPole + " ke " + destinationPole + "\n";
	}
	private void blockMove(int numberOfDisk, char originPole, char destinationPole, char targetPole) {
		if (numberOfDisk > 0) {
			// Kita harus memindahkan n - 1 piringan lebih dulu ke tiang perantara 
			blockMove(numberOfDisk - 1, originPole, targetPole, destinationPole);
			// n - 1 piringan telah pindah ke tiang perantara, maka kita segera dapat memindahkan satu piringan yang tersisa ke tiang tujuan
			diskMove(originPole, destinationPole);
			// Karena terdapat n - 1 piringan di tiang perantara, maka kita harus memindahkan n - 2 piringan tersebut ke tiang perantara (dalam hal ini tiang asal saat piringan masih n piringan), sehingga piringan yang tertinggal dapat dipindahakan ke tiang tujuan
			blockMove(numberOfDisk - 1, targetPole, destinationPole, originPole);
		}
	}
	// Karena harus diawali, kita menulis metode pemindahan sebagai metode transfer() yang memanggil metode rekursif blockMove()
	private void transfer() {
		blockMove(numberOfDisk, originPole, destinationPole, targetPole);
	}
}
