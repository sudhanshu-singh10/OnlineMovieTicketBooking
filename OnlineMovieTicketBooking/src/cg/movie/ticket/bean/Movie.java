package cg.movie.ticket.bean;

public class Movie {
	Integer movieId;
	String movieName;
	Show movieGenre;
	String movieDirector;
    String movieLength;
	String languages;
	String movieReleaseDate;
	
	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(String movieLength) {
		this.movieLength = movieLength;
	}

	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public Movie(Integer movieId, String movieName, String movieLength, String languages, String movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}


}
