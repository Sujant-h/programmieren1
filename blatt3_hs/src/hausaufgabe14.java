import static jsTools.Input.*;


class Stern {

    static void paintStars(int offset, int anz) {
        for (int i = 1; i <= offset; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= anz; i++) {
            System.out.print("* ");
        }
    }

    static void painStarsBlanksStar(int offset, int anz) {
        for (int i = 1; i <= offset; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 1; i <= anz; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
public class hausaufgabe14 {
    public static void main(String [] args){
        Stern printen = new Stern();
        int b;
        b = readIntW("1: Quadrat, 2: Dreieck, 3: Raute, 4: gefeulte Quadrat");
        while (b < 1 || b > 6){
        }
        if(b==1){
            int n = readIntW("Kantenlaenge eingeben:");
            for (int i = 1; i <= n; i++){
                printen.paintStars(0,1);
            }
            System.out.println();
            for (int i = 0; i < n-2; i++){
                printen.painStarsBlanksStar(0, (n-2)*2+1);

            }
            for(int i = 1; i <= n; i++){
                printen.paintStars(0,1);
            }

        }
        if(b==2){
            int h = readIntW("Hoehe eingeben:");
            printen.paintStars(2*h-2,1);
            System.out.println();
            for(int k=0; k<h-2; k++){
                printen.painStarsBlanksStar((h-2-k)*2, (k*2+1)*2+1);

            }
            for (int i=1; i<=2*h-1; i++){
                printen.paintStars(0,1);
            }
        }

        if (b==3){
            int n = readIntW("Kantenlaenge eingeben:");
            printen.paintStars(2*n-2,1);
            System.out.println();
            for (int i=0; i<n-1; i++){
                printen.painStarsBlanksStar((n-i-2)*2, (i*2+1)*2+1);
            }
            for (int i=0; i<n-2; i++){
                printen.painStarsBlanksStar((i+1)*2,(n-2-i)*4-1);

            }
            printen.paintStars(2*n-2,1);
        }

        if (b==4){
            int n = readIntW("Kantenleange eingeben: ");
            for(int z=1; z<=n; z++){
                System.out.println();
                for (int i=1; i<=n; i++){
                    printen.paintStars(0,1);
                }
            }
        }

    }
}