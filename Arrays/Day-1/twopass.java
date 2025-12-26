class largest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        int firstLargest = Integer.MIN_VALUE;

        // First loop: find largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;

        // Second loop: find second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
