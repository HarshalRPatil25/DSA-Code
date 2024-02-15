import java.util.*;
public class Diff_algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,57,2,3,7,97,8};
        int k=sc.nextInt();
        Binary_search(arr,k);
        System.out.println("Bubble sort - "+Arrays.toString(Bubble_sort(arr)));
        System.out.println("Selection sort - "+ Arrays.toString(Selection_Sort(arr)));
    }
    public static int[] Bubble_sort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        return arr;
        
    }
    public static int Binary_search(int arr[],int k){
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        while(start<=end){
            int mid=start+(end-start);
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
      return -1;

    }
    public static int[] Selection_Sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;
        }
        return arr;

        
        
    }
}
