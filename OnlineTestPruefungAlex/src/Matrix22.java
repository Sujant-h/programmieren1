/**
 * Matrix22
 */
public class Matrix22 {

    public static void main(String[] args) {
        int[][] mat = genMatrix(10, 10, 10);
        for (int[] is : mat) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }
    }
    static int[][] genMatrix(int dimR, int dimS, int val){
        int[][] matrix = new int[dimR][dimS];
        for (int i = 0; i <dimR; i++) {
            for (int j = 0; j < dimS; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < dimR; i++) {
            matrix[i][0]=val;
            matrix[i][dimS-1]=val;
        }
        for (int i = 0; i < dimS; i++) {
            matrix[0][i]=val;
            matrix[0][dimR-1]=val;
        }
        return matrix;
    }

    static int[][] mixMatrix(int[][] m1, int[][] m2){
        int m11 = 0;
        int m12 = 0;
        int m21 = 0;
        int m22 = 0;

        int a = 0;
        int b = 0;

        m11 = m1.length;
        m21 = m2.length;
        m12 = m1[0].length;
        m22 = m2[0].length;

        if (m11<m21) {
            a=m21;
        }
        else{
            a=m11;
        }

        if (m12<m22) {
            b=m22;
        }
        else{
            b=m12;
        }

        int[][] matrix = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                matrix[i][j]=
            }
        }
    }
}