package usantatecla.movies.models;

public class ChildrenMovie extends Movie {
    
    public ChildrenMovie(String title) {
        super(title, MovieType.CHILDREN);
    }

    public double getCharge(int daysRented) {
		return this.getChargeChildren(daysRented);
	}

    private double getChargeChildren(int daysRented) {
		double result = Movie.CHARGE_CHILDREN;
		if (daysRented > Movie.DAYS_RENTED_THRESHOLD_CHILDREN) {
			result += (daysRented - 1) * Movie.EXTRA_CHARGE_CHILDREN;
		}
		return result;
	}

}
