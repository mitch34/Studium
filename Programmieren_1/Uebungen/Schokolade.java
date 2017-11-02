import java.util.Scanner;

public class Schokolade {
	public static void main ( String [] args) {
		
		// Variablen
		int anzKleineTafelnInKg = 0;
		int anzGrosseTafelnInKg = 0;
		int groessPaketInKg = 0;
		
		//Eingabe der Variablen
		System.out.println("Eingabe von kleine Tafeln in kg:");
		Scanner in = new Scanner(System.in);
		anzKleineTafelnInKg = in.nextInt();
		System.out.println("Eingabe von grossen Tafeln in kg:");
		anzGrosseTafelnInKg = in.nextInt();
		System.out.println("Eingabe von groesse des Pakets in kg:");
		grossePaketInKg = in.nextInt();
	}
}