package usantatecla.movies.models;

public class ChildrenPrice extends Price {

	private static final double CHARGE = 1.5;
	private static final double EXTRA_CHARGE = 1.5;
	private static final int DAYS_RENTED_THRESHOLD = 3;
	
	@Override
	public double getCharge(int daysRented) {
		double result = Price.CHARGE_CHILDREN;
		if (daysRented > Price.DAYS_RENTED_THRESHOLD_CHILDREN) {
			result += (daysRented - 1) * Price.EXTRA_CHARGE_CHILDREN;
		}
		return result;
	}

}
