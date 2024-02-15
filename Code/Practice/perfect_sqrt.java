import java.util.*;
public class perfect_sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        System.out.println(prin(digit));

        
    }
    public static String prin(int number){
        int ans=0;
        if(number>0){
            ans=(int)Math.sqrt(number);
        }
        if(ans*ans==number){
            return "yes";
        }
        return "no";

    }
}
