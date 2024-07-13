  package QuickSort;

public class quicksort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap pivot with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);

            quicksort(arr, low, pivotIdx - 1);
            quicksort(arr, pivotIdx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quicksort(arr, 0, n - 1);

        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
