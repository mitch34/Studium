public class Rational {

    // Attribute:
    private int zaehler;
    private int nenner;

    // Konstruktoren:
    public Rational (int x, int y) {
        this.zaehler = x;
        this.nenner = y;
    }
    public Rational (int x) {
        this.zaehler = x;
        this.nenner = 1;
    }

    // Objekt-Methoden:
    public Rational add (Rational r) {
        int x = this.zaehler * r.nenner +r.zaehler * this.nenner;
        int y = this.nenner * r.nenner;
        return new Rational (x,y);
    }
    
    public boolean equals (Rational r) {
        return (this.zaehler * r.nenner == r.zaehler * this.nenner);
    }
    
    public String toString() {
        if (this.nenner == 1) return "" + this.zaehler;
        if (this.nenner > 0) return this.zaehler +"/"+ this.nenner;
        return (-this.zaehler) +"/"+ (-this.nenner);
    }

    public double toDecimal() {
        double z = this.zaehler;
        double n = this.nenner;
        return z/n;
    }

    public Rational inc () {
		 int zaehlerNeu = zaehler + nenner;
        return new Rational (zaehlerNeu,nenner);
    }

    public Rational kehrwert() {
        return new Rational(this.nenner,this.zaehler);
    }

    public Rational mal(Rational r) {
		int zaehler = r.zaehler * this.zaehler;
		int nenner = r.nenner * this.nenner;
        return new Rational (zaehler,nenner);
    }
}  // end of class Rational
