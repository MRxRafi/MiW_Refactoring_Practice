package usantatecla.movies.models;

public class ChildrenMovie extends Movie {
    
    public ChildrenMovie(String title) {
        super(title, MovieType.CHILDREN);
    }

    public double getCharge(int daysRented) {
		return this.getChargeChildren(daysRented);
	}

}
