import static jsTools.Graph.*;
public class test1 {
    public static void main(String a[]) {
        paintH(400, 300, 200, false);
    }

    /*
    l Länge des zubzeichenden Strichs
    mx, my Mittelpunkt
    senkrecht: Ausrichtung
         */
    static void paintH(int l, int mx, int my, boolean senkrecht) {
        if (l < 3) return;
        final int teiler = 2;
        if (senkrecht) {
            addLine(mx, my - l / 2, mx, my + l / 2, black);
            paintH(l / teiler, mx, my - l / 2, !senkrecht);
            paintH(l / teiler, mx, my + l / 2, !senkrecht);
        } else {
            addLine(mx - l / 2, my, mx + l / 2, my, black);
            paintH(l / teiler, mx - l / 2, my, !senkrecht);
            paintH(l / teiler, mx + l / 2, my, !senkrecht);
        }
    }
}