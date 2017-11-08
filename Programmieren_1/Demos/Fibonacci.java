import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
	int fib = 0;
	Scanner in = new Scanner(System.in);
	System.out.print("Wievielte Fibonacci Zahl?");
	fib = in.nextInt();

	if (fib == 1) {
	     System.out.println("1");
	}
	if (fib > 1) {
	     System.out.println("1\n1");
	}
	
	int alt = 1;
	int neu = 1;
	for (int i = 2; i < fib; i++) {
	    neu = alt + neu;
	    alt = neu - alt; 
	    System.out.println(neu);
	}
	
    }
}
