import java.util.*;
class Avarage{ 
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();


            }
            int ans=Avg_Count( arr);
            System.out.println(ans);



        }
        public static int Avg_Count(int arr[])
        {
            int avg=0;
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
            }
            avg=sum/arr.length;

            return avg;




        }


}