import static jsTools.Graph.*;

class Person{
    String name;
    int x;
    int y;
    double groesse=1.0;
    String col;
    int kopf,rumpf,li,re,hand1,hand2;
    static int BREITE=200;

    public Person(String name, int x, int y, double groesse, String col, int kopf, int rumpf, int li, int re, int hand1, int hand2) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.groesse = groesse;
        this.col = col;
        this.kopf = kopf;
        this.rumpf = rumpf;
        this.li = li;
        this.re = re;
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", groesse=" + groesse +
                ", col='" + col + '\'' +
                ", kopf=" + kopf +
                ", rumpf=" + rumpf +
                ", li=" + li +
                ", re=" + re +
                ", hand1=" + hand1 +
                ", hand2=" + hand2 +
                '}';
    }

    Person(String n, int posx, int posy, String c, double gr){
        name=n;
        x=posx;
        y=posy;
        col=c;
        groesse=gr;
        int b=(int)(BREITE*gr);

        kopf=addCircleBorder(x+b/4,y,b/2,yellow); //Kopf
        rumpf=addRectBorder(x,y+b/2,b,b,col,name); //Rumpf
        li=addRectBorder(x,y+3*b/2,b/4,b,col); //linkes bein
        re=addRectBorder(x+3*b/4,y+3*b/2,b/4,b,col);//rechtes bein
        hand1=addCircleBorder(x,y+5*b/4,b/4,yellow);

    }
    Person(String n, int posx, int posy, String c) {
        this(n, posx, posy, c, 1.0);
        /*
        name=n;
        x=posx;
        y=posy;
        col=c;
        kopf=addCircleBorder(x+50,y,100,yellow);     //Kopf
        rumpf=addRectBorder(x,y+100,200,200,col,name);     //Rumpf
        li=addRectBorder(x,y+300,50,200,col);  //linkes Bein
        re=addRectBorder(x+150,y+300,50,200,col);  //rechts bein
        hand1=addCircleBorder(x,y+250,50,yellow);}
*/


    }

    void moveTo(int x,int y){
        int b=(int)(BREITE*groesse);
        this.x=x;
        this.y=y;

        setPos(kopf,x+b/4,y);
        setPos(rumpf,x,y+b/2);
        setPos(li,x,y+3*b/2);
        setPos(re,x+3*b/4,y+3*b/2);
        setPos(hand1,x,y+5*b/4);


    }
}

public class blatt7_vorlesung1 {
    public static void main(String[] args) {
        Person hans = new Person("Hans", 300, 200, "blue",0.5);
        Person julia = new Person("Julia",600,100,"red");
        sleep(1000);
        for(int i=250; i>0; i-=10){
            hans.moveTo(i,150);
            julia.moveTo(250+i,100); //250-i läuft dann rückwärts   250+i
            paintNew();
            sleep(200);
        }
        System.out.println(hans.toString());
        System.out.println(hans);
    }
}