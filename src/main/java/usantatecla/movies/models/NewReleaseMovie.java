package usantatecla.movies.models;

public class NewReleaseMovie extends Movie {

	private static final double CHARGE = 3;

    public NewReleaseMovie(String title) {
        super(title, MovieType.NEW_RELEASE);
    }

    public double getCharge(int daysRented) {
		return NewReleaseMovie.CHARGE;
	}

}
