public class maxSubArrSum {

    public static void kadanes(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum sum= " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(arr);
    }
}