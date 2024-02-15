import java.util.*;
class seprate{
    public static void main(String[]args){

        //Scanner sc=new Scanner(System.in);
        int arr[]={1,0,1,0,0,1};
        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){

                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;



                }


            }



        }

        System.out.println(Arrays.toString(arr));




    }







}






