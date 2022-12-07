
import java.util.Arrays;

public class aufgabe30 {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int swap = arr[0];
        arr[0] = arr[9];
        arr[9] = swap;
        System.out.println(Arrays.toString(arr));

    }

}
