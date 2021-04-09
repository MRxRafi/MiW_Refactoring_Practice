package usantatecla.movies.models;

public class NewReleaseMovie extends Movie {
    
    public NewReleaseMovie(String title) {
        super(title, MovieType.NEW_RELEASE);
    }

    public double getCharge(int daysRented) {
		return this.getChargeNewReleases(daysRented);
	}

}
