public class find_min_max {
    public static void main(String[] args) {
        int arr[]={4,45,7,2,33};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            min=Math.min(i, min);
            max=Math.max(i, max);
            
        }
        System.out.println(min +" "+ max);
    }
    
}
