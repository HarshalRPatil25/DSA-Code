
import java.util.*;
class search_character_into_string_and_return_searched_character_and_string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String targert=sc.next();
        char ch=targert.charAt(0);

        char ans='c';
        int index=0;

        for(int i=0;i<str.length();i++){
            char character=str.charAt(i);
            if(character==ch){
                index=i;
                ans=ch;

            }

        }
        System.out.println("Character"+" " + ans+" "+"present at index :"+index);

    }
}