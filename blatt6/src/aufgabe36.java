public class aufgabe36 {
    public static void main(String[] args) {
        final int N = 7;
        long matrix [][] = new long [N][N];
        int i,j;

        for (i=0; i<matrix.length; i++){
            //1.Zeile vorbesetzen
            matrix [0][i] = 1;
            //1.Spalte vorbesetzen
            matrix [i][0] = 1;
        }
        for(i=1; i<matrix.length; i++){
            for(j=1; j<matrix[i].length; j++){
                matrix [i][j]= matrix [i-1][j]+ matrix [i][j-1];
            }
        }
        //Ausgabe zum test
        for(i=0; i<matrix.length; i++){
            for(j=0; j<matrix[i].length; j++){
                System.out.print(matrix [i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("m["+N+"]["+N+"] : "+matrix[N-1][N-1]);





    }


}
