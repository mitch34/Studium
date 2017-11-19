import java.util.Scanner;

public class Quersumme {
	public static void main ( String [] args) {
		
		// Variablen
		long zahl = 0;
		long tempZahl = 0;
		int quersumme = 0;
		
		System.out.print("Bitte Zahl eingeben:");
		Scanner in = new Scanner(System.in);
		zahl = in.nextLong();
		tempZahl = zahl;
		
		/*
		 * Berechnung fuer die 2er Quersumme
		 * z.B. zahl = 125630703
		 * Die Anweisung: quersumme += zahl%100
		 * bewirkt, das die letzten beiden Zahlen von der
		 * Variable: zahl 03 in die Variable: quersumme gespeichert
		 * wird.
		 * Durch die Anweisung: zahl = zahl / 100
		 * wird 03 von der Variable zahl abgezogen.
		 *
		 * Dies wird solange getan, bis zahl kleiner 0 ist.
		 */
		while ( zahl > 0)
		{
			quersumme += zahl%100;
			zahl = zahl / 100;
			
		}
		System.out.println("\n2er Quersumme:" +quersumme);
		
		/* 
		 * Berechnung fuer die iterierte Quersumme
		 *
		 * Die tempZahl wird solange durch ihre Quersumme
		 * ersetzt, bis das Ergebnis einstellig ist
		 * 
		 * while (tempZahl > 9) 
		 * da bei der Eingabe der tempZahl kleiner
		 * 10 eingegeben sein kann und fuer die Beendigung der 
		 * while-Schleife.
		 *
		 * z.B. zahl = 125630703
		 * Die Anweisung: quersumme += tempZahl%10
		 * bewirkt, das die letzte Zahle von der
		 * Variable: tempZahl 3 in die Variable: quersumme gespeichert
		 * wird.
		 * Durch die Anweisung: zahl = tempZahl / 10
		 * wird 3 von der Variable: tempZahl abgezogen.
		 *
		 * Dies wird solange getan, bis tempZahl kleiner 0 ist,
		 * wird dies erreicht, wird die Variable: quersumme in tempZahl
		 * gespeichert und erneut berechnet.
		 */
		while (tempZahl > 9) 
		{
			// Berechnung der einfachen Quersumme:
			quersumme = 0;
			do {        
				quersumme += tempZahl % 10;
				tempZahl = tempZahl / 10;
				System.out.print(quersumme+ "\n");
			} while (tempZahl > 0);
			tempZahl = quersumme;
		}
		System.out.println("iterierte Quersumme:" +quersumme);
	}
}