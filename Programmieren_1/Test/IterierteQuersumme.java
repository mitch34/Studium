
class IterierteQuersumme {
  
  static int iterierteQuersumme(int zahl) {
    // Die zahl wird solange durch ihre Quersumme
    // ersetzt, bis das Ergebnis einstellig ist

    // Iterieren der Quersummenbildung:
    while (zahl > 9) {
      
      // Berechnung der einfachen Quersumme:
      int quersumme = 0;
      do {        
        quersumme = quersumme + zahl % 10;
        zahl = zahl / 10;
      } while (zahl > 0);

      zahl = quersumme;
    }

    return zahl;
  }

  public static void main(String[] args) {
    System.out.println
        ("Die iterierte Quersumme von 48 ist " +
         iterierteQuersumme(48));
    System.out.println
        ("Die iterierte Quersumme von 7 ist " +
         iterierteQuersumme(7));
    System.out.println
        ("Die iterierte Quersumme von 1234567 ist " +
         iterierteQuersumme(4391873));
  }
}