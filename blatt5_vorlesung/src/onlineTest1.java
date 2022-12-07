public class onlineTest1 {
}
class Auto23 {
        int km;
        double fuel;
        double verbrauch;
        int startkm;

        void initAuto(int kmInit) {
            this.km = kmInit;
            this.startkm=kmInit;
            this.fuel = 11.1;
            this.verbrauch = 6.3;

        }

        void drive(int distance) {
            double verbraucht;
            this.km += distance;
            verbraucht = this.verbrauch / 100 * distance;
            if (verbraucht > fuel) {
                this.fuel = 0;
            } else {
                this.fuel -= verbraucht;
            }
        }


            int getGefahren() {
                return km-startkm;


            }




        public static void main(String[] args) {
            Auto23 auto1=new Auto23();
            auto1.initAuto(100);



        }

}