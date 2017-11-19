import java.util.Scanner;

public class Aufgabe3 {
	public static void main ( String [] args) {
		
		int n = 0;
		int k = 1;
		int l = 0;
		System.out.print("Eingabe Zahl:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		l = in.nextInt();
		/*
		while (i < n) {
			ergebnis = 
			
				System.out.print(i + " ");
			
		i++;
		}
		*/
		System.out.println("For-Schleife");
		for (int i = 1; i < 2 * n; i = i + 2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nwhile-Schleife");
		while (k < 2 * l) {
			System.out.print(k + " ");
			k = k + 2;
		}
	} 
}