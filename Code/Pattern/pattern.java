import java.util.*;
class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nr=sc.nextInt();
//        int nc=sc.nextInt();


        pattern1(nr);
        pattern2(nr);
        pattern3(nr);







    }
    static void pattern1(int nr){
        /*          *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    * * * * * *
                    * * * * * * *
                    * * * * * * * *
                    *

                    */




        for(int i=0;i<nr;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();



        }
        System.out.println();
        System.out.println();


    }

    static  void pattern2(int nr){

        /*

         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *



         */
        for(int i=0;i<nr;i++){
            for(int j=1;j<nr-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();



        }


    }

    static  void  pattern3(int n){


        /*


        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6

         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }

    static void pattern4(int n){
        
    }
}