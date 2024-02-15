public class Find_Missing_number {
    public static void main(String[]args){
        int n=10;
        int arr[]={1,5,2,3,4,6,7,8,9};
        int sum1=n*(n+1)/2;
        int sum2=0;
        for (int i : arr) {
            sum2+=i;

            
        }
        System.out.print(sum1-sum2);
    }
    
}
