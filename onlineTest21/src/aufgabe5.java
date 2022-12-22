public class aufgabe5 {
    public static void main(String[] args) {
        int[] array = create(6);
        printArray(array);
        swapPairs(array);
        printArray(array);
        System.out.println(sumOdd(array));
    }

    static int [] create(int n){
        int [] array = new int[n];
        array[0]=1;
        for(int i=1;i< array.length;i++){
            array[i]=array[i-1]*2;
        }

        return array;
    }

    static void swapPairs(int[] array){

        for(int i=0;i<array.length-1;i+=2){ //i=i+2;
            int zwischenVariable=array[i];
            array[i]=array[i+1];
            array[i+1]=zwischenVariable;
        }
    }

    static int sumOdd(int arr[]){
        int  sum=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]%2!=0)
                sum +=arr[i];
        }
        return sum;
    }

    static void printArray(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}