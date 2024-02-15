/**
 * Provide_Smallest_element_greater_than_target
 */
import java.util.*;
public class Provide_Smallest_element_greater_than_target {
    public static void Search(int arr[],int target,int num){

        int index=-1;
        for(int i=0;i<num;i++){
            if(arr[i]==target && target!=arr[num-1]){

                System.out.println("Small number greater  than target"+arr[i+1]);


            }
            else{
                System.out.println("Element present at last index");

            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int target=sc.nextInt();
        for(int  i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Search(arr,target,num);
    }

    
}