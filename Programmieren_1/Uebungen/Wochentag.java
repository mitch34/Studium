import java.util.Scanner;

public class Wochentag {

    public static void main(String[] args) {
        int tag = 1;
        int monat = 1;
        int jahr = 1;
        int verschiebung = 0;
        int ergebnis = 0;
        
        // Der 1. Januar 1900 war ein Montag
        Scanner in = new Scanner(System.in);
        System.out.println("Tag?");
        tag = in.nextInt();
        System.out.println("Monat?");
        monat = in.nextInt();
        System.out.println("Jahr?");
        jahr = in.nextInt();

     
        verschiebung = (jahr-1900) + (jahr-1900)/4 + (tag-1);

        if (monat > 1) {
	    verschiebung = verschiebung + 31;
        }
        if (monat > 2) {
	    verschiebung = verschiebung + 28;
        }
        if (monat > 3) {
	    verschiebung = verschiebung + 31;
        }
        if (monat > 4) {
	    verschiebung = verschiebung + 30;
        }
        if (monat > 5) {
	    verschiebung = verschiebung + 31;
        }
        if (monat > 6) {
	    verschiebung = verschiebung + 30;
        }
        if (monat > 7) {
	    verschiebung = verschiebung + 31;
        }
        if (monat > 8) {
	    verschiebung = verschiebung + 31;
        }
        if (monat > 9) {
	    verschiebung = verschiebung + 30;
        }
        if (monat > 10) {
	    verschiebung = verschiebung + 31;
        }
        if (monat > 11) {
	    verschiebung = verschiebung + 30;
        }
		
		// 1. Schaltjahrausgabe:alsaa Schaltjahr!
		if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0))
			System.out.println("Schaltjahr!");
		
		
        /* Bei Januar oder Februar im Schaltjahr wieder
           wieder 1 abziehen */

        if  ( ((monat==1) || (monat==2)) && (jahr % 4 == 0)) {
            verschiebung = verschiebung - 1;
	}    
        ergebnis = verschiebung % 7;
        
        if (ergebnis==0) {
	    System.out.println("Montag");
	} 
        if (ergebnis==1) {
	    System.out.println("Dienstag");
	} 
        if (ergebnis==2) {
	    System.out.println("Mittwoch");
	} 
        if (ergebnis==3) {
	    System.out.println("Donnerstag");
	} 
        if (ergebnis==4) {
	    System.out.println("Freitag");
	} 
        if (ergebnis==5) {
	    System.out.println("Samstag");
	} 
        if (ergebnis==6) {
	    System.out.println("Sonntag");
		
		// 2. zusätzlich als Augabe: Sonntagskinder!
		System.out.println("Sonntagskind!");
	} 

    }
}
