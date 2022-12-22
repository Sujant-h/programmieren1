import static jsTools.Wand.*;
import static jsTools.Input.*;
public class hs17 {
    public static void main(String[] args) {
        initWand();
        //paintDiagonale("color");
       //  paintGegenDiagonale("color");
      //  paintHor("color");
      //  paintVer("color");
      //  paintHor2("color");
     //   paintVer2("color");
     //  paintVer2("color");
        paintRe(6,7);


        int breite = readInt("Breite des Rechtecks");
        int hoehe = readInt("Hoehe des Rechtecks");
        paintRe(breite,hoehe);
    }

    private static void paintDiagonale(String color){
        for (int i = 0; i < 24; i++) {
            setWandColor(i, i, "green");
            paintWandNew();
        }
    }

    private static void paintGegenDiagonale(String color){
        for (int i = 0; i < 24; i++) {
            setWandColor(23 - i, i, "yellow");
            paintWandNew();
        }
    }
    private static void paintHor(String color){
        int z=readInt("Zeile eingeben");
        String c=readString("Color eingeben");
        for (int i = 0; i < 24; i++) {
            setWandColor(z, i, c); // pixel setzen
            paintWandNew();               // Wand neu zeichnen
        }
    }

    private static void paintVer(String color){
        int s7=readInt("Spalte eingeben")-1;
        String c67=readString("Color eingeben");
        for (int i = 0; i < 24; i++) {
            setWandColor(i, s7, c67);
            paintWandNew();
        }
    }


    private static void paintHor2(String color){
        int beg=readInteger("SpalteAnfang")-1;
        int leg=readInt("Länge");
        int leg2=beg+leg;
        int z=readInt("Zeile eingeben")-1;
        String c=readString("Color eingeben");
        for (int i = beg; i < leg2; i++) {
            setWandColor(z, i, c); // pixel setzen
            paintWandNew();               // Wand neu zeichnen
        }
    }

    private static void paintVer2(String color){
        int bg=readInt("BeginnZeile")-1;
        int lg1=readInt("Länge")+bg;
        int s73=readInt("Spalte eingeben")-1;
        String c671=readString("Color eingeben");
        for (int i = bg; i < lg1; i++) {
            setWandColor(i, s73, c671);
            paintWandNew();
        }
    }

    static void paintRe(int breite, int hoehe) {
//horizontal oben

        for (int i = 0; i < breite; i++) {
            setWandColor(0, i, "black"); // horizontal oben
            setWandColor(hoehe-1, i, "black");      //horizontal unten
            paintWandNew();               // Wand neu zeichnen
        }

        for (int i = 0; i < hoehe; i++) {
            setWandColor(i, 0, "black");                //vertikal links
            setWandColor(i, breite-1, "black");        //vertikal rechts
            paintWandNew();
        }


    }

    }



