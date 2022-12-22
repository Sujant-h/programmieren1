public class aufgabe52 {
    public static void main(String[] args) {
        walze w1 = new walze("EKMFLGDQVZNTOWYHXUSPAIBRCJ");
        walze w2 = new walze("AJDKSIRUXBLHWTMCQGZNPYFVOE");
        walze w3 = new walze("BDFHJLCPRTXVZNYEIWGAKMUSQO");

        String text = "ABC";
        String b=w1.cryptText(w1,w1,w3,text);
        System.out.println(b);
        System.out.println(w3.decryptText(w1,w2,w3,b));


    }
}

    class walze {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String walze1;

        walze(String wlz) {
            this.walze1 = wlz;
        }

        String crypt(char c) {
            String txt = "";
            txt += this.walze1.charAt(this.abc.indexOf(c));
            return txt;
        }

        String decrypt(char c) {
            String txt = "";
            txt += this.abc.charAt(this.walze1.indexOf(c));
            return txt;

        }

        String cryptText(walze w1, walze w2, walze w3, String s) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length()) {
                    break;
                } else {
                    result += w1.crypt(s.charAt(i));
                    i++;
                }
                if (i == s.length()) {
                    break;
                } else {
                    result += w2.crypt(s.charAt(i));
                    i++;
                }
                if (i == s.length()) {
                    break;
                } else {
                    result += w3.crypt(s.charAt(i));
                }


            }
            return result;
        }



        String decryptText(walze w1, walze w2, walze w3, String s) {
            String a = "";
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length()) {
                    break;
                } else {
                    a += w1.decrypt(s.charAt(i));
                    i++;
                }
                if (i == s.length()) {
                    break;
                } else {
                    a += w2.decrypt(s.charAt(i));
                    i++;
                }
                if (i == s.length()) {
                    break;
                } else {
                    a += w3.decrypt(s.charAt(i));
                }


            }
            return a;
        }
    }

