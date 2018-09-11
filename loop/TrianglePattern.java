/*
Persoalan :
	Ketika program berikut adalah program permainan dengan for-loop. Program membuat aneka ragam bentuk hanya dengan "*" dan " ".

Program pertama dengan keluaran sebagai berikut :
*
* *
* * * 
* * * * 
* * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
        * 
      * * 
    * * * 
  * * * * 
* * * * * 

Bahasan awal :
	Pernyataan ulang terhadap deskripsi persoalan :
		Buat kelas (TrianglePattern) yang menyediakan layanan pembangkitan pola segitiga.
*/
package loop;

public class TrianglePattern {
	private final int size;

	//Creates a new instance of TrianglePattern
	public TrianglePattern(int size) {
		this.size = size;
	}
	public int getsize() {
		return size;
	}
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j <= i; j++) {
				str += "* ";
			}
			str += "\n";
		}
		for (int i = 0; i <= size; i++) {
			for (int j = i; j <= size; j++) {
				str += "* ";
			}
			str += "\n";
		}
		for (int i = 0; i <= size; i++) {
			for (int k = 0; k <= i; k++) {
				str += "  ";
			}
			for (int j = i; j <= size; j++) {
				str += "* ";
			}
			str += "\n";
		}
		for (int i = 0; i <= size; i++) {
			for (int k = i; k <= size; k++) {
				str += "  ";
			}
			for (int j = 0; j <= i; j++) {
				str += "* ";
			}
			str += "\n";
		}
		return str;
	}
	static void userInterface() {
		for (int i = 1; i <= 10; i++) {			
			System.out.println(new TrianglePattern(i));
		}
	}

	public static void main(String[] args) {
		userInterface();
	}
}
