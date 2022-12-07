public class aufgabe1 {
    public static void main(String[] args) {


for (int i=2;i<1000; i++){
    boolean istPrimzahl=true;
    for(int j=2;j<i;j++){
        if(i%j ==0) //ist teilbar
        {
            istPrimzahl=false;
            break;
        }
    }

    if(istPrimzahl==true){
        System.out.print(i+"\t");
    }





}
        }

    }

