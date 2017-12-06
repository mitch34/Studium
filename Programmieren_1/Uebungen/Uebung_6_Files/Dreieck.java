public class Dreieck {
    private int seiteA, seiteB, seiteC;

    Dreieck (int a, int b, int c) { // Konstruktor 
      // negative Zahlen und Laenge 0 ist hier ok
      // wird aber durch istDreieck abgefangen
	  seiteA = a;
	  seiteB = b;
	  seiteC = c;
	}
    public String toString() {
        // Beispielausgabe: "DREIECK(1,3,3)"
        return "Dreieck:";
    }
  
    public boolean istDreieck () {
        int max = Math.max(Math.max(seiteA, seiteB), seiteC); 
        return seiteA > 0 && seiteB > 0 && seiteC > 0 &&
            (max < seiteA + seiteB + seiteC - max); 
    }
    
    public boolean rechtwinklig() {
        return false;
    } 

    public boolean gleichseitig() {
		boolean gleich = false;
		if(seiteA == seiteB && seiteB == seiteC)
			gleich = true;
        return gleich;
    }
    
    public boolean gleichschenklig() {
        return false;
    }

    public void zeichne () { }
}
