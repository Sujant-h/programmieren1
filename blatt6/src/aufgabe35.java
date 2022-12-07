import static jsTools.Input.*;
import java.util.Arrays;

public class aufgabe35 {

    public static void main(String[] args) {

        int[][] b = {{0, 1, 2, 3},
                {1, 2, 5, 6},
                {3, 4, 5, 8},
                {6, 7, 8, 9}};

        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b[i].length; ++j) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }




    }
}
