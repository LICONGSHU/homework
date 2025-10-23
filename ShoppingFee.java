package Main;
import java.util.Scanner;

public class ShoppingFee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double DISCOUNT = 0.10;
		System.out.print("Enter total price: ");
		double totalPrice = input. nextDouble();
		
		System.out.print("Enter shopping fee: ");
		double discount = totalPrice * DISCOUNT;
		
		
		double shippingFee = input.nextDouble();
		
		
		double finalPrice = totalPrice - discount + shippingFee;
		
		System.out.printf("Discount: %.2f\n", discount);
		System.out.printf("Final price (after discount and shippng): %.2f\n", finalPrice);
		input.close();
	}

}
