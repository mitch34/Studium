public class Quadrat {

    // Objekt-Attribute
	private double xKoordinate;
	private double yKoordinate;
	private double laenge;

    // Konstruktor
    // wird dem Konstruktor eine ungueltige Eingabe gegeben,
    // soll ein Quadrat (0,0,1) gebaut werden
    public Quadrat(double x1, double y1, double l) { 
		xKoordinate = x1;
		yKoordinate = y1;
		laenge = l;
	}

    
    
    // Zeichenmethode

    public void zeichne( ) {
		StdDraw.line(xKoordinate,yKoordinate,xKoordinate,yKoordinate + laenge);
		StdDraw.line(xKoordinate,yKoordinate,xKoordinate + laenge,yKoordinate);
		StdDraw.line(xKoordinate + laenge,yKoordinate + laenge,xKoordinate + laenge,yKoordinate);
		StdDraw.line(xKoordinate + laenge,yKoordinate + laenge,(xKoordinate + laenge) - laenge,yKoordinate + laenge);
    }

}
