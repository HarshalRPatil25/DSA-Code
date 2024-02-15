import java.util.*;

public class counting_sort {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 7};

        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
        }

        int count[] = new int[large + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
