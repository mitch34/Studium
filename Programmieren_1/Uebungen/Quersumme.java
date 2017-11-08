import java.util.Scanner;

public class Quersumme {
	public static void main ( String [] args) {
		
		long n = 0;
		long quersumme = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextLong();
		
		while ( n > 0)
		{
			quersumme += n%100;
			n = n / 100;
			System.out.println("n:" +n);
		}
		System.out.println("Quersumme:" +quersumme);
	}
}