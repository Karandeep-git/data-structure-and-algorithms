public class String05_P5StringCompression {
    
    public static int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            chars[write] = currentChar;
            write++;
            
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char digit : countStr.toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }
        }

        return write;
    }
    
    public static void main(String[] args) {
        char[] chars1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int len1 = compress(chars1);
        System.out.println(new String(chars1, 0, len1));

        char[] chars2 = { 'a' };
        int len2 = compress(chars2);
        System.out.println(new String(chars2, 0, len2));

        char[] chars3 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int len3 = compress(chars3);
        System.out.println(new String(chars3, 0, len3));
    }
}
