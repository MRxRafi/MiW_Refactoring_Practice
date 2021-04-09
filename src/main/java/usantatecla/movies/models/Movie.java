package usantatecla.movies.models;

public abstract class Movie {

	protected static final int FREQUENT_RENTER_POINTS = 1;

	protected String title;
	protected MovieType movieType;
	
	public Movie(String title, MovieType movieType) {
		this.title = title;
		this.movieType = movieType;
	}
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return Movie.FREQUENT_RENTER_POINTS;
	}
	
	public String getTitle() {
		return title;
	}
	
}
