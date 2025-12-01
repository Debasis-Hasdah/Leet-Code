public class JumpGame {
    public static void main(String[] args) {
        JumpGame sol = new JumpGame();

        int[] ex1 = {3, 8 ,5, 6};
        int[] ex2 = {3, 2, 1, 0};

        System.out.println("Example 1: " + arrayToString(ex1) + " -> " + sol.canJump(ex1));
        System.out.println("Example 2: " + arrayToString(ex2) + " -> " + sol.canJump(ex2));

        // extra tests
        int[] ex3 = {0}; // single element
        System.out.println("Example 3: " + arrayToString(ex3) + " -> " + sol.canJump(ex3));

        int[] ex4 = {2,0,0}; // can reach
        System.out.println("Example 4: " + arrayToString(ex4) + " -> " + sol.canJump(ex4));
    }

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;              // can't get to i
            maxReach = Math.max(maxReach, i + nums[i]);  // extend reach
            if (maxReach >= nums.length - 1) return true;
        }
        return false;
    }

    private static String arrayToString(int[] a) {
        if (a == null) return "null";
        if (a.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
