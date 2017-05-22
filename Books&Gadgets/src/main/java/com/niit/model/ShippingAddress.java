package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ShippingAddress 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotEmpty
	private String apartmentname;
	@NotEmpty
	private String streetname;
	@NotEmpty
	private String city;
	@NotEmpty
	private String country;
	@NotEmpty
	private String zipcode;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getApartmentname() 
	{
		return apartmentname;
	}
	public void setApartmentname(String apartmentname) 
	{
		this.apartmentname = apartmentname;
	}
	public String getStreetname() 
	{
		return streetname;
	}
	public void setStreetname(String streetname) 
	{
		this.streetname = streetname;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	public String getZipcode() 
	{
		return zipcode;
	}
	public void setZipcode(String zipcode) 
	{
		this.zipcode = zipcode;
	}
}
