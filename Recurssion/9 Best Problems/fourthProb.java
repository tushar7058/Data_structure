// checking if an array is sorted (strictly increasing)
public class fourthProb {
    public static boolean isorted(int arr[], int idx) {
          // Handle null and empty array cases
          if (arr == null || arr.length == 0) {
            return true;
        }
        // Base case: when we reach the end of the array
        if (idx == arr.length - 1) {
            return true;
        }
        // Check if the current element is not strictly less than the next one
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        // Recursively check the rest of the array
        return isorted(arr, idx + 1);
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 3 };
        int arr2[] = {1,2,3};
        System.out.println((isorted(arr1, 0)));
        System.out.println(isorted(arr2, 0));
    }
}
