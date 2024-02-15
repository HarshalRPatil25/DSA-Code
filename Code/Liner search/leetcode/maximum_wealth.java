import java.util.*;
class maximum_wealth{
    public static void main(String[] args) {
        int arr[][]={
            { 2,45,78,10,789},
            {22,100,250,45,78}

        };
           int ans = search(arr);
        System.out.println(ans);

    }
    static int search(int arr[][]){
        int max=-1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];

            }
            max=Math.max(sum,max);
        }
        return max;

    }
}