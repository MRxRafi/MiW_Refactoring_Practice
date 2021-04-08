package usantatecla.movies.models;

public class Movie {

	private String title;
	
	private Price price;
	
	public Movie(String title, Price price) {
		this.title = title;
		this.price = price;
	}
	
	public double getCharge(int daysRented) {
		if(this.price instanceof RegularPrice) {
			return price.getChargeRegular(daysRented);
		}
		else if(this.price instanceof NewReleasePrice) {
			return price.getChargeNewReleases(daysRented);
		}
		else {
			return price.getChargeChildren(daysRented);
		}
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		if(this.price instanceof NewReleasePrice) {
			return price.getFrequentRenterPointsNewReleases(daysRented);
		}
		else {
			return price.getFrequentRenterPoints(daysRented);
		}
	}
	
	public void setPrice(Price price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
}
