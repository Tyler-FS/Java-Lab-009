public class StringPlayground {
    public static int charBalance(String s, char openChar, char closeChar) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == openChar) { count++; }
            else if (c == closeChar) { count--; }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}