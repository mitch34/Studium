import java.util.Scanner;

public class Siebzehn
{
   public static void main(String [] args)
   {
      // Variablen	
	  int zahl;
	  int Restwert;
	   
	  System.out.println("Bitte geben Sie eine Zahl ein die durch 17 dividiert wird:");
	   
	  // Eingabe von Zahlen 
	  Scanner in = new Scanner(System.in);
	  zahl = in.nextInt();
	
	  // Restwertberechnung
	  Restwert = zahl % 17; 
	
	  // Ausgabe vom Restwert
	  System.out.println("Bei der Division von 17 betraegt der Rest: "+Restwert);
	
	  // Restwert = 13, Ausgabe: "Pechkeks." sonst Keine Ausgabe
	  if (zahl % 17 == 13)
	     System.out.println("Pechkeks.");
	}
}