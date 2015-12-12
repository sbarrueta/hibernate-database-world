package com.tresct.world.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	@Column(name="District")
	private String district;
	@Column(name="Population")
	private Integer population;
	
	
	
	@ManyToOne
	@JoinColumn(name="CountryCode")
	private Country country; 	
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(Integer id, String name, String district, Integer population) {
		super();
		this.id = id;
		this.name = name;
		this.district = district;
		this.population = population;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
}
