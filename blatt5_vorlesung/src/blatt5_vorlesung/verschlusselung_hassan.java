package blatt5_vorlesung;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class verschlusselung_hassan {


    public static char crypt(char c, char[] klartext, char[] geheimtext) {
    	/*
        for(int i = 0; i < klartext.length; i++) {
            if (klartext[i] == c) {
                return geheimtext[ i];
            }
        }
        return c;
        */

        int pos = c - 'A';
        if ( pos < 0 || pos > 25 ) {
            return c;
        }
        return geheimtext[pos];
    }

    public static char decrypt(char c, char[] klartext,  char[] geheimtext) {
     /*   for(int i = 0; i < geheimtext.length; i++) {
            if (geheimtext[i] == c) {
               return klartext [i];
            }
        }
        return c;
    }
 */

        for(int i = 0; i < geheimtext.length; i++) {
            if (geheimtext[i] == c) {
                return (char)('A' + i);
            }
        }
        return c;
    }

    public static String cryptText(String s, char[] klartext, char[] geheimtext) {
        String crypt2 = "";
        for (int i = 0; i < s.length(); i++) {
            crypt2 = crypt2+ crypt(s.charAt(i), klartext, geheimtext);
        }
        return crypt2;
    }

    public static String decryptText(String s,  char[] klartext, char[] geheimtext) {
        String decrypt2 = "";
        for (int i = 0; i < s.length(); i++) {
            decrypt2 = decrypt2+ decrypt(s.charAt(i), klartext, geheimtext);
        }
        return decrypt2;
    }

    public static void main(String args[]){
        char[] klartext =   "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] geheimtext = "UFLPWDRASJMCONQYBVTEXHZKGI".toCharArray();


        System.out.println(cryptText("w", klartext, geheimtext));
        System.out.println(decryptText("EW$E", klartext, geheimtext));


    }



}
