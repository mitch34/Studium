import java.util.Scanner;

public class Leibniz {
	public static void main(String[] args) {
 
    // Variablen
	int n = 0;
	double pi = 0;
	double div = 1;
	
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	
	
	for (int x = 0; x < n; x++) {
		
		//System.out.println("divrunde:" + x + "Ausgabe:" +div);
		if ( x % 2 == 0) 
		{
			pi = pi + (1 / div);
			//System.out.println("divrundeGerade:" + x + "Ausgabe:" +pi);
		}
		else
		{
			pi = pi - (1 / div);
			//System.out.println("divrundeUnGerade:" + x + "Ausgabe:" +pi);
		}
		div = div + 2;
	}
	 pi = pi * 4;
	System.out.println(pi);
   }
}