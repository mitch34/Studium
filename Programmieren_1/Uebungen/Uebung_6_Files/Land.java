public class Land {

    // Attribute
    private String land;
	private long einwohner;
	private int flaeche;
	private static long staticEinwohner;
	private static String staticLand;
    // Konstruktor
    public Land(String n, long e, int f) {
		land = n;
		einwohner = e;
		flaeche = f;
    }

    // Objektmethoden

    public String toString() {
        // Beispielausgabe:
        // Deutschland
        // Einwohner: 80000000
        // Flaeche: 345000 qkm
		
        return (land) +" \n"+"Einwohner: " + (einwohner)+ "\n"+"Flaeche: "+ (flaeche)+ " qkm"+
				"\n"+"Bevoelkerungsdichte: "+(String.valueOf(dichte()))+"\n";
    }

    public double dichte() { 
		double ein = einwohner;
		double fl = flaeche;
		double ergebnis = ein / fl;
		
		if (Land.staticEinwohner < einwohner) {
			Land.staticEinwohner = einwohner;
			Land.staticLand = land;
		}
		return ergebnis; }

    public static String maxEinwohner() { 
		return " "+ (Land.staticLand) + " mit " + String.valueOf(Land.staticEinwohner) + " Einwohner"; }
    

}
