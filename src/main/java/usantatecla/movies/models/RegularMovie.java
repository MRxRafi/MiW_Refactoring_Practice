package usantatecla.movies.models;

public class RegularMovie extends Movie {
    
    public RegularMovie(String title) {
        super(title, MovieType.REGULAR);
    }

    public double getCharge(int daysRented) {
		double result = Movie.CHARGE_REGULAR;
		if (daysRented > Movie.DAYS_RENTED_THRESHOLD_REGULAR) {
			result += (daysRented - Movie.DAYS_RENTED_THRESHOLD_REGULAR) * Movie.EXTRA_CHARGE_REGULAR;
		}
		return result;
	}
    
}
