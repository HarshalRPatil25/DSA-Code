import java.util.*;

class search_elemet_in_custom_range{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int arr[]=new int[N];

        int start=sc.nextInt();
        int end=sc.nextInt();

        int target=sc.nextInt();

        boolean ans=false;
        for(int i=0;i<N;i++){
           arr[i]= sc.nextInt();
            if(arr[i]==target){
                ans=true;
            }
        }
        System.out.println(ans);
    }
}