import java.util.*;

public class RandomizedSet {

    private final ArrayList<Integer> list;   // stores the elements
    private final HashMap<Integer, Integer> indexMap; // val -> index in list
    private final Random rand;

    // Constructor
    public RandomizedSet() {
        list = new ArrayList<>();
        indexMap = new HashMap<>();
        rand = new Random();
    }

    // Inserts a value to the set. Returns true if the set did not already contain the specified element.
    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }
        indexMap.put(val, list.size());
        list.add(val);
        return true;
    }

    // Removes a value from the set. Returns true if the set contained the specified element.
    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        int idx = indexMap.get(val);          // index of element to remove
        int lastIdx = list.size() - 1;        // index of last element
        int lastVal = list.get(lastIdx);      // last element

        // Move last element into 'idx' position (if not already last)
        if (idx != lastIdx) {
            list.set(idx, lastVal);
            indexMap.put(lastVal, idx);
        }

        // Remove last element and delete val from map
        list.remove(lastIdx);
        indexMap.remove(val);

        return true;
    }

    // Get a random element from the set.
    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }

    // psvm: simple test
    public static void main(String[] args) {
        RandomizedSet rs = new RandomizedSet();

        System.out.println("insert(1): " + rs.insert(1));  // true
        System.out.println("remove(2): " + rs.remove(2));  // false
        System.out.println("insert(2): " + rs.insert(2));  // true

        System.out.println("getRandom(): " + rs.getRandom()); // 1 or 2

        System.out.println("remove(1): " + rs.remove(1));  // true
        System.out.println("insert(2): " + rs.insert(2));  // false (already present)

        System.out.println("getRandom(): " + rs.getRandom()); // always 2 now
    }
}
