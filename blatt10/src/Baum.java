import static jsTools.Graph.*;
class Baum{
    int x,y,h,b;
    String col=green;   // static String green="green"
    Kugel kugeln[];
    Kerze kerzen[];
    int kD=10;

    public Baum(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
        b=h/2; // Baum soll halb so breit, wie hoch sein
        kugeln=new Kugel[5];
        for (int i = 0; i < kugeln.length; i++) {
            kugeln[i]=new Kugel(x+i*10,y+h/2+i*10,kD);
        }
        kerzen=new Kerze[2];
        kerzen[0]=new Kerze(x,y+20);
       // kerzen[1]=new Kerze(x,y+);
        kerzen[1]=new Kerze(x,y+h);
    }
    void paint(){
        addTriangle(x,y+h,b,h,0,col);   // Baumkrone
        addRect(x-b/20,y+h,b/10,h/10,brown);  // Stamm
        for (int i = 0; i < kugeln.length; i++) {
            kugeln[i].paint();
        }
        for (int i = 0; i < kerzen.length; i++) {
            kerzen[i].paint();
        }
    }
}

