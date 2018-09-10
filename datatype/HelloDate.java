/*
Persoalan:
	Cetaklah data tanggal dan jam saat ini (current date and time)

Bahasan awal:
	Kita harus membuka dokumentasi JAva untuk mencari kelas yang memberikan layanan-layanan mengenai waktu dan tanggal
*/
package datatype;
import java.util.Date;

public class HelloDate {
	static void printHello() {
		System.out.println("Hello, it's : " + new Date());
		System.out.println(new Date());
	}
	public static void main(String[] args) {
		printHello();
	}
}

/*
Bahasan:
	Sebaiknya kita memisahkan metode-metode secara sistematik, metode main() seharusnya hanya sebagai perantara menjalankan metode-metode bantu lain. Pada kasus diatas maka metode penyelesaian adalah printHello().

	Kita seharusnya memisahkan metode-metode secara tegas, antara lain:
		- Metode untuk pemasukan
		- Metode untuk pengeluaran
		- Metode untuk kalkulasi/pemrosesan

	Intruksi new Date() menghasilkan objek baru yang langsung diinisialisasi dengan tanggal dan waktu saat itu dari sistem komputer.

	Objek diacu System.out.println() untuk pencetakan. Sesuai spesifikasi Java, seluruh kelas adalah turunan kelas Object. Ini berarti terdapat metode toString() yang mengirim String. Metode toString() di Date mengirim tanggal dan waktu saat objek diciptakan.

	Program hanya menggambarkan di Java telah tersedia kelas yang langsung dimanfaatkan, bukan menggambarkan secara berfikir objek. Penerapan konsep "Don't Reinvent The Wheel", yaitu untuk terlebih dulu memanfaatkan yang telah dibuat orang lain bila solusi yang diberikanya telah memadai.
*/
