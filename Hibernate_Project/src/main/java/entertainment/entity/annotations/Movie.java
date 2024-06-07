package entertainment.entity.annotations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity  //Make this class as an Entity
@Table (name ="Movie_Master_Details")
public class Movie {
	@Id //Marks this field as an identity  --->Field level
	@Column(name = "movie_id")
	private Integer movieId;
	
	@Column(name = "movie_title")
	private String title;
	
	@Column(name = "movie_genre")
	private String genre;
	
	@Column(name = "movie_year")
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
