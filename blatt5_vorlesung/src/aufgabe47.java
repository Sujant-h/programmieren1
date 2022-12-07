class StromZaehler {
    String typ;
    int bj;
    static int zStand;
    int lastSt;

    void AddEn(int kwh){
        zStand=zStand+kwh;
        return;
    }

    int ablesen(){
        lastSt=zStand;

        return lastSt;
    }

    double getCost(){
        System.out.println("zStand= "+zStand);
        System.out.println("lastST= "+lastSt);
        double cost=((zStand-lastSt)*2)/100;
        System.out.println("Kosten= "+cost);
        return cost;

    }





}
public class aufgabe47 {

    public static void main(String[] args){
        StromZaehler Strommesser = new StromZaehler();
        Strommesser.zStand=100;
        Strommesser.lastSt=0;
        Strommesser.ablesen();
        Strommesser.AddEn(1000);
        Strommesser.getCost();

    }


}
