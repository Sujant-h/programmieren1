import static jsTools.Graph.*;
class Person_Upgrade {
    String name;
    int x;
    int y;
    double groesse=1.0;
    String col;
    int [] elements = new int[10];// kopf,rumpf,li,re,hand1,hand2;
    //10 Elemente mal auf Vorrat
    int handR;
    int lastElem=0;


    int counthandup=0;  //0 bis 4 hoch, -5 bis -1 runter siehe move
    final int UPCOUNTS=5;
    int upSize;//haengt von groesse ab!


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", groesse=" + groesse +
                ", col='" + col + '\'' +
                /*, kopf=" + kopf +
                ", rumpf=" + rumpf +
                ", li=" + li +
                ", re=" + re +
                ", hand1=" + hand1 +
                ", hand2=" + hand2 */
                '}';
    }

    static int BREITE=200;
    Person_Upgrade(String n, int posx, int posy, String c, double gr){
        name=n;
        x=posx;
        y=posy;
        col=c;
        groesse=gr;
        int b=(int)(BREITE*gr);
        elements[lastElem++]=addCircleBorder(x+b/4,y,b/2,yellow); //Kopf
        elements[lastElem++]=addRectBorder(x,y+b/2,b,b,col,name);//Rumpf
        elements[lastElem++]=addRectBorder(x,y+3*b/2,b/4,b,col);//linkes bein
        elements[lastElem++]=addRectBorder(x+3*b/4,y+3*b/2,b/4,b,col);//rechtes Bein
        elements[lastElem++]=addCircleBorder(x,y+5*b/4,b/4,yellow); //hand_li
        //hier koennen wir bequem weitere Teile ergaenzen
        elements[lastElem++]=addCircleBorder(x+3*b/4,y+5*b/4,b/4,yellow); //hand_li
        handR=elements[lastElem-1]; //letzte Hand
        upSize=BREITE/UPCOUNTS*3/4;
    }

    Person_Upgrade(String n, int posx, int posy, String c){
        this(n,posx,posy,c,1.0);
    }

    /*
    move retativ zur Position!!
     */
    void move(int dx, int dy){
        this.x=x+dx;
        this.y=y+dy;
        for (int i = 0; i <lastElem ; i++) {
            int el=elements[i];
            int newy=getY(el)+dy;
            if (el==handR){ //Sonderbehandlung rechte Hand:
                if (counthandup++ >= 0){
                    newy-=upSize;
                } else {
                    newy+=upSize;
                }
                if (counthandup > UPCOUNTS)
                    counthandup=-UPCOUNTS-1;
            }
            setPos(el,getX(el)+dx,newy);
        }
    }
    void moveTo(int x, int y) {
        int b = (int) (BREITE * groesse);
        int dx = this.x - x;
        int dy = this.y - y;
        this.x = x;
        this.y = y;
        for (int i = 0; i < lastElem; i++) {
            setPos(elements[i], getX(elements[i]) - dx, getY(elements[i]) - dy);
        }
    }

}


public class casten {
    public static void main(String a[]) {
        Person_Upgrade p;
        p=new Person_Upgrade("Hans", 300, 200, "blue",0.5);
        System.out.println(p);
        Person_Upgrade hans = new Person_Upgrade("Hans", 300, 200, "blue",0.5);
        Person_Upgrade julia = new Person_Upgrade("Julia",600,100,red);
        sleep(1000);
        for (int i = 0; i < 20; i++) {
            julia.move(0,0);
            sleep(100);
            paintNew();
        }
        sleep(1000);
        for (int i = 250; i >150 ; i-=10) {
            hans.moveTo(i,150);
            //julia.moveTo(250-i,100);
            paintNew();
            sleep(200);
        }
        System.out.println(hans.toString());
        System.out.println(hans);

    }
}