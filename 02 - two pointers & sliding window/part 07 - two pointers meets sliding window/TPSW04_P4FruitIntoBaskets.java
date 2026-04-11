
import java.util.HashMap;

public class TPSW04_P4FruitIntoBaskets {
    
    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> basket = new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {

            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {

                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);

                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }

                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {
        
        System.out.println(totalFruit(new int[]{1, 2, 1}));
        System.out.println(totalFruit(new int[]{0, 1, 2, 2}));
        System.out.println(totalFruit(new int[]{1, 2, 3, 2, 2}));
        System.out.println(totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
    }
}
