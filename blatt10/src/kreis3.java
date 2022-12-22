import static jsTools.Graph.*;
public class kreis3 {

    static void paintCirlces(int centerX, int centerY, int d, String col) {
        // kreis
        addCircle(centerX, centerY, d, col);
        if (d < 5) {
            //rekursion zuende, mindestdurchmesser ist 5, nix kleineres bekommt man
        } else {

            if (col.equals("blue")) {//equals vergleicht 2 objekte miteinander
                col = "white";
            } else if (col.equals("white")) {
                col = "blue";
            }
            paintCirlces(centerX, centerY + d / 4, d / 2, col);//um halbes nach unten und dann halbes nach oben verschieben von Y damit es mittig ist
            paintCirlces(centerX + d / 2, centerY + d / 4, d / 2, col);//die 2 fetten weißen kreise da drinnen sind já d/2

        }
    }

    public static void main(String[] args) {
        paintCirlces(400, 400, 200, "blue");
    }
}