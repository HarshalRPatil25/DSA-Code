import java.util.*;
class factorial{
    public static long factorial(int num){

        long fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;

        }

        return fact;

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long ans= factorial(num);
        System.out.println(ans);


    }




}