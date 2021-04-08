package usantatecla.movies.models;

public class RegularPrice extends Price {

	private static final double CHARGE = 2.0;
	private static final double EXTRA_CHARGE = 1.5;
	private static final int DAYS_RENTED_THRESHOLD = 2;
	
	@Override
	public double getCharge(int daysRented) {
		double result = Price.CHARGE;
		if (daysRented > Price.DAYS_RENTED_THRESHOLD) {
			result += (daysRented - Price.DAYS_RENTED_THRESHOLD) * Price.EXTRA_CHARGE;
		}
		return result;
	}

}
