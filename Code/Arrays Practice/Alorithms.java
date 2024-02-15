/**
 * Alorithms
 */
import java.util.*;
public class Alorithms {
    public static void main(String[] args) {
        System.out.println("Linear search"+"\n"+"Binary Search"+"\n"+"Bubble Sort"+"\n"+"Selection Sort"+"\n"+"Counting Sort");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        Liner_Search(arr);
        Binary_search(arr);
        
    }
    public static void Liner_Search(int arr[]) {
        int k=4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                System.err.println(i);
            }
            
        }
          System.err.println(-1);

        
    }

    public static void Binary_search(int arr[]) {
        int k=0;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start);
            if(arr[mid]==k){
                System.out.println("Number at index"+ mid);
            }
            else if(arr[mid]>k){
                end=arr[mid]-1;

            }
            else{
                  start=arr[mid]+1;
            }
        }
        System.out.println("Number is not present");
        
    }

    
}