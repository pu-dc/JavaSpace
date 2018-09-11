package array;

public class DayOfMonthLess {
	static void userInterface() {
		//Langkah deklarasi dan inisialisasi, sehingga sekaligus juga dilakukan penciptaan
		int monthDays[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int i = 1; i <= 12; i++) {
			System.out.printf("Bulan ke %d memiliki %d hari\n", i, monthDays[i-1]);
		}
	}
	public static void main(String[] args) {
		userInterface();
	}
}
