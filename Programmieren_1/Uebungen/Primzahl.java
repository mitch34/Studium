import java.util.Scanner;

public class Primzahl
{
   public static void main (String [] args)
   {
      // Variablen	
	  int zahl = 0;
		
	  System.out.println("Bitte geben Sie ein Zahl ein:");
	  
	  // Eingabe von Zahlen
	  Scanner in = new Scanner(System.in);
	  zahl = in.nextInt();
	  
      /*
	   * Überprüfen der Variable: zahl,
	   * zahl < 8, Ausgabe: "Spinner". Abbruch der If-Verzweigung
	   * zahl > 100, Ausgabe: "Zu schwer". Abbruch der If-Verzweigung
	   *
	   * sonst, überprüfen der Variable: zahl 
	   * Ist zahl durch 2, 3, 5, 7 teilbar ohne Rest, dann Ausgabe: "Niete"
	   * andersfall ist die Variable: zahl , eine Primzahl. Ausgabe: "Primzahl"
	   */
	  if ( zahl < 8)
	  {
	     System.out.println("Spinner");
	  }
	  else
	  {
		if ( zahl > 100)
		{
			System.out.println("Zu schwer");
		}
		else
		{
			if ( zahl % 2 == 0 || zahl % 3 == 0 || zahl % 5 == 0 || zahl % 7 == 0)
			{
				System.out.println("Niete");
			}
			else
			{
				System.out.println("Primzahl");
			}
		}
	  }
		
	}
}