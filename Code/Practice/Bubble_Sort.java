import java.util.*;
class Bubble_Sort{

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int arr[]=new int[num];

        for(int i=0;i<num;i++){

            arr[i]=sc.nextInt();

        }

        bubble_sort(arr);
        bubble_sort_reverse(arr);


    }

    public static void bubble_sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){

                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;


                }

            }




        }

        System.out.println("Sorted Array"+Arrays.toString(arr));







    }

    public static void bubble_sort_reverse(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]<arr[j+1]){

                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;


                }

            }




        }

        System.out.println("Decending order Sorted Array"+Arrays.toString(arr));







    }




}