import java.util.*;;
public class sum_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(sum(number));
    }
    public static int sum(int digit){
        int sum=0;
        while(digit>0){
            int res=digit%10;
            sum+=res;
            digit/=10;
        }
        return sum;


    }
}
