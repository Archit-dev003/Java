import java.util.HashMap;
import java.util.Map;

public class P27_CounterFrequency {
    private static void frequency(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int value : arr) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 6, 8, 6, 9, 9, 9};
        frequency(arr);
    }
}
