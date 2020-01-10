package com.movie.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {
	@Id
	private int movieId;
	private int rating;
	
	public Rating() {
		super();
	}

	public Rating(int movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
