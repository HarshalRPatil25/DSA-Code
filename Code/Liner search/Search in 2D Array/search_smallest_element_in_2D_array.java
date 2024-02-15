class search_smallest_element_in_2D_array{
    public static void main(String[] args) {
        int[][] arr= {
                {3, 7, 1},
                {9, 4, 5},
                {2, 8, 6}
        };
        int min=arr[0][0];
        int ans=0;
        for(int i=0;i< arr.length;i++){

            for(int  j=0;j<arr[i].length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];

                }
            }
        }
        System.out.println(min);


    }
}