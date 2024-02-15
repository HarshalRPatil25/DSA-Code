import java.util.*;
public class Rearrange_array_in_increasing_decreasing_order {
    public static void main(String[] args) {
        int arr[]={-1,22,14,10,23,-200};
        System.out.println(increasing(arr));
        System.out.println(decreasing(arr));

    }
    static String increasing(int []arr){
        //Sort array into increasing order with Bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        return Arrays.toString(arr);

    }
    static String decreasing(int arr[]){
        //sorting array in decresing order using selection sort
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[min]<arr[j]) {
                    min=j;
                    
                }
            }
            int swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;
        }
        return Arrays.toString(arr);
    }
    
}
