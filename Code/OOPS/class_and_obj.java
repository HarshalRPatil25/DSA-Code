class class_and_obj{
    public static void main(String[] args) {
       Pen p1=new Pen();
       p1.declare();
       Pen p2=new Pen();
       p2.type("ball");
    }
}
class Pen{
    String Type;
    int number;

    public void declare(){
        System.out.println("Class is created");
    }

    public void type(String type){
        this.Type=type;
        System.out.print(type);
    }
}