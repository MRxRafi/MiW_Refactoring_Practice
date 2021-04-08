package usantatecla.movies.models;

public abstract class Price {

	protected static final double CHARGE_REGULAR = 2.0;
	protected static final double EXTRA_CHARGE_REGULAR = 1.5;
	protected static final int DAYS_RENTED_THRESHOLD_REGULAR = 2;

	protected static final double CHARGE_NEW_RELEASE = 3;
	protected static final int DAYS_RENTED_THRESHOLD_NEW_RELEASE = 1;
	protected static final int FREQUENT_RENTER_POINTS_NEW_RELEASE = 2;

	protected static final double CHARGE_CHILDREN = 1.5;
	protected static final double EXTRA_CHARGE_CHILDREN = 1.5;
	protected static final int DAYS_RENTED_THRESHOLD_CHILDREN = 3;

	private static final int FREQUENT_RENTER_POINTS = 1;
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return Price.FREQUENT_RENTER_POINTS;
	}
}
