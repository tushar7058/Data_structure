//  package Sorting;

public class insertion {
    public static void printaArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         
    }
    public static void main(String[] args) {
        int arr[]={7,11,3,1,2};

        // insertion sort
        for(int i =1;i<arr.length;i++){
            int current= arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            // place element
            arr[j+1]=current;
        }
        printaArray(arr);
    }
}
