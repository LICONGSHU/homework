package Main;
import java.util.Scanner;
// LI CONGSHU BC254555

public class Exchange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double USD = 0.21;
		final double EURO = 0.19;
		final double YEN = 33.5;
		
		System .out.println("Enter amount in MYR: ");
		double myr = input.nextDouble();
		
		double usd = myr * USD;
		double euro = myr * EURO;
		double yen = myr * YEN;
		System.out.printf("USD: %.2f\n EURO: %.2f\n YEN: %.2f\n", usd, euro, yen);
		input.close();
	}

}
