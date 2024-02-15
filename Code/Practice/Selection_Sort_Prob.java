import java.util.*;
class Selection_sort_Prob{

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        selection_sort(arr);
        selection_sort_reverse(arr);

    }
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
            int swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;
        }
        System.out.println("Sorted Array"+Arrays.toString(arr));
    }
    public static void selection_sort_reverse(int arr[]){
        for(int i=0;i<arr.length;i++){
            //It  is for sorted Array
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                //     It's  for unsorted array
                if(arr[min]<arr[j]){
                    min=j;
                }

            }
            //swap the smallest number  with current index
            int swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;
        }
        System.out.println("Decending order Sorted Array"+Arrays.toString(arr));
    }
}