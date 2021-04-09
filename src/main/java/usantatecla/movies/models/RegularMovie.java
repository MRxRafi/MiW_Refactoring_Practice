package usantatecla.movies.models;

public class RegularMovie extends Movie {
    
    public RegularMovie(String title) {
        super(title, MovieType.REGULAR);
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
