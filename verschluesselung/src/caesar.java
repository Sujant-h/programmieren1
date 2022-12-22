public class caesar {
    public static void main(String[] args) {
        int offset=2;
        String s="ich bin uncodiert";
      //  System.out.println(encryptString(s,offset));
        String a=encryptString(s,offset);
      //  System.out.println("Endwert Verschlüsselung:    "+a);
      //  System.out.println(decrypt(encryptString(s,offset),offset));
      //  String b=decrypt(a,offset);
      //  System.out.println("Entwert Entschlüsselung:    "+b);

    }

    public static String decrypt(String s, int offset){
        String ret="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((int)c+offset < 97 &&false){
                ret+=(char)(int)c-offset+26;
            }
            else {
                ret+=(char)((int)c-offset);
            }

            System.out.println("decrypt ret:    ");
        }
        return ret;
    }

    public static String encryptString(String s, int offset){
        String ret="";
        for(int i=0;i<s.length();i++){
            ret+=encrypt(s.charAt(i),offset);
        }

        return ret;
    }


    public static char encrypt(char c, int offset){

            if((int)c+offset >122){

                return (char)((int)c+offset-26);

            }
            else {

                return (char)(int)(c+offset);

            }

        }



}
