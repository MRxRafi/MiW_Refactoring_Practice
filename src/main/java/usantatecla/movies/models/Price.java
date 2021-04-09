package usantatecla.movies.models;

public class Price {
	
	public double getCharge(int daysRented) {
		return 0;
	}

	public double getChargeRegular(int daysRented) {
		double result = Movie.CHARGE_REGULAR;
		if (daysRented > Movie.DAYS_RENTED_THRESHOLD_REGULAR) {
			result += (daysRented - Movie.DAYS_RENTED_THRESHOLD_REGULAR) * Movie.EXTRA_CHARGE_REGULAR;
		}
		return result;
	}

	public double getChargeNewReleases(int daysRented) {
		return Movie.CHARGE_NEW_RELEASE;
	}
	
	public int getFrequentRenterPointsNewReleases(int daysRented) {
		if (daysRented > Movie.DAYS_RENTED_THRESHOLD_NEW_RELEASE) {
			return Movie.FREQUENT_RENTER_POINTS_NEW_RELEASE;
		} else {
			return this.getFrequentRenterPoints(daysRented);
		}
	}

	public double getChargeChildren(int daysRented) {
		double result = Movie.CHARGE_CHILDREN;
		if (daysRented > Movie.DAYS_RENTED_THRESHOLD_CHILDREN) {
			result += (daysRented - 1) * Movie.EXTRA_CHARGE_CHILDREN;
		}
		return result;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return Movie.FREQUENT_RENTER_POINTS;
	}
}
