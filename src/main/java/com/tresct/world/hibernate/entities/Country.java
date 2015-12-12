package com.tresct.world.hibernate.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	
	@Id
	@Column(name="Code")
	private String code;
	@Column(name="Name")
	private String name;
	@Column(name="Continent")
	private String continent;
	@Column(name="Region")
	private String region;
	@Column(name="SurfaceArea")
	private Float surfaceArea;
	@Column(name="IndepYear")
	private Integer indepYear;
	@Column(name="Population")
	private Integer population;
	@Column(name="LifeExpectancy")
	private Float lifeExpectancy;
	@Column(name="GNP")
	private Float gnp;
	@Column(name="GNPOld")
	private Float gnpOld;
	@Column(name="LocalName")
	private String localName;
	@Column(name="GovernmentForm")
	private String governmentForm;
	@Column(name="HeadOfState")
	private String headOfState;
	@Column(name="Capital")
	private Integer capital;
	@Column(name="Code2")
	private String code2;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	




	public Country(String code, String name, String continent, String region, Float surfaceArea, Integer indepYear,
			Integer population, Float lifeExpectancy, Float gnp, Float gnpOld, String localName, String governmentForm,
			String headOfState, Integer capital, String code2, Collection<City> ciudades) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.surfaceArea = surfaceArea;
		this.indepYear = indepYear;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
		this.gnp = gnp;
		this.gnpOld = gnpOld;
		this.localName = localName;
		this.governmentForm = governmentForm;
		this.headOfState = headOfState;
		this.capital = capital;
		this.code2 = code2;
		this.ciudades = ciudades;
	}








	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Float getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(Float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public Integer getIndepYear() {
		return indepYear;
	}
	public void setIndepYear(Integer indepYear) {
		this.indepYear = indepYear;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Float getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(Float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public Float getGnp() {
		return gnp;
	}
	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}
	public Float getGnpOld() {
		return gnpOld;
	}
	public void setGnpOld(Float gnpOld) {
		this.gnpOld = gnpOld;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}


	public String getHeadOfState() {
		return headOfState;
	}
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	public Integer getCapital() {
		return capital;
	}
	public void setCapital(Integer capital) {
		this.capital = capital;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}


	
	
	
	
	




	public String getGovernmentForm() {
		return governmentForm;
	}








	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}








	public Collection<City> getCiudades() {
		return ciudades;
	}
	public void setCiudades(Collection<City> ciudades) {
		this.ciudades = ciudades;
	}




	@OneToMany(mappedBy="country")
	private Collection<City> ciudades = new ArrayList<City>();	
	
	
}
