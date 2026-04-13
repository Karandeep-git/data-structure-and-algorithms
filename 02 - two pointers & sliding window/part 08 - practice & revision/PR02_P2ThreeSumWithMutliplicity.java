public class PR02_P2ThreeSumWithMutliplicity {
    
    static final int MOD = 1_000_000_007;

    public static int threeSumMulti(int[] arr, int target) {

        long[] count = new long[101];

        for (int num : arr) {
            count[num]++;
        }

        long result = 0;

        for (int i = 0; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {

                int k = target - i - j;

                if (k < j || k > 100) {
                    continue;
                }

                if (count[i] == 0 || count[j] == 0 || count[k] == 0) {
                    continue;
                }

                if (i == j && j == k) {
                    result += count[i] * (count[i] - 1) * (count[i] - 2) / 6;
                } else if (i == j) {
                    result += count[i] * (count[i] - 1) / 2 * count[k];
                } else if (j == k) {
                    result += count[i] * (count[j] * (count[j] - 1) / 2);
                } else {
                    result += count[i] * count[j] * count[k];
                }
                result %= MOD;
            }
        }

        return (int) result;
    }
    
    public static void main(String[] args) {
        
        System.out.println(threeSumMulti(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
        System.out.println(threeSumMulti(new int[]{1, 1, 2, 2, 2}, 5));
        System.out.println(threeSumMulti(new int[]{0, 0, 0}, 0));
    }
}
