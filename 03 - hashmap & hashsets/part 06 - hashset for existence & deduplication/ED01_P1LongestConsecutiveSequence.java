import java.util.HashSet;

public class ED01_P1LongestConsecutiveSequence {
    public static int longestConsecitive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
    
    public static void main(String[] args) {
        
        System.out.println(longestConsecitive(new int[]{100, 4, 200,1, 3, 2}));
        System.out.println(longestConsecitive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        System.out.println(longestConsecitive(new int[]{1, 2, 0, 1}));
    }
}