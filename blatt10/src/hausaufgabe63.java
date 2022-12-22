import static jsTools.Graph.*;


public class hausaufgabe63 {
    public static void main(String a[]) {
        Kreis(200, 200, 500, "white");
        double y=1.0f;
        System.out.println(y);

    }

    /*
    l Länge des zubzeichenden Strichs
    mx, my Mittelpunkt
    senkrecht: Ausrichtung
         */


    static void Kreis(int x, int y, int d, String color) {
        addCircle(x, y, d, color);

        if (d < 5) {
            return;
        }

        if (color.equals("blue")) {//equals vergleicht 2 objekte miteinander
            color = "white";
        } else if (color.equals("white")) {
            color = "blue";
        }




           Kreis(x,y+d/4,d/2,color);
        Kreis(x + d / 2, y + d / 4, d / 2, color);//die 2 fetten weißen kreise da drinnen sind já d/2


        }



    }



