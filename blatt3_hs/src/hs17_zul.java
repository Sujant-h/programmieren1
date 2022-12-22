
    import static jsTools.Input.*;
import static jsTools.Wand.*;

    public class hs17_zul {
        private static String Color;
        public static void main(String args[]) {
            initWand();

            paintDiagonale(Color);
            paintGegenDiagonale(Color);
            int spalte = readInt("Eingabe Spalte von Ver:");
            int spalte2 = readInt("Eingabe Spalte von Ver2");
            int from = readInt("Eingabe Zeile der Ver2:");

            int zeile = readInt("Eingabe Zeile der Hor:");
            int zeile2= readInt("Eingabe Zeile der Hor2:");
            int from2 = readInt("Eingabe Spalte der Hor2:");

            int lge = readInt("Eingabe Länge von Hor2 und Ver2:");
            int z0=0;
            int s0=0;
            int breite = readInt("Breite des Rechtecks");
            int hoehe = readInt("Hoehe des Rechtecks");
          //  paintHor(zeile, Color);
          //  paintVer(spalte, Color);
          //  paintHor2(zeile2, from2, lge, Color);
          //  paintVer2(spalte2, from, lge, Color);
            paintRe(z0,s0,breite,hoehe,Color);
        }

        //Diagonale
        static void paintDiagonale(String color) {
            for (int i = 0; i < 24; i++) {
                int speed = 100;
                setWandColor(i, i, "blue");
                paintWandNew();
                sleep(speed);
            }
        }

        //GegenDiagonale
        static void paintGegenDiagonale(String color) {
            for (int i = 0; i < 24; i++) {
                int speed = 40;
                setWandColor(23 - i, i, "red");
                paintWandNew();
                sleep(speed);
            }
        }


        static void paintHor(int zeile, String color) {
            int speed = 100;
            for (int i = 0; i < 24; i++) {
                setWandColor(zeile, i, "blue");
                paintWandNew();
                sleep(speed);
            }

        }

        static void paintVer(int spalte, String color) {
            for (int i = 0; i < 24; i++) {
                int speed = 100;
                setWandColor(i, spalte, "black");
                paintWandNew();
                sleep(speed);
            }
        }

        static void paintHor2(int zeile2, int from2, int lge, String color) {

            int speed = 40;

            for (int i = 0; i < lge; i++) {
                setWandColor(zeile2, from2, "green");
                paintWandNew();
                sleep(speed);
            }
        }

        static void paintVer2(int spalte2, int from, int lge, String color) {
            for (int i = from; i < lge; i++) {
                int speed = 100;
                setWandColor(i, spalte2, "red");
                paintWandNew();
                sleep(speed);
            }
        }

        static void paintRe(int z0, int s0, int breite, int hoehe, String color) {
            //1.linie
            int speed = 100;
            for (int i = 0; i < breite; i++) {
                setWandColor(i, z0, "black");
                paintWandNew();
                sleep(speed);
            }
            //2.linie
            speed = 100;
            for (int i = 0; i < hoehe; i++) {
                setWandColor(z0, i, "black");
                paintWandNew();
                sleep(speed);
            }
            //3.linie
            speed = 100;
            for (int i = 0; i < breite; i++) {
                setWandColor(i, hoehe, "black");
                paintWandNew();
                sleep(speed);
            }
            //4.linie
            speed = 100;
            for (int i = 0; i < hoehe+1; i++) {
                setWandColor(breite,i, "black");
                paintWandNew();
                sleep(speed);

            }


        }
    }

