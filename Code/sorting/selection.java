import java.util.*;
class selection{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int arr[]={1,11,2,55,78};
        Select(arr);

    }

    public static void Select(int arr[]) {
        for(int i=0;i< arr.length-1;i++){
            int min=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
           swap(arr,min,i);
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int arr[], int m,int i) {
       int swap=arr[m];
       arr[m]=arr[i];
       arr[i]=swap;

    }

}