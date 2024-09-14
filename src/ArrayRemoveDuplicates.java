import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayRemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {5, 8, 3, 5, 12, 1, 8, 9, 9};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
