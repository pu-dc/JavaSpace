package object_class;

public class DiscountClone {
	private double price;
	private double discount;
	public DiscountClone(double price, double discount) {
		this.price = price;
		this.discount = discount;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getPrice() {
		return price;
	}
	public double getDiscount() {
		return (price * (discount / 100));
	}
	@Override
	public String toString() {
		String str = 
			"Harga \t\t: " + getPrice() + "\n" +
			"Potongan \t: " + getDiscount() + "(" + discount + "%)" + "\n" +
			"====================================\n" +
			"Total \t\t: " + calculation() + "\n";
		return str;
	}

	static void userInterface() {
		DiscountClone dc = new DiscountClone(10000.9, 25.440);
		System.out.println(dc);
		System.out.println();
		System.out.printf("Harga \t\t: %.2f\n", dc.getPrice());
		System.out.printf("Potongan \t: %.2f (%.2f)\n", dc.getDiscount(), dc.discount);
		System.out.println("====================================");
		System.out.printf("Total \t\t: %.2f\n", dc.calculation());
	}
	public static void main(String[] args) {
		userInterface();
	}

	private double calculation() {
		return (price - getDiscount());
	}
}