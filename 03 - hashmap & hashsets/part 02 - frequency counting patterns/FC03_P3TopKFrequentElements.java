import java.util.*;

public class FC03_P3TopKFrequentElements {
    
    public static int[] topKFrequentSort(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(freq.keySet());

        keys.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
    }

    public static int[] topKFrequentHeap(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int num : freq.keySet()) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }


    public static int[] topKFrequentBucket(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(nums, 0) + 1);
        }

        @SuppressWarnings("unchecked")
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : freq.keySet()) {
            buckets[freq.get(num)].add(num);
        }

        int[] result = new int[k];
        int idx = 0;

        for (int i = nums.length; i >= 1 && idx < k; i--) {
            for (int num : buckets[i]) {
                result[idx++] = num;

                if (idx == k) {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(topKFrequentSort(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequentHeap(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequentBucket(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
