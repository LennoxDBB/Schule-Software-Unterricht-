package polymorphie;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// KEINE INSTANZIIERUNG!!!
		Fahrzeug mein_Fahrzeug_array[] = new Fahrzeug[10];
		
		// https://mein-javablog.de/java-polymorphie-moeglichkeiten/
		// https://mein-javablog.de/java-polymorphie-arrays/
		
		Random random = new Random();
		
		int number;
		
		for(int i = 0; i < 10; i++) {
			number = random.nextInt(0, 3);
			
			switch(number) {
			case 0:
				mein_Fahrzeug_array[i] = new Landfahrzeug();
				break;
			case 1:
				mein_Fahrzeug_array[i] = new Wasserf_Motorboot();
				break;
			case 2:
				mein_Fahrzeug_array[i] = new Wasserf_Segelboot();
				break;
			}
			
			mein_Fahrzeug_array[i].info();
			
			if(mein_Fahrzeug_array[i] instanceof Wasserf_Motorboot) {
				int tankNumber = random.nextInt(0, 101);
				System.out.print("--> ");
				((Wasserf_Motorboot) mein_Fahrzeug_array[i]).gibTankStatus(tankNumber);
			} else if(mein_Fahrzeug_array[i] instanceof Wasserf_Segelboot) {
				int segelNumber = random.nextInt(1, 4);
				System.out.print("--> ");
				((Wasserf_Segelboot) mein_Fahrzeug_array[i]).gibAnzahlSegel(segelNumber);
			} else {
				System.out.println("--> Ich habe nichts Spezielles!");
			}
			
			System.out.println();
		}
		
	} // end main
} // end class
