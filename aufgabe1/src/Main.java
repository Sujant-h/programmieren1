class X{
    int h0=zaehler++;
    int h=7;
    String str;

    static int zaehler=0;
    static {
        System.out.println("counter:"+zaehler);
        zaehler=1;
    }

    {
        System.out.println("im InitBlock1"+toString());
        str="bla";
        for (int i=0;i<5;i++){
            str+=i;
        }
        System.out.println("im InitBlock2"+toString());
        zaehler++;
    }

    X(){
        System.out.println("Konstruktor X()");
        zaehler++;
    }
    X(String str){
        this();         //Meint Konstruktur X()
        this.str=str;
    }

    @Override
    public String toString() {
        return "X{" +
                "h0=" + h0 +
                ", h=" + h +
                ", str='" + str + '\'' +
                ",zaehler="+zaehler+
                '}';
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Laenge vor args:"+args.length);
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println("Begin");
        X instofX=new X();
        System.out.println("in der Main"+instofX.toString());
        X i2=new X("habibi");
        System.out.println(i2);         // entspricht i2.toString()

    }
}