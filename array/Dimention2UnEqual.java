/*
	[baris][kolom]
*/
package array;

public class Dimention2UnEqual {
	static void uI() {
		//Langkah 1: Deklarasi variable array dan penciptaan
		int d2UE[][] = new int[4][];
		d2UE[0] = new int[1];
		d2UE[1] = new int[2];
		d2UE[2] = new int[3];
		d2UE[3] = new int[4];
		int k = 0;
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < i+1; j++) {
				d2UE[i][j] = k++;
			}
		}
		for (int i = 0; i < 4 ; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(d2UE[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		uI();
	}
}
