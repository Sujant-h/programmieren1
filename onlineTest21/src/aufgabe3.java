public class aufgabe3 {

    public static void main(String[] args) {
        int [] arr=create(100);
        swapPairs(arr);
        sumOdd(arr);


    }

    static int[] create(int n) {

        int arr[] = new int[n];
        arr[0]=1;


        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]*2;

        }

        System.out.println(java.util.Arrays.toString(arr));

        /*
        int a=arr[0];
        arr[0]=arr[1];
        arr[1]=a;

         */



        return arr;

    }



    static void swapPairs(int[] arr) {
        int zwischenVariable = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {

            zwischenVariable= arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = zwischenVariable;

        }

        System.out.println(java.util.Arrays.toString(arr));


    }

    static void  sumOdd(int arr[]){
        for(int i=0;i<= arr.length/4;i++){
            int enve=arr[i]%2;
            int sum;
            if (enve!=0){
                System.out.println(arr[i]);
                sum=+arr[i];
            }
        }

    }



}
