package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String manufacturer;
	private double price;
	private int unitInStock;
	private String description;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getManufacturer() 
	{
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) 
	{
		this.manufacturer = manufacturer;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getUnitInStock() 
	{
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) 
	{
		this.unitInStock = unitInStock;
	}
}
