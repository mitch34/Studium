import java.util.Scanner;

public class Max {
   public static void main ( String [] args)
   {
	   // Variablen
	   int x = 0;
	   int y = 0;
	   
	   //  Eingabe der Variablen von x und y
	   System.out.println("Wert für x eingeben:");
	   Scanner in = new Scanner(System.in);
	   x = in.nextInt();
	   System.out.println("Wert für y eingebebn:");
	   y = in.nextInt();
	   
	   /*
	    * Überprüfen der Variable: x, y
		* x < 0 und y < 0, Ausgabe: "Ergebnis: 0"
		*
		* sonst, prüfe die Variablen: x, y
		* ist x < y , Ausgabe: "Das Maximum von x und y ist y",
		* anderfalls, Ausgabe: "Das Maximum von x und y ist x".
		*/
	   if ( x < 0 && y < 0)
	   {
		   System.out.println("Ergebnis: 0");
	   }
	   else
	   {
		   if ( x < y)
		   {
			   System.out.println("Das Maximum von x=" + x + " und y=" + y + " ist y=" + y);
		   }
		   else
		   {
			   System.out.println("Das Maximum von x=" + x + " und y=" + y + " ist x=" + x);
		   }
	   }
   }
   
}
