import java.util.Scanner;

public class Schokolade {
	public static void main ( String [] args) {
		
		// Variablen
		int anzKleineTafelnInKg = 0;
		int anzGrosseTafelnInKg = 0;
		int groessePaketInKg = 0;
		
		//Eingabe der Variablen
		System.out.println("Eingabe von kleine Tafeln (je 1kg) in kg:");
		Scanner in = new Scanner(System.in);
		anzKleineTafelnInKg = in.nextInt();
		System.out.println("Eingabe von grossen Tafeln (je 5kg) in kg:");
		anzGrosseTafelnInKg = in.nextInt();
		System.out.println("Eingabe von groesse des Pakets in kg:");
		groessePaketInKg = in.nextInt();
		
		int temp = 7 % 1;
		System.out.println(temp);
	}
}