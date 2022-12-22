import static jsTools.Wand.*;
public class hs17_wand {


    public static void main(String[] args) {
        // initialisieren der Wand
        initWand();

        // mit diesen Variablen kann man Pausenzeiten setzen
        int speed = 0;  //Pause nach dem Zeichnen eines Pixels
        int pause = 0; //Pause nach dem Zeichen eines Teilbilds

// zeichne horizontalen Balken
        for (int i = 5; i <3; i++) {
            setWandColor(10, i, "red"); // pixel setzen
            paintWandNew();               // Wand neu zeichnen
            sleep(speed);                // speed ms warten, damit man Bild wachsen sieht
        }

        // pause Warten
        sleep(pause);

// zeichne vertikalen Balken
        for (int i = 0; i < 24; i++) {
            setWandColor(i, 5, "black");
            paintWandNew();
            sleep(speed);
        }

        // pause Warten
        sleep(pause);

// zeichne Diagonale
        for (int i = 0; i < 24; i++) {
            setWandColor(i, i, "green");
            paintWandNew();
            sleep(speed);
        }

        // pause Warten
        sleep(pause);

// zeichne Gegendiagonale
        for (int i = 0; i < 24; i++) {
            setWandColor(23 - i, i, "yellow");
            paintWandNew();
            sleep(speed);
        }


    }

}
