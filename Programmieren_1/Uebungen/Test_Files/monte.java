class MonteCarlo
{
    public static void main (String[]args)
    {
        double xkoodrinate = 0, ykoordinate = 0;
        double laenge = 0;
        double hilfsval;
        double zaehlerdrin = 0, zaehlerdraussen = 0;
        int i = 0;
        
        for (i = 1; i <= 5000; i++)
        {
            double zufallszahlx = (double) Math.random(); 
            double zufallszahly = (double) Math.random(); 
            hilfsval = (zufallszahlx*zufallszahlx) + (zufallszahly*zufallszahly);
            laenge = Math.sqrt(hilfsval);
            if (laenge <1)
            {
                zaehlerdrin = zaehlerdrin + 1;
            }
            else zaehlerdraussen = zaehlerdraussen + 1;
            
        }
        
        System.out.println ( "PI ist gleich:" + (zaehlerdrin/(zaehlerdraussen + zaehlerdrin))*4);
    }
}