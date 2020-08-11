public class MaximumSubarray {
    private MaximumSubarray() {
    }

    public int[] findMaxCrossingSubarray(int[] A, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = mid;
        for (int i = mid; i >= low; i--) {
            sum = sum + A[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = mid + 1;
        for (int j = mid + 1; j <= high; j++) {
            sum = sum + A[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }
        int[] returnInts = new int[]{maxLeft, maxRight, leftSum + rightSum};
        return returnInts; // [max-left, max-right, leftsum + rightsum]
    }
    

}
