package method;
public class Recursion {
	static void userInterface() {
		Recursion r = new Recursion();
		try {
			System.out.println("0 Factorial = " + r.factorial(0));
			System.out.println("1 Factorial = " + r.factorial(1));
			System.out.println("2 Factorial = " + r.factorial(2));
			System.out.println("3 Factorial = " + r.factorial(3));
			System.out.println("4 Factorial = " + r.factorial(4));
			System.out.println("5 Factorial = " + r.factorial(5));
			System.out.println("6 Factorial = " + r.factorial(6));
			System.out.println("7 Factorial = " + r.factorial(7));
			System.out.println("8 Factorial = " + r.factorial(8));
			System.out.println("9 Factorial = " + r.factorial(9));
			System.out.println("10 Factorial = " + r.factorial(10));
		} catch(Exception e) {
			System.out.println("Terjadi exception, yaitu : " + e);
		}
	}

	public static void main(String[] args) {
		userInterface();
	}

	public long factorial(int n) throws Exception {
		if (n < 0 && n > 100) {
			throw new Exception("Tidak boleh < 0 && > 100");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
        long f = factorial(n - 1) * n;
		return f;
	}
}