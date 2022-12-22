import static jsTools.Input.*;
public class hs12 {

    public static void main(String[] args) {


      onlyPrinting("text");
     //   printText("text2");
      // printWithIdentedStar();
     //   printWithIdentedStars("text3");
      pow("text4");
     //   onlyPrinting("text");
    }


    private static void onlyPrinting(String text) {
        text="ok";
        System.out.println(text);
    }


    private static void printText(String text2) {
        int b = readInteger("n Wert eingeben");
        for (int a = 1; a <= b; a++) {
            text2 = "bla";
            System.out.println(text2);
        }
    }

    private static void printWithIdentedStar() {
        int ident = readInteger("n Leerzeichen eingeben");
        int count = readInt("n Sternchen eingeben");

        for (int a = 1; a <= ident; a++) {
            System.out.print(" ");
        }

            for (int d=1;d<=count;d++) {
                System.out.print("*");
                for (int g = 1; g <= ident; g++) {
                    System.out.print(" ");
                }
            }
    }



    private static void printWithIdentedStars(String text3) {
        System.out.println("");
        int b = readInteger("n Wert eingeben");
        for (int a = 1; a <= b; a++) {
            text3 = "*";
            System.out.println("   "+text3);
        }
    }


    private static void pow(String text4) {
        System.out.println("");
        int c = readInteger("x Wert eingeben");
       int d = readInteger("y Wert eingeben");


        for (int e = 0; e<d; e++) {
           int erg=c*c;
           int f=erg*c;
            System.out.println(f);

        }
    }
}
