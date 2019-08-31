package com.developer.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.developer.entity.Country;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		
		// Create list of countries
		List<Country> countries = new ArrayList<Country>();
		File jsonFile = new File("countries.json");

		// Initialize object mapper and configure to ignore unused attributes
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		try {
			countries = Arrays.asList(mapper.readValue(jsonFile, Country[].class));
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
		
		printCountriesArray(countries);
	}

	private static void printCountriesArray(List<Country> countries) {
		for (Country c : countries) {
			System.out.println(c);
		}
	}

}
