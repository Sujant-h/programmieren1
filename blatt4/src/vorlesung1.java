import static jsTools.I.*;
public class vorlesung1 {
    static int time2seconds(int tg, int std, int min){
        /*std = std+24*tg;
        min=min+std*60;
        int sec=min*60;
        return sec;*/
        return 60+60*min*(std+tg*24);
    }

    static int time2std(int tg, int std){
        return tg*24;
    }

    static int time2min(int tg, int std){
        return time2std(tg+std)+60;
    }

    static int time2sec(int tg, int std, int min){
        return(time2min(tg, std)+min)*60;
    }

    static void paintRE(char pos, String col){
        if (pos=='l') {
            addRect(20, 200, 50, 88, col);
            return;
        }
        if (pos=='r')
            addRect(400, 200, 50, 88, col);
        return;
        }


    public static void main (String arg [] ){
        paintRE('l', red);
        paintRE('r', blue);
        System.out.println(time2seconds(1,10,59));

    }

}
