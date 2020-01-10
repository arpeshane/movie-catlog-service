package com.movie.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieInfo {
	@Id
	private int movieId;
	private String name;
	
	public MovieInfo() {
		super();
	}
	public MovieInfo(int id, String name) {
		super();
		this.movieId = id;
		this.name = name;
	}
	public int getId() {
		return movieId;
	}
	public void setId(int id) {
		this.movieId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MovieInfo [movieId=" + movieId + ", name=" + name + "]";
	}
	
}
