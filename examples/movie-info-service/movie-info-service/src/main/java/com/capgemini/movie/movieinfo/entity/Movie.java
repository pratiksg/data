package com.capgemini.movie.movieinfo.entity;

public class Movie {
	private int movieId;
	private String movieTitle;
	private String movieDescription;
	public Movie(int movieId, String movieTitle, String movieDescription) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.movieDescription = movieDescription;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	
	

}
