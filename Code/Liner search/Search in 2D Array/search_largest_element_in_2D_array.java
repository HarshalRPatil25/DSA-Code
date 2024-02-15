import java.util.*;
class search_largest_element_in_2D_array{
    public static void main(String[] args) {
        int[][] arr= {
                {3, 7, 1},
                {9, 4, 5},
                {2, 8, 6}
        };
          int max=arr[0][0];
        int ans=0;
         for(int i=0;i< arr.length;i++){

             for(int  j=0;j<arr[i].length;j++){
                 if(max<arr[i][j]){
                     max=arr[i][j];

                 }
             }
         }
        System.out.println(max);


    }
}