public class Main {
    public static void prefixsumsubarray(int arr[]) {
        int prefixsum[] = new int[arr.length];
        prefixsum[0] = arr[0];
        // Compute prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // Calculation of  subarray sum using prefix sum
                int currsum = prefixsum[end] - (start > 0 ? prefixsum[start - 1] : 0);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum subarray sum = " + maxsum);
    }
    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        prefixsumsubarray(arr);
    }
}

// output = 8
// Approach :store the prefix sum of the array in a separate array and then calculate the sum of the subarray using the prefix sum array.
// Time complexity:O(n^2)
