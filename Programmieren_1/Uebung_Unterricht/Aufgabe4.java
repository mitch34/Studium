import java.util.Scanner;

public class Aufgabe4 {
	public static void main ( String [] args) {
		
		int n = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for (int i = 2; i <= 2 * n;i = i + 2)
			System.out.println(i * i);
	}
}