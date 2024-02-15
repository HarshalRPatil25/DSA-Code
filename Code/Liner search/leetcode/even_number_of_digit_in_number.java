import java.util.*;
class even_number_of_digit_in_number{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int a[]={12,345,2,6,7896};

        for(int i=0;i<a.length;i++){
            int count=0;
            int n=a[i];
            while(n>0){
                n/=10;
                count++;
            }
            if(count%2==0){
              list.add(count);

            }

        }


        System.out.println(list.size());
    }
}