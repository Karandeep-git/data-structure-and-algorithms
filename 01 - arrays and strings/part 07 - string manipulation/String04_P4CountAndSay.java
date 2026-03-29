public class String04_P4CountAndSay {

    public static String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            result = generateNext(result);
        }

        return result;
    }

    private static String generateNext(String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            char c = s.charAt(i);
            int count = 1;

            while (i + count < s.length() && s.charAt(i + count) == c) {
                count++;
            }

            sb.append(count);
            sb.append(c);

            i += count;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.println("n = " + i + ": " + countAndSay(i));
        }
    }
}
