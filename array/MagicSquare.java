/*
Persoalan :
	Bujur sangkar ajaib adalah matriks n x n yang masing-masing elemen berisi bilangan bulat 1, 2, 3, ..., n^2 yang muncul tepat sekali bahwa penjumlahan masing-masing baris kolom dan diagonal adalah sama.

Contoh :
	Bujur sangkar ajaib 5 x 5 dimana semua elemen baris kolom dan diagonal apabila dijumlahkan menghasilkan 65 :
		17 24 01 08 15
		23 05 07 14 16
		04 06 13 20 22
		10 12 19 21 03
		11 18 25 02 09

Cara :
	Untuk membentuk bujur sangkar n x n bahwa n adalah bilangan ganjil sebagai berikut :
		- K = 1.
		- Tempatkan bilangan K di tengah pada garis puncak.
		- Kemudian berlaku ketentuan berikut :
			- Setelah itu bilangan bulat K ditempatkan,
			- Bergeraklah keatas satu baris dan satu kolom ke kanan untuk menempatkan bilagan bulat berikutnya (K + 1) kecuali bila terjadi kondsi berikut :
				- Jika berada di atas baris puncak di kolom ke-J, pindah ke baris dasar dari kolom ke-J dan tempatkan K + 1,
				- Jika pergerakan menjadi di sebelah kanan dibaris ke-I, tempatkan K + 1 di baris ke-I disisi kiri,
				- Jika pergerakan ke tempat yang telah terisi atau di luar sudut kanan atas, tempatkan K + 1 tepat dibawah K.

Bahasan Awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas MagicSquare yang menyediakan layanan membuat bujur sangkar ajaib bilangan untuk sisi bilangan ganjil

		
*/
package array;

public class MagicSquare {
	static final int ADJUST = 1;

	private int side;
	private int[][] square;
	private boolean fValid = false;

	public MagicSquare(int side) {
		if (side % 2 == 1) {
			this.fValid = true;
			this.side 	= side;
			//Penciptaan Object
			square = new int[side][side];
			makeMagic();
		}
	}

	static void user01() {
		//Penciptaan Object
		MagicSquare mn = new MagicSquare(7);

		if (mn.isValid()) {
			mn.printSquare();
		} else {
			System.out.println("Nilai sisi yang dimasukan tidak sah!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		user01();
	}

	//Menguji Object
	public boolean isValid() {
		return fValid;
	}

	private void makeMagic() {
		//Precondition : side % 2 == 1
		int row = 1 - ADJUST;
		int col = side / 2;
		square[row][col] = 1;
		for (int k = 2; k <= (side * side); k++) {
			int oldRow = row;
			int oldCol = col;
			row = row - 1;
			col = col + 1;
			if (row < 0) {
				row = side - ADJUST;
			}
			if (col > side - ADJUST) {
				col = 1 - ADJUST;
			}
			if (square[row][col] == 0) {
				square[row][col] = k;
			} else {
				row = oldRow + 1;
				col = oldCol;
				square[row][col] = k;
			}
		}
	}

	public void printSquare() {
		//Precondition : isValid() == true
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				System.out.print(square[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	@Override
	public String toString() {
		//Precondition : isValid() == true
		String str = "";
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				str += "\n";
			}
		}
		return str;
	}
}   
