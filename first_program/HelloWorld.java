/*
Program pertama yang selalu harus dibuat pemrogram dibahasa baru adalah program menyapa dunia. Program ini sepele, hanya mencetak kalimat "Hello World!" di layar. Program mencetak "Hello World!" seharusnya dibuat saat pemrogram belajar bahasa baru, sebelum membuat program lebih rumit. Bila program sepele ini telah dapat dilaksanakan berarti pemrogram mengenal beberapa fungsi paling dasar dari kakas pengembangan.

Langkah 1 : Penulisan Program
	Buat file (ASCII atau Unicode) bernama (HelloWorld.java) dengan teks editor (Sublime is recomended) atau IDE (Netbeans / Eclipse) :
*/

package first_program;

public class HelloWorld {
	public static void main(String[] args) {
		String h, w;
		h = "Hello";
		w = "World!";

		System.out.println("Hello World");
		System.out.print("Hello World \n");
		System.out.printf("%s %s \n", h, w);
	}
}

/*
Catatan :
	Java adalah case sensitive, jika kita membuat kekeliruan dalam huruf kapital dan huruf kecil, maka bisa jadi program tidak dapat dikompilasi.

	Contoh :
		Pengetikan Main() untuk main() akan menyebabkan kompilasi tidak berjalan lancar.

	Anda harus menyimpan sebagai (HelloWorld.java), jika tidak maka anda akan memperoleh pesan kesalahan saat mengeksekusi program. Pada kelas yang dieksekusi, nama kelas dan nama file harus sama.


Langkah 2 : Menjalankan Program
	Jika menggunakan IDE, seharusnya anda dimudahkan hanya dengan mengklik Run File atau tombol F6 pada Netbeans.

	Jika menggunakan command prompt pada OS Unix, Linux, maupun Windows anda dapat mencarinya di situs internet dengan contoh kata kunci "How to compile and run java in windows/linux/unix".

	Berbeda dengan IDE yang dapat dijalankan secara instan. Menjalankan bahasa pemrograman dari konsol dibutuhkan beberapa konfigurasi agar program / kode yang dibuat dapat berjalan dan tampil di permukaan / interface.


Pembahasan progam :
	Kata kunci public disebut access modifier untuk mengendalikan ketampakan penggunaan kode ini terhadap bagian-bagian lain.

	Kata kunci class, segala sesuatu di program Java berada didalam suatu kelas. Kita dapat memandang kelas sebagai wadah logis yang mendefinisikan perilaku aplikasi. Kelas merupakan blok pembangun di mana aplikasi Java dibangun.

	Setelah kata kunci class adalah nama kelas. Aturan nama kelas di Java sangat umum. Namun harus dimulai huruf, setelah itu boleh kombinasi huruf dan digit. Kita tidak dapat menggunakan kata yang dicadangkan (reserved word yang sebagian besar merupakan kata kunci) untuk nama kelas. HelloWorld adalah nama kelas. Konvensi penamaan kelas adalah kata benda dimulai huruf kapital (besar) diawal kata yang berarti.

	Penulis menambahkan konvensi sedikit rumit yaitu :
		- Diakhiri App untuk kelas yang dieksekusi (yaitu memuat metode main())
		- Diakhiri Applet untuk menyatakan applet, contoh WelcomeApplet
		- Diakhiri Class untuk menyatakan kelas, contoh PersonClass

	Mengkompilasi program dengan 
		javac HelloWorld.java

	Mengeksekusi progam dengan
		java HelloWorld

	Java interpreter selalu menjalankan eksekusi dimulai main() di kelas. Kita harus mempunyai satu metode main() di kelas yang akan dieksekusi.


public static void main(String args[]) {}
	Fungsi main() harus ditetapkan sebagai berikut :
		- public 	berarti metode dapat dipanggil dari manapun didalam dan diluar kelas
		- static 	berarti adalah sama untuk seluruh instance dari class
		- void 		berarti metode tidak mengirimkan apapun setelah selesainya

	Fungsi main() dapat mempunyai argumen yang diambil dari lingkungan eksekusi. Argumen args[] adalah array objek String argumen-argumen baris perintah yang dilewatkan ke kelas yang dieksekusi. Kelas HelloWorld mengabaikan seluruh argumen baris perintah.


System.out.print()
	Kalimat / pernyataan di Java diakhiri tanda titik koma (semicolon ;) seperti C/C++ dan Pascal. Berbeda dengan C++ atau Pascal, ekspresi String diapit "..." bukan '...'
	
	Ekspresi diatas memanggil fungsi/metode print() di objek out di kelas System. Objek out merupakan standar output, sementara kelas System adalah kelas yang mengapsulkan seluruh fungsionalitas sistem. Dalam terminologi orientasi objek, kelas HelloWorld mengirim pesan print() ke objek out di kelas System.

	Kita menggunakan objek System.out dan memanggil metode print(). Titik (. periode) untuk memanggil metode. Java menggunakan sintaks umum pemanggilan metode sebagai berikut :
		object.method(parameter-parameter)
	
	Kita memanggil metode print() dan melewatkan parameter String "Hello World!". Metode ini menampilkan parameter String ke konsol.

	Metode di Java, seperti fungsi di bahasa lain dapat menggunakan nol parameter atau lebih (beberapa bahasa menyebutnya argumen). Meski metode tidak memerlukan parameter (nol parameter), kita harus memanggil dengan pasangan kurung kosong.

	Jika kita memanggil println() tanpa parameter, efek perintah adalah mencetak ganti baris di layar / Enter.


{ }
	Pasangan kurung kurawal merupakan awal dan akhir badan metode. Metode ini hanya berisi satu kalimat didalamnya. Seperti kebanyakan bahasa pemrograman, kita dapat memandang kalimat Java sebagai kalimat bahasa. Di Java, kalimat harus diakhiri titik koma (semicolon ;). Ganti baris (carriage return) bukan menandai akhir kalimat, kalimat dapat merentang dibanyak baris jika diperlukan.


*/
