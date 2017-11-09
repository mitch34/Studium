import java.util.Scanner;

public class Nand {
	public static void main ( String [] args)
	{
		// Variablen
		boolean x = false;
		boolean y = false;
		boolean ergebnis = false;
		
		/* 
		 * Eingabe der Variablen
		 * nur true oder false Eingabe für die 
		 * Variablen x und y.
		 * Konsoleneingabe: z.B true oder false für x und y
		 */
		System.out.println("Wert für x eingeben:");
		Scanner in = new Scanner(System.in);
		x = in.nextBoolean();
		System.out.println("Wert für y eingeben:");
		y = in.nextBoolean();
		
		/*
		 * Überprüfen der Variablen: x, y
		 * Ist x = true und y = true. Ergebnis = false,
		 * wegen Negationsoperator ! ,
		 * sonst Ergebnis = true.
		 * Wertetabelle von NAND:
		 * -----------------
		 * NAND | 0  1
		 * -----|------
		 *   o  | 1  1
		 *   1  | 1  0
		 */
		ergebnis = !(x && y);
		
		System.out.println("Ergebnis: " + ergebnis);
		
	}
	

}
