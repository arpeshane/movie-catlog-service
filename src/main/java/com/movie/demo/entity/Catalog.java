package com.movie.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catalog {
	@Id
	private int id;
	private String name;
	private String desc;
	private int rating;
	
	
	public Catalog() {
		super();
	}
	public Catalog(int id, String name, String desc, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	
}
