import static jsTools.Input.*;
public class hs13 {
    public static void main(String[] args) {
        calcAndPrint("text");
    }

    private static void calcAndPrint(String text) {
        float a = readInt("erste Zahl eingeben");
        float b = readInt("zweite Zahl eingeben");
        float add = a + b;
        float sub = a - b;
        float mal = a * b;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mal);

        if (b == 0) {
            System.out.println("0");
        } else {
            float div = a / b;
            System.out.println(div);
        }
    }
}
