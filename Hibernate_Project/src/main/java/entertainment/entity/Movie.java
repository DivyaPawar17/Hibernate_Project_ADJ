package entertainment.entity;

public class Movie {

	private Integer movieId;
	private String title;
	private String genre;
	private int year;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(Integer movieId, String title, String genre, int year) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.year = year;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", year=" + year + "]";
	}

}
