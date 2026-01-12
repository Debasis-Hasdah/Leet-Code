public class SumAllArrayElements {

    // Method to calculate sum
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Main method with testcases
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Sum = " + sumArray(arr1));  // Output: 15

        int[] arr2 = {-1, 0, 10, 5};
        System.out.println("Sum = " + sumArray(arr2));  // Output: 14

        int[] arr3 = {};
        System.out.println("Sum = " + sumArray(arr3));  // Output: 0
    }
}
