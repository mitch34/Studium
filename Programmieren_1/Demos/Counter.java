import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        int b0 = 0;
		int b1 = 0;
		int b2 = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Bit 0 eingeben!");
		b0 = in.nextInt();
    	System.out.println("Bit 1 eingeben!");
		b1 = in.nextInt();
		System.out.println("Bit 2 eingeben!");
		b2 = in.nextInt();
		if (b0 == 0) {
			b0 = 1;
		} 
		else 
		{
			b0 = 0;
			if (b1 == 0) {
				b1 = 1;
			} else {
				b1 = 0;
				b2 = 1 - b2;
			}
		}
		System.out.print("Ergebnis:");
		System.out.print(b2);
		System.out.print(b1);
		System.out.print(b0);
	}
}
