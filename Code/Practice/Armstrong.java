import java.util.*;
class Armstrong{
    public static void Armstrong(int number)
    {

        int num=number;
        int sum=0;
        while(num>0){
            int res=num%10;
            res=res*res*res;
            sum+=res;
            num/=10;


        }

        if(number==sum){

            System.out.println("It is Armstrong Number");

        }
        else{

            System.out.println("It is not Armstrong Number");
        }





    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Armstrong(number);


    }




}