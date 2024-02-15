import java.util.*;
class search_element_And_return_Element_and_Index{
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

        int ans=liner_search(arr,key,n);
        System.out.println(" Answer of Above code is "+ ans);
    }
    static int liner_search(int arr[],int key,int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            int i1 = i;
            int element=arr[i1];
            if(element==key){
                return element;
            }
        }


        return -1;
    }
    
        }