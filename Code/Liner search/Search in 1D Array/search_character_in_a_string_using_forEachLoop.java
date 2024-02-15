import java.util.*;
class search_character_in_a_string_using_forEachLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = 'a';
        boolean c=false;
        for (char cha : str.toCharArray()) {
            if (cha == ch) {
                c=true;
            }

        }
        System.out.println(c);
    }
}