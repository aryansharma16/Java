package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,25,12,0,25,2,5,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
      //     run the steps n-1 times

        for (int i = 0; i < arr.length; i++) {
            swapped =false;
      //      for each step max item will come to the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
        // if you did not swap for the particular value of i , it means array is sorted and stop the program
            if(!swapped){
                break;
            }
        }
    }
}
