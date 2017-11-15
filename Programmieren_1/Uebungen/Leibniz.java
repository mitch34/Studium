import java.util.Scanner;

public class Leibniz {
	public static void main(String[] args) {
 
    // Variablen
	int n = 0;
	double pi = 0;
	double div = 1;
	
	System.out.print("Bitte natuerliche Zahl n eingeben: ");
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	
	/*
	 * Variable n muss relativ hoch gewaehlt werden,
	 * z.B n = 9999999,
	 * dadurch wird die Annaeherung an Pi/4 genauer,
	 * 
	 * Ist x eine gerade Zahl wird 
	 * pi = pi + (1 / div) berechnet
	 * anderfalls
	 * pi = pi - (1 / div) berechnet
	 * wegen Vorzeichenwechsel 
	 * 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 + 1/17 ... = pi/4
	 */
	for (int x = 0; x < n; x++) 
	{
		if ( x % 2 == 0) 
		{
			pi = pi + (1 / div);
		}
		else
		{
			pi = pi - (1 / div);
		}
		// da Nenner eine ungerade Zahl ist z.B 3, 5, 7 usw.
		div = div + 2;
	}
	// da pi ungefaehr 0.78539816339  ist, muss noch pi * 4 berechnet werden
	pi = pi * 4;
	System.out.println("Die Kreiszahl pi lautet: " +pi);
   }
}