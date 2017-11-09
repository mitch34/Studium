import java.util.Scanner;

public class Collatz2 {
	public static void main ( String [] args ) {
		
		// Variablen
		int n = 0;
		int laenge = 1;
		int start = 0;
		int i = 1;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		while (i <= n) {
			start = i;
			laenge = 0;
			while (start > 1) {
				if (start%2 == 0)
				{
					start = start / 2;
				}
				else
				{
					start = 3 * start + 1;
				}
				System.out.print(start + " ");
				laenge++;
			}
		System.out.println("\nLaenge ist " + laenge);
		if (laenge == n)
			break;
		i++;
		}
	}
}