import java.util.Scanner;

public class Ternaer {
	public static void main (String [] args) {
		
		// Variablen
		int n = 0;
		
		System.out.println("Eingabe von n:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
	System.out.println((n&1) == 0 ? ("17") : ("23"));
	}
}