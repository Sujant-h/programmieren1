public class aufgabe20 {
    public static void main(String[] args) {
        primzahl();

    }

    private static void primzahl(){
        int anzahl = 0;
        int m=139;
        for (int i = 2; i <= m; i++) {
            boolean istPrimzahl = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) //ist teilbar
                {
                    istPrimzahl = false;
                    break;
                }
            }


            if (istPrimzahl == true) {

                anzahl++;
                int d = anzahl;
                System.out.println(i+"\t"+d);


            }


        }
    }
}