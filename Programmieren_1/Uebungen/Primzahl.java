import java.util.Scanner;

public class Primzahl
{
	public static void main (String [] args)
	{
		
	   int zahl = 0;
		
	   System.out.println("Bitte geben Sie ein Zahl ein:");
	   Scanner in = new Scanner(System.in);
	   zahl = in.nextInt();
		
	   if ( zahl < 8)
		{
			System.out.println("Spinner");
		}
		else
		{
			if ( zahl > 100)
			{
				System.out.println("Zu schwer");
			}
			else
			{
				if ( zahl % 2 == 0 || zahl % 3 == 0 || zahl % 5 == 0 || zahl % 7 == 0)
				{
					System.out.println("Niete");
				}
				else
				{
					System.out.println("Primzahl");
				}
			}
		}
		
	}
}