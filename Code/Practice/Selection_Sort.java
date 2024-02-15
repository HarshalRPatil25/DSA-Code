import java.util.*;
class Selection_Sort{

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        Selection_Sort(arr);
        Selection_Sort_reverse(arr);

    }

    public static void Selection_Sort(int arr[]){


        for(int i=0;i<arr.length-1;i++){

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

        System.out.println(Arrays.toString(arr));





    }
    public static void Selection_Sort_reverse(int arr[]){


        for(int i=0;i<arr.length-1;i++){

            int min=i;

            for(int j=i+1;j<arr.length;j++){

                if(arr[min]<arr[j]){

                    min=j;

                }

            }

            int swap=arr[min];
            arr[min]=arr[i];
            arr[i]=swap;



        }

        System.out.println(Arrays.toString(arr));





    }

}