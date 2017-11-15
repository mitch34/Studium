import java.util.Scanner;

public class Collatz2 {
	public static void main ( String [] args ) {
		
		// Variablen
		int n = 0;
		int laenge = 1;
		int start = 0;
		int i = 1;
		boolean flag = true;
		System.out.print("Eingabe der Laenge fuer die erste Collatz Folge, die sucht wird:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		while (i <= 1000 && flag) {
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
		System.out.println("\nLaenge ist " + laenge + "\n");
		if (laenge == n)
			flag = false;
		i++;
		}
	}
}