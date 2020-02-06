public class MyMath {
    //teschten

    /*
    Wichtig!

    statische Members(Felder und Methoden) können im Hauptprogramm, oder in anderen Klassen ohne Erzeugeung einer
    anderen Instanz verwendet werden - es muss nur der Klassenname und durch Punkt getrennt der Membername angegeben
    werden

    statische Members werden nur ein einziges mal erzeugt - werden im Hauptprogramm z.B. 10 Instanzen einer
        Klasse mit statischen Feldern erzeugt, existiert dieses Feld nur ein einziges mal für alle Instanzen
        normale Members (Felder) werden pro Instanz erzeugt; bei 10 Instanzen existiert dieses Feld (z.B. Firstname)
        10 mal im Speicher
     */
    int wert = 100;
    //statische Members(Methoden, Felder)
    public static final double MyPI = 3.1415;
    public static final double MyPI_NonStatic = 3.1415;

    //statische Methode
    public static double DegreeToRadiant(double degree){
        // Wichtig! in einer statischen Methode darf man nur auf statischen Members(Felder, Methoden) zugreifen
        return degree * 2 * Math.PI / 360;
    }
    public static double RadiantToDegree(double radiant){
        return radiant * 360 / (2 * Math.PI);

    }
    //nicht statische Methode
    public double NonStatic(){
        //Wichtig: in einer nichtstatischen Methode dürfen normale und statische Members verwendet werden
        return wert * MyPI * RadiantToDegree(wert);
    }
}
