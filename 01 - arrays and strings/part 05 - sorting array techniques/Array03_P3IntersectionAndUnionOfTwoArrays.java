import java.util.*;

public class Array03_P3IntersectionAndUnionOfTwoArrays {
    
    public static List<Integer> intersection(int[] arr1, int[] arr2) {

        List<Integer> result = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
            }

            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    public static List<Integer> union(int[] arr1, int[] arr2) {

        List<Integer> result = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        
        while (i < arr1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] a1 = { 1, 2, 2, 3, 4 };
        int[] a2 = { 2, 2, 4, 6 };

        System.out.println("Intersection: " + intersection(a1.clone(), a2.clone()));
        System.out.println("Union: " + union(a1.clone(), a2.clone()));
    }
}
