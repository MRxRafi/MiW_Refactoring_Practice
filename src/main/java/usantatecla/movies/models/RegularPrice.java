package usantatecla.movies.models;

public class RegularPrice extends Price {
	
	@Override
	public double getCharge(int daysRented) {
		double result = Price.CHARGE;
		if (daysRented > Price.DAYS_RENTED_THRESHOLD) {
			result += (daysRented - Price.DAYS_RENTED_THRESHOLD) * Price.EXTRA_CHARGE;
		}
		return result;
	}

}
