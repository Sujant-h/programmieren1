public class replaceString {

    public static String replaceA(String s) {
        StringBuilder builder = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                // builder...
            }
        }
        return builder.toString();
    }

    public static String replaceB(String s) {
        StringBuilder builder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                // builder...
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println("abcdefghi".replaceAll("[aeiou]+", ""));
        System.out.println(replaceA("abcdefghi"));
        System.out.println(replaceB("abcdefghi"));
    }
}
