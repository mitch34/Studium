public class Bruch {

    public static int kgv(int a, int b) {
		int ergebnis = 0;
		int ergebnisGGT = 0;
		if (a == 0 && b == 0)
			ergebnis = 0;
		ergebnisGGT = ggt(a, b);
		ergebnis = (a * b) / ergebnisGGT;
		
	return ergebnis;
    }

    public static void kuerzen(int zaehler, int nenner) {
		if (zaehler % nenner == 0)
		{
			System.out.print(zaehler/nenner+"\n");
		}
		else
		{
		int ergebnisGGT = ggt(zaehler, nenner);
		zaehler /= ergebnisGGT;
		nenner /= ergebnisGGT;
		System.out.print(zaehler+"/"+nenner+"\n");
		}
    }

    public static void bruchsumme(int zaehler1, int nenner1, int zaehler2, int nenner2) {
		int Hauptnenner = nenner1 * nenner2;
		int zwischenErgebnisZaehler1 = Hauptnenner / nenner1;
		int zwischenErgebnisZaehler2 = Hauptnenner / nenner2;
		int zaehlerNeu = (zaehler1 * zwischenErgebnisZaehler1) + (zaehler2 * zwischenErgebnisZaehler2);
		
		kuerzen(zaehlerNeu,Hauptnenner);
    }

    public static boolean hat7(int n) {
		boolean gefunden = false;
		int zahl = 0;
		while ( n > 0)
		{
			zahl = 0;
			zahl = n % 10;
			n /= 10;
			if (zahl == 7)
				gefunden = true;
		}
		
	return gefunden;
    }

    public static double wallis (int anzahlFaktoren) {
		double ergebnis = 1;
		for (double k = 2; k <= anzahlFaktoren; k += 2)
		{
			ergebnis *=  ((k) / (k - 1)) * ((k) / (k + 1));
		}
		ergebnis *= 2; 
	return ergebnis;
    }

    public static int ggt(int a, int b) {
	while (a != b) {
	    if (a > b) {
		a = a - b;
	    } else {
		b = b - a;
	    }
	}
	return a;
    }

    public static void main(String[] args) {
	System.out.println(kgv(48,30));
	System.out.println(kgv(17,51));
	System.out.println(kgv(11,11));
	System.out.println("\n");
	kuerzen(121,11);
	kuerzen(12,72);
	kuerzen(34,51);
	System.out.println("\n");
	bruchsumme(1,2,1,3);
	bruchsumme(2,17,3,15);
	bruchsumme(12,3,57,19);
	System.out.println("\n");
	System.out.println(hat7(4711));
	System.out.println(hat7(70011));
	System.out.println(hat7(411411));
	System.out.println("\n");
	System.out.println("Wallis (1000 Faktoren)    " + wallis(1000));
	System.out.println("Wallis (1000000 Faktoren) " + wallis(1000000));
    }
}
