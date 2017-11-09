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
		 * nur true oder false Eingabe f�r die 
		 * Variablen x und y.
		 * Konsoleneingabe: z.B true oder false f�r x und y
		 */
		System.out.println("Wert f�r x eingeben:");
		Scanner in = new Scanner(System.in);
		x = in.nextBoolean();
		System.out.println("Wert f�r y eingeben:");
		y = in.nextBoolean();
		
		/*
		 * �berpr�fen der Variablen: x, y
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
