package usantatecla.movies.models;

public class MovieBuilder {

	private String title;
	private MovieType movieType;
	
	public MovieBuilder() {
		title = "movieName";
	}
	
	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}
	
	public MovieBuilder childrens() {
		this.movieType = MovieType.CHILDREN;
		return this;
	}
	
	public MovieBuilder regular() {
		this.movieType = MovieType.REGULAR;
		return this;
	}
	
	public MovieBuilder newRelease() {
		this.movieType = MovieType.NEW_RELEASE;
		return this;
	}
	
	public Movie build() {
		return new Movie(this.title, this.movieType);
	}
}
