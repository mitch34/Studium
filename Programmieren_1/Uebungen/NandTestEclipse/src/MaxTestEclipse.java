import java.util.Scanner;

public class MaxTestEclipse {
   public static void main ( String [] args)
   {
	   int x = 0;
	   int y = 0;
	   
	   System.out.println("Wert für x eingeben:");
	   Scanner in = new Scanner(System.in);
	   x = in.nextInt();
	   System.out.println("Wert für y eingebebn:");
	   y = in.nextInt();
	   
	   if ( x < 0 && y < 0)
	   {
		   System.out.println("Ergebnis: 0");
	   }
	   else
	   {
		   if ( x < y)
		   {
			   System.out.println("Testy:" + y);
		   }
		   else
		   {
			   System.out.println("Testx:" + x);
		   }
	   }
   }
   
}
