package usantatecla.movies.models;

public class NewReleaseMovie extends Movie {

	private static final double CHARGE = 3;

    public NewReleaseMovie(String title) {
        super(title, MovieType.NEW_RELEASE);
    }

    public double getCharge(int daysRented) {
		return NewReleaseMovie.CHARGE;
	}

    @Override
    public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > Movie.DAYS_RENTED_THRESHOLD_NEW_RELEASE) {
			return Movie.FREQUENT_RENTER_POINTS_NEW_RELEASE;
		} else {
			return Movie.FREQUENT_RENTER_POINTS;
		}
	}

}
