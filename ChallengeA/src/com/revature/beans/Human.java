package com.revature.beans;

public class Human {
	private String name;
	private String city;
	private double weight; 
	private double height;
	
	public Human() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [Name=" + name + ", City=" + city + ", Weight=" + weight + ", Height=" + height + "]";
	}

	
	
	
}
