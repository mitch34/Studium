import java.util.Scanner;

public class Primzahltest{
	public static void main ( String [] args)
	{
		int zahl = 0;
		System.out.println("Eingabe:");
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
					System.out.println("Niete_2");
				}
				else
				{
					System.out.println("Primzahl");
				}
			}
		}
	}
}