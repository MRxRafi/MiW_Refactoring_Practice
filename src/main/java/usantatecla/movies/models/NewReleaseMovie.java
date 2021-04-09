package usantatecla.movies.models;

public class NewReleaseMovie extends Movie {
    
    public NewReleaseMovie(String title) {
        super(title, MovieType.NEW_RELEASE);
    }

    public double getCharge(int daysRented) {
		if(this.movieType == MovieType.REGULAR) {
			return this.getChargeRegular(daysRented);
		}
		else if(this.movieType == MovieType.NEW_RELEASE) {
			return this.getChargeNewReleases(daysRented);
		}
		else {
			return this.getChargeChildren(daysRented);
		}
	}

}
