public class arrMinMax {

    public static void findMinMax(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            
            //Comparing for min value
            if(smallest > arr[i]) {
                smallest = arr[i];
            }

            //Comparing for max value
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println("Minimum array value: " + smallest);
        System.out.println("Maximum array value: " + largest);
    }

    public static void main(String[] args) {
        int arr[] = {20, 40, 60, 800, 1000, 1020, 1650, 1666};
        findMinMax(arr);
    }
}