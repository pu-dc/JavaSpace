package jump;

public class BreakLoop {
	public static void main(String[] args) {
		int i = 0;
		do {
			if (i > 10) {
				break;
			}
			System.out.println(i);
			i++;
			
		} while(true);
	}
}
