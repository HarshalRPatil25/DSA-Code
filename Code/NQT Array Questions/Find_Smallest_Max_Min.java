import java.util.*;
class Find_Smallest_Max_Min{
    public static void main(String[] args) {
        int []arr={1,75,0,-12,78,10};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        System.out.println("Minimum and maximum "+min+" "+max);
    }
}