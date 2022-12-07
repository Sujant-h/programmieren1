public class aufgabe3 {

    public static void main (String [] args){

        create(10);


    }

    static int[] create(int n){
        int j=1;
        int arr[]=new int[n];


        for (int i=1;i< arr.length;i++){
            arr[i]=j;
            j=j+j;

        }

        System.out.println(java.util.Arrays.toString(arr));
    return arr;

    }

}
