public class aufgabe3 {

    public static void main(String[] args) {
        Nikolaus22 nikolaus = new Nikolaus22("Habibi");
        nikolaus.putPraesent("Habibi");
        nikolaus.getAPraesent();

    }

}

class Nikolaus22 {

    String[] geschenkeSack;
    String goldenesBuch;
    int geschenkeImSack;

    public Nikolaus22(String goldenesBuch) {
        this.goldenesBuch = goldenesBuch;
        geschenkeSack = new String[10];
        geschenkeImSack = 0;
    }

    void putPraesent(String praesent) {
        int i = 0;
        while (geschenkeSack[i] != null) {
            i++;
        }
        geschenkeSack[i] = praesent;
        geschenkeImSack++;
    }

    void putPraesente(String praesente[]) {
        for (int i = 0; i < praesente.length; i++) {
            if (geschenkeImSack < 10) {
                for (int j = 0; j < geschenkeSack.length; j++) {
                    if (geschenkeSack[j] == null) {
                        geschenkeSack[j] = praesente[i];
                        geschenkeImSack++;
                    }
                }
            } else if (geschenkeImSack == 10) {
                System.out.println("Sack ist voll");
                break;
            }
        }
    }

    String getAPraesent() {
        if (geschenkeImSack != 0) {
            int i = 0;
            String s;
            while (geschenkeSack[i] == null) {
                i++;
            }
            s = geschenkeSack[i];
            geschenkeSack[i] = null;
            geschenkeImSack--;
            return s;
        } else {
            return "Sorry Sack ist leer";
        }
    }

}
