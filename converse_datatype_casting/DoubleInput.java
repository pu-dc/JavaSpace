/*
Line :
	import javax.swing.*

	Diawal program karena kelas JOptionPane didefinisikan di paket javax.swing. kapanpun kita menggunakan kelas yang bukan berada di paket java.lang maka kita harus mendeklarasikan direktif import yang menunjukan lokasi paket dan nama kelas yang dikehendaki untuk dimasukan ke program.

Untuk membaca angka, lebih sulit lagi yakni kita harus melakukan konversi string menjadi angka. Metode JOptionPane.showInputDialog() mengirim string bukan angka. Untuk konversi, kita menggunakan metode berikut :

	- Metode Integer.parseInt() untuk mengonversi String menjadi angka int
	- Metode Double.parseDouble() untuk mengonversi String menjadi angka double
*/

package converse_datatype_casting;
import javax.swing.*;

public class DoubleInput {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Berapa tinggi menara Batavia?");
		double height = Double.parseDouble(input);

		System.out.println("Tinggi menara Batavia " + height + "m");
		System.exit(0);
	}
}

/*
Hati-hati untuk tidak mengetik masukan String yang tidak dapat dikonversi menjadi double. Masukan itu akan menimbulkan kesalahan. Ketika berjalan salah, anda dapat menekan tombol Ctrl + C secara bersamaan untuk mengakhiri eksekusi aplikasi. Di Java, kita menangani beragam bentuk kesalahan secara lebih baik menggunakan fasilitas exception handling.
*/