public class aufgabe1 {
    public static void main(String[] args) {


    genTstar(3,5);



    }

    static String genTstar(int h, int lge){

        if(lge%2==0){
            lge=lge+1;
        }

        String Tstar="";

        for (int i=0; i<=(lge/2)-1;i++){
            for(int k=0;k<h-1;k++){
                Tstar=" ";
                System.out.print(Tstar);

            }

            Tstar="*";
            System.out.print(Tstar);
            System.out.println();
        }

        for(int i=0;i<h;i++){
            Tstar="*";
            System.out.print(Tstar);
        }
        System.out.println();

        for (int i=0; i<=(lge/2)-1;i++){
            for(int k=0;k<h-1;k++){
                Tstar=" ";
                System.out.print(Tstar);

            }

            Tstar="*";
            System.out.print(Tstar);
            System.out.println();
        }



        return Tstar;
    }


}
