import java.util.*;
public class check_string {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str=str1.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);

    }

    
}
