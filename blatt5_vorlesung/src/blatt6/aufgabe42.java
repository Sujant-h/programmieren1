package blatt6;

import java.util.Arrays;

import static jsTools.Input.readInt;
import static jsTools.Input.readString;

public class aufgabe42 {
    public static void main (String [] args) {
        genMatrix(4,13);



    }

    static int [][] genMatrix(int n, int m){

        int[][] matrix = new int[n][m];

        int i;
        int j;



        for(int a=0;a< matrix.length;a++){
        for (i=0; i<m; i++) {
            //1.Zeile vorbesetzen
            matrix[a][i] = 1;
        }
        }

        for (i=0; i<m; i++) {
            //1.Zeile vorbesetzen
            matrix[0][i] = 100;
        }

        for (i=0; i<n; i++) {
            //1.Zeile vorbesetzen
            matrix[i][m-1] = 100;
        }



        //Ausgabe zum test
        for(i=0; i<matrix.length; i++){
            for(j=0; j<matrix[i].length; j++){
                System.out.print(matrix [i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();




        return matrix;
    }

    public class Person{
        public String pnr;
        public String name;
        public int zip;
        public String ort;

        public void NameUebergeben(){
           pnr=readString("Name eingeben");
           name=readString("Name eingeben");
           zip=readInt("Postkleitzahl eingeben");
           ort=readString("Ort eingeben");
        }
    }

}
