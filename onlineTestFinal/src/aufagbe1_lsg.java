
public class aufagbe1_lsg {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(genTstar(3, 5));
    }

    static String genTstar(int h, int lge) {
        String erg = "";
        if(lge % 2 != 1)
            lge++;
        for(int i = 0; i< lge;i++) {
            if(i == lge / 2) {
                for(int j=0;j<h;j++) {
                    erg += "*";
                }
                erg += "*\n";
            } else {
                for(int j=0;j< h; j++) {
                    erg += " ";
                }
                erg += "*\n";
            }

        }
        return erg;
    }
}