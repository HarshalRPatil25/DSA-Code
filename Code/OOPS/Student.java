import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        school s1=new school();

        s1.create("harshal",15,21);

    }
}
class school{
    String name;
    int age;
    int roll;
    public void create(String name,int age,int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);

    }
}