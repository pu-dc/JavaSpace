package array;

public class Average {
	static void uI() {
		//Langkah deklarasi, penciptaan, inisialisasi variable array
		double exam_point[] = {90, 80, 70, 90, 80, 80};
		double result = 0;
		for (int i = 0; i < 6; i++) {
			result = result + exam_point[i];
		}
		System.out.printf("Rata-rata : %.2f\n", result / 5);
	}
	public static void main(String[] args) {
		uI();
	}
}
