public class Rechteck {

    private int laenge;
    private int breite;

    public Rechteck (int l, int b) {
		this.laenge = l;
		this.breite = b;
	}
    
    public int umfang() {
		int umfang = (2 * laenge) + (2 * breite);
        return umfang;
    }

    public int flaecheninhalt() {
		int flaeche = laenge * breite;
        return flaeche;
    }

    public String toString() {
		return "Rechteck("+(this.laenge)+" x "+(this.breite)+")";
        
    }

}
