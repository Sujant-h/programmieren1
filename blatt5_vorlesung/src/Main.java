import static jsTools.Input.*;
public class Main {
    public static void main(String[] args) {
        charTest();
        //Klein zu Groß Buchstaben
       /*
            char c=str.charAt(5);
        System.out.println(c);

        */




        }
public static void charTest(){
    String str=new String(readString("Eintippen:"));
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            System.out.print(c);
            if (c>=(int)'a' && c<='z') {
                c = (char) (c - 'a' + 'A');
            }
            System.out.println("=>"+c);

        }
    }
        //array



    }
