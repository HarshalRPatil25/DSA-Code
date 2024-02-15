/**
 * Second_Smallest_and_Second_Largest_element_in_an array
 */
import java.util.*;
public class Second_Smallest_and_Second_Largest_element_in_an_array {

    public static void main(String[] args) {
        int[]arr={1,20,7,9,10,20,75,103};
        Arrays.sort(arr);
        int smallest=arr[0];
        int sec_largest=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            if(sec_largest>arr[i]){
                sec_largest=arr[i];
                break;
            }

        }
        System.out.println("Smallest and second largest "+smallest+" "+sec_largest);
    }

}