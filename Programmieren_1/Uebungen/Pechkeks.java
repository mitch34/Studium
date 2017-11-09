import java.util.Scanner;

public class Pechkeks {
	public static void main ( String [] args) {
		
		// Variablen
		int n = 0;
		
		// Eingabe der Variable n
		System.out.println("Geben Sie eine ganze Zahl ein:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		/* 
		 * Überprüfen der Variable: n
		 * n % 3 == 0 und n % 5 == 0, Ausgabe: "PechKeks!"
		 * z.B. n = 15, Ausgabe: "PechKeks!"
		 *
		 * sonst, prüfe 
		 * n % 5 == 0, Ausgabe: "Keks!"
		 * z.B. n = 25, Ausgabe: "Keks!"
		 *
		 * sonst, prüfe
		 * n % 3 == 0, Ausgabe: "Pech!"
		 * z.B. n = 6, Ausgabe: "Pech!"
		 *
		 * anderfalls, Ausgabe: "n!"
		 * z.B. n = 13, Ausgabe: "Ausgabe von n:13!"
		 */
		
		if ( n % 3 == 0 && n % 5 == 0)
		{
			System.out.println("PechKeks!");
		}
		else
		{
			if ( n % 5 == 0)
			{
				System.out.println("Keks!");
			}
			else
			{
				if ( n % 3 == 0 )
				{
					System.out.println("Pech!");
				}
				else
				{
					System.out.println("Ausgabe von n:" + n +"!");
				}
			}
		}
		
		
		
	}
}