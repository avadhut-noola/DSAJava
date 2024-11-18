public class reverseArr {

    public static void reverse(int arr[]) {
        int first = 0, last = arr.length-1;
        
        while (first < last) {
            
            // Swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++; last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {20, 40, 60, 800, 1000, 1020, 1650, 1666};
        reverse(arr);

        System.out.println("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
             System.out.print(" " + arr[i]);
        }
    }
}