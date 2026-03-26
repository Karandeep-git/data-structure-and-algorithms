public class String03_P3CountVowelsAndConstants {
    
    public static void count(String s) {

        s = s.toLowerCase();

        int vowels = 0;
        int constants = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    constants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Constants: " + constants);
    }

    public static void main(String[] args) {
        count("Hello");
        count("Hello World");
        count("Arjun");
    }
}
