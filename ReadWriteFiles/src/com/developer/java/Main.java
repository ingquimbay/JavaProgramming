package com.developer.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		// An array containing the 20 biggest cities in the world
		List<String> biggestCities = citiesList();

		ReadWriteFilebyElement(biggestCities);
		ReadWriteFilebyObject(biggestCities);

	}

	private static void ReadWriteFilebyObject(List<String> biggestCities) throws ClassNotFoundException {
		try {

			try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("cities2.dat"))) {
				// Write the object array once
				output.writeObject(biggestCities);
				System.out.println("File cities2.dat was created");
			}

			try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("cities2.dat"))) {
				List<String> cities = new ArrayList<>();
				cities = (List<String>) input.readObject();
				System.out.println("Reading object from cities2.dat");
				for (String s : cities) {
					System.out.println(s);
				}
			}

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

	private static void ReadWriteFilebyElement(List<String> biggestCities) {
		try {
			try (DataOutputStream output = new DataOutputStream(new FileOutputStream("cities1.dat"))) {
				// Writing each element one-by-one
				for (String s : biggestCities) {
					output.writeUTF(s);
				}
				System.out.println("File cities1.dat was created");
			}

			try (DataInputStream input = new DataInputStream(new FileInputStream("cities1.dat"))) {
				// Reading each line in the file
				System.out.println("Reading cities1.dat file");
				while (true) {
					System.out.println(input.readUTF());
				}
			}

		} catch (EOFException ex) {
			// End Of File exception
			System.out.println("\nAll data from file were read.\n");

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

	private static List<String> citiesList() {
		List<String> biggestCities = new ArrayList<>();
		biggestCities.add("Chongqing, China");
		biggestCities.add("Shanghai, China");
		biggestCities.add("Beijing, China");
		biggestCities.add("Lagos, Nigeria");
		biggestCities.add("Dhaka, Bangladesh");
		biggestCities.add("Mumbai, India");
		biggestCities.add("Chengdu, China");
		biggestCities.add("Karachi, Pakistan");
		biggestCities.add("Guangzhou, China");
		biggestCities.add("Istanbul, Turkey");
		biggestCities.add("Tokyo, Japan");
		biggestCities.add("Tianjin, China");
		biggestCities.add("Moscow, Russia");
		biggestCities.add("Sao Paulo, Brazil");
		biggestCities.add("Kinshasa, DR Congo");
		biggestCities.add("Delhi, India");
		biggestCities.add("Baoding, China");
		biggestCities.add("Lahore, Pakistan");
		biggestCities.add("Wuhan, China");
		biggestCities.add("Cairo, Egypt");
		return biggestCities;
	}

}