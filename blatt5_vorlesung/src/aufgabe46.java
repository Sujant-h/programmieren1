import static jsTools.Input.*;

    class Auto {
        String hersteller;
        int posX;
        int posY;
        double kmStand;
        int baujahr;

            void init(String hst, int x, int y, double km, int bj){
            hersteller=hst;
            posX=x;
            posY=y;
            kmStand=km;
            baujahr=bj;
            }

            void readValues() {
            this.hersteller=readString("Hersteller  ");
            this.posX=readInt("posX ");
            this.posY=readInt("posY ");
            this.kmStand=readInt("Kilometerstand    ");
            this.baujahr=readInt("Baujahr   ");
        }

            void driveTo(int xNeu, int yNeu) {
                System.out.println("Alter posX  "+posX);
                System.out.println("Alter posY  "+posY);
                System.out.println("Neuer posX"     );

            int a=posX-xNeu;
            int b=posY-yNeu;
                posX=xNeu;
                posY=yNeu;
            double erg= Math.sqrt((a*a)+(b*b));
            kmStand= kmStand+erg;
        }

        void print(){
            System.out.println("Hersteller  "+hersteller);
            System.out.println("PosX    "+posX);
            System.out.println("PosY    "+posY);
            System.out.println("Neuer Kilometerstand    "+kmStand);
            System.out.println("Baujahr "+baujahr);

        }


    }
public class aufgabe46 {
    public static void main(String[] args) {

        Auto Lambo = new Auto();
        Lambo.readValues();
      //  Lambo.init(1,23,23,23,23);
        Lambo.driveTo(1,1);
        Lambo.print();

        Auto Porsche = new Auto();
        Porsche.readValues();
       // Porsche.init();
        Porsche.driveTo(1,1);
        Lambo.print();

    }
}
