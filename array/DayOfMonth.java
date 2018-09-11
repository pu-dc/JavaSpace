/*
Proses untuk memperoleh array :
1. Deklarasi variable dari tipe array yang dikehendaki,
2. Alokasi memori yang akan menyimpan array menggunakan operator new() dan memberikanya ke variable array,
*/
package array;

public class DayOfMonth {
	static void userInterface() {
		int monthDays[];
		monthDays = new int[12];
		monthDays[0] = 31;
		monthDays[1] = 29;
		monthDays[2] = 31;
		monthDays[3] = 30;
		monthDays[4] = 31;
		monthDays[5] = 30;
		monthDays[6] = 31;
		monthDays[7] = 31;
		monthDays[8] = 30;
		monthDays[9] = 31;
		monthDays[10] = 30;
		monthDays[11] = 31;

		for (int i = 1; i <= 12; i++) {
			System.out.printf("Bulan %d mempunyai %d hari\n", i, monthDays[i-1]);
		}
	}
	public static void main(String[] args) {
		userInterface();
	}
}
