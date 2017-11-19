public class Haupt {

    public static double wallis (int anzahlFaktoren) {
        return 1;
    }

    public static double monteCarlo (int anzahlPunkte) {
        // So bekommt man Zufallszahlen
        // x = Math.random();
        // y = Math.random();
        return 1;
    }

    public static double leibniz(int anzahlSummanden) {
        double result=1;
        int j = -1;
        for (double i=3; i<2*anzahlSummanden+1; i+=2, j*=-1)
            result = result + j*(1/i);
        return 4*result;
    }


    public static void main(String[] args) {

        // Aufgabe 1
        Rational a = new Rational(1,2);
        Rational b = new Rational(2,3);
        Rational c = new Rational(17,4);
        Rational d, e, f,g;
        d = a.add(b);
        e = d.inc();
        f = e.mal(b);
        g = f.kehrwert();
        System.out.println(d+" "+e+" "+f+" "+g);
        // 7/6 13/6 26/18 18/26

        // Aufgabe 2
        Rechteck r = new Rechteck(7,2);
        System.out.println(r + " " + r.umfang() + " " + r.flaecheninhalt());

        // Aufgabe 3
        System.out.println("Math.PI:                  " + Math.PI);
        System.out.println("Monte Carlo (1000 Punkte) " + monteCarlo(1000));
        System.out.println("Monte C. (1000000 Punkte) " + monteCarlo(1000000));
        System.out.println("Leibniz (1000 Faktoren)   " + leibniz(1000));
        System.out.println("Leibniz (1000000 Faktoren)" + leibniz(1000000));


        // Aufgabe 4
        
    }

        
}
