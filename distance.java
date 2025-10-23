package Main;

public class distance {
	public static void main(String[]args) {
		final int Y = 1760;
		final double K = 1.60934;
		
		int miles = 20;
		int yard = 485;
		double totalMiles = miles + (yard / Y);
		double totalKm = totalMiles * K ;
		
		System.out.printf("Total distance: %.2f miles/n", totalMiles);
		System.out.printf("Equivalent distance: %.2f Km/n", totalKm);
	}

}
