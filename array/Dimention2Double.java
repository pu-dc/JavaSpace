/*
	[baris][kolom]
*/
package array;

public class Dimention2Double {
	static void user() {
		double doubleMat[][] = {
			{0*0, 0*1, 0*2, 0*3},
			{1*0, 1*1, 1*2, 1*3},
			{2*0, 2*1, 2*2, 2*3},
			{3*0, 3*1, 3*2, 3*3}
		};

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(doubleMat[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		user();
	}
}
