public class Main {
    static void onlyPrinting(){
        System.out.print("...");
        System.out.println();
    }
    static void printText(int anz, String txt){
        for (int i = 0; i<anz ;i++ )
            System.out.print("yoyoyo");
        System.out.println();
    }

    static void printWithIndentedStars(int indent, int count){
        for (int i = 0; i<indent ;i++ )
            System.out.print("  ");
        for (int s = 0; s<count ;s++ )
            System.out.print("*");
    }

    static void printlnWithIndentedStars (int indent,int count){
        for (int i = 0; i<indent ;i++ )
            System.out.println("  ");
        for (int s = 0; s<count ;s++ )
            System.out.println("*");

    }
    static String genLineWithIndentedStars (int indent, int count){
        for (int i = 0; i<indent ;i++ )
            System.out.println(" ");
        for (int s = 0; s<count ;s++ )
            System.out.println("********");
        return null;
    }

    static int pow(int x, int y){
        // x^y;
        //x^1/y;
        int ergeins = (int) Math.pow(x, y);
        int ergzwei = (int) Math.sqrt(ergeins);
        System.out.println(x +" hoch "+ y +  " = " + ergeins);
        System.out.println("Wurzel von " + ergeins + " ist "+ ergzwei);



        return ergeins;
    }
    public static void main(String[] args) {
        onlyPrinting();
        printText(4,"");
        printWithIndentedStars(1,5);
        printlnWithIndentedStars(2,2);
        genLineWithIndentedStars(2,2);
        pow(2,2);

    }

}