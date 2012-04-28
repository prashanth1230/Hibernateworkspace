package com.banu.hibernate;

import java.util.Date;

public class Book {
	int id;

	String title;

	String artist;

	Date purchaseDate;

	double cost;

	Book() {

	}

	Book(String title, String artist, Date purchaseDate, double cost) {

		this.title = title;
		this.artist = artist;
		this.purchaseDate = purchaseDate;
		this.cost = cost;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
