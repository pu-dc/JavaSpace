/*
Persoalan :
	Program kedua dengan keluaran sebagai berikut :
		Bentuk Keluaran :
		*         * * * * * * * * * *         * 
		* *       * * * *     * * * *       * * 
		* * *     * * *         * * *     * * * 
		* * * *   * *             * *   * * * * 
		* * * * * *                 * * * * * * 

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (TrianglePatternSidebySide) yang menyediakan layanan pembangkitan pola segitiga secara bersebelahan.
*/
package loop;

public class TrianglePatternSidebySide {
	private int size;

	//Creates a new instance of TrianglePatternSidebySide
	public TrianglePatternSidebySide(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < size; i++) {
			for (int star = 0; star < i; star++) {
				str += "* ";
			}
			for (int space = i; space < size; space++) {
				str += "  ";
			}
			for (int star = i; star < size; star++) {
				str += "* ";
			}
			for (int space = 0; space < i; space++) {
				str += "  ";
			}
			for (int space = 0; space < i; space++) {
				str += "  ";
			}
			for (int star = i; star < size; star++) {
				str += "* ";
			}
			for (int space = i; space < size; space++) {
				str += "  ";
			}
			for (int star = 0; star < i; star++) {
				str += "* ";
			}
			str += "\n";
		}
		return str;
	}

	static void userInterface() {
		for (int i = 0; i < 10; i++) {
			System.out.println(new TrianglePatternSidebySide(i));
		}
		
	}
	public static void main(String[] args) {
		userInterface();
	}
}