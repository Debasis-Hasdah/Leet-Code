
public class SumAllArraysElements {

    // User function
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

  
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // 

        int result = arraySum(arr);
        System.out.println("Sum of array elements: " + result);

    }

}
