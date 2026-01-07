public class CountLessThan {

    public static int countLessThan(int[] arr, int X) {
        int count = 0;
        for (int num : arr) {
            if (num < X) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 6, 3, 5};
        int X1 = 4;
        System.out.println("Count < " + X1 + " = " + countLessThan(arr1, X1));
        // Output: 3 (1, 2, 3 are < 4)

        int[] arr2 = {10, 20, 30, 40};
        int X2 = 25;
        System.out.println("Count < " + X2 + " = " + countLessThan(arr2, X2));
        // Output: 2 (10, 20 are < 25)
    }
}
