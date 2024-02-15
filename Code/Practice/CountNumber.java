import java.util.*;

class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(Count(arr)));
    }

    public static int[] Count(int[] arr) {
        int count = 0;
        int o_count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            } else {
                o_count++;
            }
        }

        int count_n[] = new int[2];
        count_n[0] = count;
        count_n[1] = o_count;

        return count_n;
    }
}
