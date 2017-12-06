public class Konto {

    // Attribut
	private double kontostand;
    // Zwei Konstruktoren
    public Konto () {  }
    public Konto (double summe) {
		kontostand = summe;
	}


    // Objektmethoden
    public void einzahlen (double summe) { 
		kontostand += summe;
	}
    
    public void abheben (double summe) {
			kontostand -= summe;
			if(kontostand < 0)
				kontostand -= 5.0;
	}

    public double abfragen() { 
		return kontostand; 
	} 

}
