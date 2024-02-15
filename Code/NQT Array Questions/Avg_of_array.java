public class Avg_of_array {
    public static void main(String[] args) {
        int arr[]={78,10,25,78};
        int sum=0;
        for (int i : arr) {
            sum+=i;
            
        }
        System.out.print(sum/arr.length);
    }
    
}
