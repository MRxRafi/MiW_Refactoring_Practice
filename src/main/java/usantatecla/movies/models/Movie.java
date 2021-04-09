package usantatecla.movies.models;

public abstract class Movie {

	private static final int DAYS_RENTED_THRESHOLD_NEW_RELEASE = 1;
	private static final int FREQUENT_RENTER_POINTS_NEW_RELEASE = 2;

	static final int FREQUENT_RENTER_POINTS = 1;

	protected String title;
	protected MovieType movieType;
	
	public Movie(String title, MovieType movieType) {
		this.title = title;
		this.movieType = movieType;
	}
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		if(this.movieType == MovieType.NEW_RELEASE) {
			return this.getFrequentRenterPointsNewReleases(daysRented);
		}
		else {
			return Movie.FREQUENT_RENTER_POINTS;
		}
	}

	public int getFrequentRenterPointsNewReleases(int daysRented) {
		if (daysRented > Movie.DAYS_RENTED_THRESHOLD_NEW_RELEASE) {
			return Movie.FREQUENT_RENTER_POINTS_NEW_RELEASE;
		} else {
			return Movie.FREQUENT_RENTER_POINTS;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
}
