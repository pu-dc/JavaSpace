package converse_datatype_casting;
import javax.swing.*;

public class StringInput {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		System.out.println(name);
		System.exit(0);
	}
}

/*
Bahasan :
	Ketika program memanggil JOptionPane.showInputDialog(), kita perlu mengakhiri program dengan memanggil System.exit(0). Alasanya, saat menampilkan dialog box berarti sistem memulai satu thread kendali baru. Ketika metode main() berakhir (exit), thread baru tidak berakhir secara otomatis. Untuk mengakhiri semua thread, kita perlu memanggil metode System.exit()

	Metode System.exit() menerima masukan bilangan bulat "exit code" program.

Converse :
	Program keluar dengan exit code bernilai 0 berarti program berakhir sukses. Angka bukan 0 menunjukan keberadaan kesalahan. Kita dapat menggunakan angka berbeda untuk menunjukan kondisi berbeda. Program keluar berkomunikasi dengan sistem operasi.
*/