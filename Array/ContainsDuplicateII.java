import java.util.HashMap;

public class ContainsDuplicateII {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            // If number already exists
            if (map.containsKey(nums[i])) {

                int previousIndex = map.get(nums[i]);

                // Check distance
                if (i - previousIndex <= k) {
                    found = true;
                    break;
                }
            }

            // Update latest index
            map.put(nums[i], i);
        }

        System.out.println("Contains Nearby Duplicate: " + found);
    }
}