import java.util.*;
class search_max_number_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={4 ,41 , 400 ,200 , 333,1,-14,20,123};
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){

            if(ans<arr[i]){
                ans=arr[i];
            }


        }
        System.out.println(ans);

    }
}