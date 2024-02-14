import java.util.HashMap;

public class CheckEmptyHashMap {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        boolean isEmpty = isHashMapEmpty(hashMap);

        if (isEmpty) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }
    }

    public static <K, V> boolean isHashMapEmpty(HashMap<K, V> map) {
        // Check if size is 0
        return map.size() == 0;
    }
}
