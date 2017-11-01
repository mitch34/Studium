import java.util.Scanner;

public class Pechkeks {
	public static void main ( String [] args) {
		
		// Variablen
		int n = 0;
		
		System.out.println("Geben Sie eine ganze Zahl ein:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		// Ausgabe: n mit !
		
		if ( n % 3 == 0)
		{
			System.out.println("Pech!");
		}
		if ( n % 5 == 0)
		{
			System.out.println("Keks!");
		}
		
		System.out.println("Ausgabe von n:" + n +"!");
	}
}