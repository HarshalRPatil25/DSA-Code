import java.util.*;
class search_character_in_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c='a';
        for (int i = 0; i <str.length() ; i++) {
            if(c==str.charAt(i)){
                System.out.println(i);
            }
        }
    }

}