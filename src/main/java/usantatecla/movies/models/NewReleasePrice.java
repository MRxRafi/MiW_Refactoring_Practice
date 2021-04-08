package usantatecla.movies.models;

public class NewReleasePrice extends Price {
	
	@Override
	public double getCharge(int daysRented) {
		return Price.CHARGE_NEW_RELEASE;
	}
	
	@Override
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > Price.DAYS_RENTED_THRESHOLD_NEW_RELEASE) {
			return Price.FREQUENT_RENTER_POINTS_NEW_RELEASE;
		} else {
			return super.getFrequentRenterPoints(daysRented);
		}
	}

}
