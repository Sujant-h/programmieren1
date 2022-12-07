public class onlineTest2 {




    public static void main(String[] args) {
        System.out.println(formula(17.2));
    }

    static int formula(double par) {
        return (int) (((par * 3.25) / (par - 1)) + par);
    }

    static boolean calcStar(int[] values) {
        int summe = 0;
        double average = 0.0;
        for (int i = 0; i < values.length; i++) {
            summe += values[i];
        }
        average = summe / values.length;
        if (average >= 0.0 && average <= 2.4) {
            return "*";
        } else if (average > 2.4 && average <= 2.8) {
            return "**";
        } else {
            return "***";


        }

        static boolean hasBigNumber(double num[]) {
            boolean isBig = false;
            for (int i=0; i < num.length;i++){
                if(num[i]>107.0){
                    isBig=true;
                }
            }

        }


    }

}