public class aufgabe1 {


    public static void main (String [] args){
        printL(0,3,2);



    }

    static void printL(int ident, int h, int l){



        for (int k=0;k<h-1;k++){
            for (int g=0;g<ident;g++){
                System.out.print(" ");
            }

            System.out.print("*");
            System.out.println();
        }

        for (int k=0;k<l;k++){
            for (int g=0;g<ident;g++){
                System.out.print(" ");
            }
            System.out.print("*");

        }


    }
}
