import java.util.Scanner;

public class NandTestEclipse {
	public static void main ( String [] args)
	{
		boolean x = false;
		boolean y = false;
		boolean ergebnis = false;
		
		System.out.println("Wert f�r x eingeben:");
		Scanner in = new Scanner(System.in);
		x = in.nextBoolean();
		System.out.println("Wert f�r y eingeben:");
		y = in.nextBoolean();
		
		ergebnis = !(x & y);
		
		System.out.println("Ergebnis " + ergebnis);
		
	}
	

}
