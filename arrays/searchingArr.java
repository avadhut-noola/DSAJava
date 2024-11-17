import java.util.Scanner; 
public class searchingArr {
    
        //Binary Search
    public static int binarySearch(int arr[], int key) {
        int start = 0 , end = arr.length-1;

        //Searching key on each index in a loop 
        while(start <= end ) {
            int mid = (start + end) / 2;

            //Compare
            if(arr[mid] == key) {
                return mid; //If key found, return index
            }
            if(arr[mid] < key) { // Search on right side
                start = mid+1; 
            } else {
                end = mid-1; // Search on left side
            }
                
        }
        
        return -1; //If key not found
    }

    //Linear Search
    public static int linearSearch(int arr[], int key) {
        
        //Searching key on each index in a loop 
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key)
                return i; //If key found return index
        }
        
        return -1; //If key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {20, 40, 60, 800, 1000, 1020, 1650, 1666};
        
        // Displaying array
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 
        System.out.println();

        //Linear Search
        System.out.println("Enter value to search from array (Linear Search): ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);

        if(index == -1) 
            System.out.println("Element not present in array.");
        else 
            System.out.println("Element found at index: " + index);

        //Binary Search
        System.out.println("Enter value to search from array (Binary Search): ");
        key = sc.nextInt();
        index = binarySearch(arr, key);

        if(index == -1) 
            System.out.println("Element not present in array.");
        else 
            System.out.println("Element found at index: " + index);

        sc.close();
    }
}