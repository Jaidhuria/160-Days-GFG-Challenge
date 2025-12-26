import java.util.Arrays;

class largest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        if (n < 2) {
            System.out.println("There is no second largest element.");
            return;
        }

        Arrays.sort(arr);

        int firstLargest = arr[n - 1];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != firstLargest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
