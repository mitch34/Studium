import java.util.Scanner;

public class Max {
   public static void main ( String [] args)
   {
	   // Variablen
	   int x = 0;
	   int y = 0;
	   
	   System.out.println("Wert f�r x eingeben:");
	   Scanner in = new Scanner(System.in);
	   x = in.nextInt();
	   System.out.println("Wert f�r y eingebebn:");
	   y = in.nextInt();
	   
	   if ( x < 0 && y < 0)
	   {
		   System.out.println("Ergebnis: 0");
	   }
	   else
	   {
		   if ( x < y)
		   {
			   System.out.println("Das Maximum von x=" + x + " und y=" + y + " ist y=" + y);
		   }
		   else
		   {
			   System.out.println("Das Maximum von x=" + x + " und y=" + y + " ist x=" + x);
		   }
	   }
   }
   
}
