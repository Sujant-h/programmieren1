import static jsTools.Input.*;
public class Main {

    public static void main(String[] args) {


      // rechteck();
        dreieck();


    }

    public static void rechteck() {
        int breite = readInt("Breite eingeben");
        int hoehe = readInt("Höhe eingeben");
        //obere Seite
        for (int i = 0; i < breite; i++) {
            System.out.print("*");
            System.out.print("  ");

        }

        for (int g = 0; g < hoehe - 2; g++) {
            System.out.println();
            System.out.print("*");
            for (int i = 0; i < 3*breite-4; i++) {
                System.out.print(" ");
            }
            System.out.print("*");


        }


        //untere Seite
        System.out.println();
        for (int i = 0; i < breite; i++) {
            System.out.print("*");
            System.out.print("  ");
        }



        }






        public static void dreieck(){
            int breite = readInt("Breite eingeben");
            int hoehe = readInt("Höhe eingeben");

            //Spitze
        for(int i=0;i<breite/2;i++){ //leerzeichen
            System.out.print("  ");
        }

        System.out.print("*");
            System.out.println();
        //zweite Zeile
            for(int k=0;k<breite/4;k++){
                System.out.print("  ");
            }

            System.out.print("*");

            for(int k=0;k<breite/4;k++){
                System.out.print("  ");
            }
            System.out.print("*");

            // dritte Zeile
            for(int k=0;k<breite/4;k++){
                System.out.print("  ");
            }

            System.out.print("*");

            for(int k=0;k<breite/4;k++){
                System.out.print("  ");
            }
            System.out.print("*");


        }



}