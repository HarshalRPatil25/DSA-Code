//import java.util.*;
//
//class search_in_2D_Array {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 10, 22, 14, 15},
//                {12a, 10, 17},
//                {1, 8, 0}
//        };
//        int target = 14;
//
//        ArrayList<int[]> indices = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == target) {
//                    indices.add(new int[] {i, j});
//                }
//            }
//        }
//
//        // Printing the indices of target elements
//        for (int[] index : indices) {
//            System.out.println("Row: " + index[0] + ", Column: " + index[1]);
//        }
//    }
//}
