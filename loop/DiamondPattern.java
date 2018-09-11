/*
Persoalan :
	Program ketiga dengan keluaran sebagai berikut :
	Bentuk keluaran

	    * 
	  * * * 
	* * * * * 
	  * * * 
	    * 

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (DiamondPattern) yang menyediakan layanan pembangkitan pola permata berlian.
*/
package loop;

public class DiamondPattern {
	private int size;

	//Creates a new instance of DiamondPattern
	public DiamondPattern(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < (size / 2 + 1); i++) {
			for (int space = 0; space < (size / 2 - i); space++) {
				str += "  ";
			}
			for (int star = 0; star < (2 * i + 1); star++) {
				str += "* ";
			}
			str += "\n";
		}
		for (int i = (size / 2 - 1); i >= 0; i--) {
			for (int space = 0; space < (size / 2 - i); space++) {
				str += "  ";
			}
			for (int star = 0; star < (2 * i + 1); star++) {
				str += "* ";
			}
			str += "\n";
		}
		return str;
	}
	static void userInterface() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(new DiamondPattern(i));
		}
		
	}
	public static void main(String[] args) {
		userInterface();
	}
}
