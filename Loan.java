package Main;
import java.util.Scanner;

public class Loan {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		final double RATE = 0.04;
		System.out.print("Enter Principal: ");
		double principal = input. nextDouble();
		
		double interest = principal * RATE;
		double TotalPayment = interest + principal;
		System.out.printf("Total Payment: %.2f\n", TotalPayment);
		input.close();
		
	}

}
