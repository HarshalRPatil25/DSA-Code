import java.util.*;
class Palindrom{

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
        		while(n>0){
			
			int res=n%10;
			 sum=sum*10+res;
			n/=10;
		

		}

		if(sum==num){

			System.out.println("Palindrom");



		}
		
		else{

			System.out.println("No");





        }


	}









}