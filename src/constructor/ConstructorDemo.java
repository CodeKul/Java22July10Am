package constructor;

public class ConstructorDemo {

    static int a=20;

    public ConstructorDemo(){
        System.out.println("inside default constructor : "+a);
    }

    ConstructorDemo(int a){
        System.out.println("a : "+a);
    }

    public static void main(String[] args) {
        ConstructorDemo demo=new ConstructorDemo(10);
        ConstructorDemo demo1=new ConstructorDemo();
    }
}
