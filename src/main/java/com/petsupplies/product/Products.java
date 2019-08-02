package com.petsupplies.product;

import org.springframework.data.annotation.Id;

public class Products {
	
	@Id
	private String id;
	private String name;
	private String description;
	private int price;
	
	private Categories categories;
	
	public Products(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
		
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
