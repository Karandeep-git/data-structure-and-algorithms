import java.util.*;

public class FC04_P4TopKFrequentWords {


    public static List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> {

            int freqCompare = freq.get(a) - freq.get(b);
            if (freqCompare != 0) {
                return freqCompare;
            }

            return b.compareTo(a);
        });

        for (String word : freq.keySet()) {
            minHeap.offer(word);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
        System.out.println(topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
    }
    
}