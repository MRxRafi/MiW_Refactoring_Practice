package usantatecla.movies.models;

public class RegularMovie extends Movie {
    
    public RegularMovie(String title) {
        super(title, MovieType.REGULAR);
    }

    public double getCharge(int daysRented) {
		return this.getChargeRegular(daysRented);
	}

}
