import java.util.Scanner;

public class Pechkeks {
	public static void main ( String [] args) {
		
		// Variablen
		int n = 0;
		
		System.out.println("Geben Sie eine ganze Zahl ein:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		// Ausgabe: n mit !
		
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