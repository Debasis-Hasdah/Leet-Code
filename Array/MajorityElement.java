//majority element 

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3, 0};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        Solution sol = new Solution();

        System.out.println("Majority Element (nums1): " + sol.majorityElement(nums1));
        System.out.println("Majority Element (nums2): " + sol.majorityElement(nums2));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1; // shouldn't happen as majority always exists
    }
}
