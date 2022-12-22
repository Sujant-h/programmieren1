import static jsTools.Input.*;

public class hs14 {
    public static void main(String[] args) {
       paintStars(0, 0);
       paintStarBlanksStar(0, 0);
    }


    private static void paintStars(int offset, int anz) {
        offset = readInt("offset viele Leerzeichen=");
        anz = readInt("anz viele Sternchen=");
        for (int i = 0; i < offset; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < anz; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    private static void paintStarBlanksStar(int offset, int anz) {
        offset = readInt("offset viele Leerzeichen=");
        anz = readInt("anz viele Leerzeichen=");
        for (int i = 0; i < offset; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < anz; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }




    }


