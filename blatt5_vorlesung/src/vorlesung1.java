import static jsTools.Input.*;
public class vorlesung1 {
    public static void main(String[] args){
        //charTest();
        arrTest();

    }
    public static void charTest(){
        String str = "Hallo1234";
        //012345678
        char c = str.charAt(5);
        System.out.println("Char 5 = "+c);
        for (int i=0; i<str.length(); i++){
            c = str.charAt(i);
            System.out.println(c);
            if (c>=(int)'a' && c<='z'){     //asciiTabelle ...a,b,c,...z ...A,B,C,...Z
                c = (char)(c - 'a' + 'A');
            }
            System.out.println("=>"+c);
        }
    }
    static void printArr(String txt, int ar[]){
        System.out.println(txt);
        System.out.print("Array:");
        for (int i=0; i<ar.length; i++){
            System.out.print(" "+ar[i]);
        }
        System.out.println();
    }
    static void arrTest(){
        int [] arr;
        arr = new int[10];
        printArr("nach initialisierung",arr);
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }
        printArr("nach Schleife",arr);
        arr[9] = 0;
        printArr("nach Zuweisung",arr);
        /* ist jetzt in swe Methode printArr(..)
        for (int i=0; i<arr.length; i++){
            System.out.println(i+": "+arr[(i)%arr.length]);
        }*/
        //   char x = 'y';
        //  System.out.println(arr[x-'a']);
        int brr[];
        brr = arr;
        System.out.println("Speicheradresse arr"+arr);
        System.out.println("Speicheradresse brr"+brr);
        printArr("Vorher arr:",arr);
        printArr("Vorher brr:", brr);
        arr[0]=12345;
        printArr("arr:",arr);
        printArr("brr:", brr);
        int iVar=99;
        System.out.println("iVar:"+iVar);
        surprise(iVar, arr);
        System.out.println("iVar nachher"+iVar);
        printArr("arr",arr);
        printArr("brr",brr);
    }
    static void surprise(int i, int a[]){
        System.out.println("surprise:"+i+" "+a[2]);
        i=5;
        a[2]=2222;
        System.out.println("surprise ende:"+i+" "+a[2]);
    }
}