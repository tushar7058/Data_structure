 package MergeSort;

public class mergesort {

    // nlogn time complexity
    public static void conquer(int arr[], int si, int mid, int ei) {
        int mergedarrr[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // O(n)
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergedarrr[x++] = arr[idx1++];
            } else {
                mergedarrr[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            mergedarrr[x++] = arr[idx1++];

        }

        while (idx2 <= ei) {
            mergedarrr[x++] = arr[idx2++];

        }

        for (int i = 0, j = si; i < mergedarrr.length; i++, j++) {
            arr[j] = mergedarrr[i];
        }

    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // O(logn)
        int mid = si + (ei - si) / 2; // (si+ei)/2 this tech not used cause in some cases it give time complexity prob

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        conquer(arr, si, mid, ei);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
}
