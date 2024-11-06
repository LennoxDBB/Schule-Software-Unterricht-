package main;

import fahrzeuge.Landfahrzeug;

public class Main {

	private static Landfahrzeug landfahrzeug;
	
	public static void main(String[] args) {
		
		landfahrzeug = new Landfahrzeug("BB-JK-1967", 2012);
		
		System.out.println(landfahrzeug.getAnzahlRaeder());
	}
	
}
