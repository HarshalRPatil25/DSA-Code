//import java.util;
//public class Binary_Search{
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        int arr[]=new int[10];
//        int target=sc.nextInt();
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int result=Binary_Search_index(arr,target);
//        System.out.println(result);
//
//
//    }
//    static int Binary_Search_index(int arr[],int target){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(target<mid){
//                end=mid-1;
//
//            }
//            else if(target>mid){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//
//    }
//}