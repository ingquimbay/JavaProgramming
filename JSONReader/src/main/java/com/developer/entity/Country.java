package com.developer.entity;

import java.util.List;

public class Country {

	private String name;
	private String capital;
	private String region;
	private String subregion;
	private int population;
	private String flag;
	private List<Currency> currencies;
	private List<Language> languages;
	
	public Country() {
		super();
	}

	public Country(String name, String capital, String region, String subregion, int population, String flag,
			List<Currency> currencies, List<Language> languages) {
		this.name = name;
		this.capital = capital;
		this.region = region;
		this.subregion = subregion;
		this.population = population;
		this.flag = flag;
		this.currencies = currencies;
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", region=" + region + ", subregion=" + subregion
				+ ", population=" + population + ", flag=" + flag + ", currencies=" + currencies + ", languages="
				+ languages + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	
}
