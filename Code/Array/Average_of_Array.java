// package Array;

import java.util.Scanner;

public class Average_of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int sum=0;
//        for (int j:arr) {
//           sum+=j;
//
//        }
//        System.out.println(sum/n);

//
//        //2.Sum of 2D Array element


        int row_n= sc.nextInt();;
        int col_n=sc.nextInt();

        int [][]arr=new int[row_n][col_n];

        int sum=0;

        for(int row=0;row<row_n;row++){
            for(int col=0;col<col_n;col++){
                arr[row][col]=sc.nextInt();
            }

        }

        for(int row=0;row<row_n;row++){
            for(int col=0;col<col_n;col++){
                sum+=arr[row][col];
            }

        }

        System.out.println(sum/arr.length);
    }
}
