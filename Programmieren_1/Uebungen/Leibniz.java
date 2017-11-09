import java.util.Scanner;

public class Leibniz {
	public static void main(String[] args) {
 
    // Variablen
	int n = 0;
	double pi = 0;
	
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	
	/*
	for (int x = 0; x < n; x++) {
		int div = 2 * x +1;
		if ( x % 2 == 0) 
		{
			pi = pi + (1 / div);
		}
		else
		{
			pi = pi - (1 / div);
		}
	}
	// pi = pi * 4;
	System.out.println(pi);
	*/
	double denominator = 1;
	for (int x = 0; x < n; x++) {
 
         if (x % 2 == 0) {
            pi = pi + (1 / denominator);
         } else {
            pi = pi - (1 / denominator);
         }
         denominator = denominator + 2;
      }
     // pi = pi * 4;
      System.out.println(pi);
   }
}