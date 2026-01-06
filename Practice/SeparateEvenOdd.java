//Topic name- Separate even odd

public class SeparateEvenOdd {

    public static void separateEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // move left forward while even
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // move right backward while odd
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                // swap out-of-place odd at left and even at right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 6, 1, 3, 8, 5};

        System.out.println("Original array:");
        for (int x : arr) System.out.print(x + " ");

        separateEvenOdd(arr);

        System.out.println("\nAfter separating even and odd:");
        for (int x : arr) System.out.print(x + " ");
    }
}