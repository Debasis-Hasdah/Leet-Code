import java.util.*;

class RandomizedSet {

    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {

        if (map.containsKey(val))
            return false;

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        if (!map.containsKey(val))
            return false;

        int index = map.get(val);
        int last = list.get(list.size() - 1);

        // swap with last element
        list.set(index, last);
        map.put(last, index);

        // remove last
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}

public class RandomizedSetExample {

    public static void main(String[] args) {

        RandomizedSet rs = new RandomizedSet();

        System.out.println("Insert 1: " + rs.insert(1));
        System.out.println("Insert 2: " + rs.insert(2));
        System.out.println("Insert 3: " + rs.insert(3));

        System.out.println("Remove 2: " + rs.remove(2));

        System.out.println("Random value: " + rs.getRandom());

        System.out.println("Insert 2 again: " + rs.insert(2));

        System.out.println("Random value: " + rs.getRandom());
    }
}