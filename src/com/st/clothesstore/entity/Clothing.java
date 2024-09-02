package com.st.clothesstore.entity;

public class Clothing {
	private int id;
	private String name;
	private String size;
	private double price;

	public Clothing(int id, String name, String size, double price) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
	}

	// Getters and Setters

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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}