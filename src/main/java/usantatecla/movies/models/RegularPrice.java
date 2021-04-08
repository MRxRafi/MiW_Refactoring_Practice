package usantatecla.movies.models;

public class RegularPrice extends Price {
	
	@Override
	public double getCharge(int daysRented) {
		double result = Price.CHARGE_REGULAR;
		if (daysRented > Price.DAYS_RENTED_THRESHOLD_REGULAR) {
			result += (daysRented - Price.DAYS_RENTED_THRESHOLD_REGULAR) * Price.EXTRA_CHARGE_REGULAR;
		}
		return result;
	}

}
