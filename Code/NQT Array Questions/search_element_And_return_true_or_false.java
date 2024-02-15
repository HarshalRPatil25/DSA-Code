import java.util.*;

class  search_element_And_return_true_or_false{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("Size of Array : ");
        int n=sc.nextInt();


        System.out.println("Enter Array Elements  : ");
        int []arr=new int[n];


        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Target value : ");
        int key=sc.nextInt();

        boolean ans=liner_search(arr,key,n);
        System.out.println(" Answer of Above code is : "+ ans);
    }
    static Boolean liner_search(int arr[],int key,int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){

            if(arr[i]==key){
                return true;
            }
        }


        return false;


    }
}