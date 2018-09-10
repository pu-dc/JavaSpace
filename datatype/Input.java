import javax.swing.*;
class Input {
	static void UI() {
		String in = JOptionPane.showInputDialog("Please Input : ");
		System.out.println(in);
		System.exit(0);
	}
	public static void main(String[] args) {
		UI();
	}
}
