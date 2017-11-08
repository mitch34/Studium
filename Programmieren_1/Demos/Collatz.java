import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
	int start;
	int i = 1;
	int max = 0;
	int laenge = 1;
	Scanner in = new Scanner(System.in);
	//System.out.println("Startwert?");
	//start = in.nextInt();

	while (i <= 10) {
	    start = i;
	    laenge = 0;
	    while (start > 1) {
		if (start%2 == 0) {
		    start = start / 2;
		} else {
		    start = 3*start + 1;
		}
		System.out.print(start + " ");
		laenge++;
	    }
	    System.out.println("\nLaenge ist " + laenge);
	    if (laenge > max) {
		max = laenge;
	    }
	    i++;
	}
	System.out.println("MAXIMUM:" + max);			    
    }
}
