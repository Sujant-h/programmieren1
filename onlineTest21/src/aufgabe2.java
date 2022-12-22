
public class aufgabe2 {



    public static void main(String[] args){
        Mitglied gym=new Mitglied((char) 1,2,3);






    }



}


 class Mitglied {
     String name;
     char geschlecht;
     int eintrittsDatum;
     int letztesTraining;
     int anzTE;

     public Mitglied(char geschlecht, int eintrittsDatum, int letztesTraining) {
         this.geschlecht = geschlecht;
         this.eintrittsDatum = eintrittsDatum;
         this.letztesTraining = eintrittsDatum;
         this.anzTE = 0;

     }

     void trainieren(int datum, int absolvierteTE) {
         this.letztesTraining = datum;
         this.anzTE += absolvierteTE;

     }


     String getTrainingsStatus() {
         double trainStatus = (double) (anzTE / (eintrittsDatum - letztesTraining));
         String status="Leer";
         if (trainStatus < 0.5) {
             status="Schlapptüte";
             System.out.println(status);
         } else if (trainStatus>=0.5 && trainStatus<=2.0){
             status="Normal";
             System.out.println("status");
         } else if (trainStatus>2.0){
             status="Sportler";
             System.out.println(status);
         }


        return status;

     }




 }



