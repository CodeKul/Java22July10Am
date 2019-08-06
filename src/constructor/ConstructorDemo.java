package constructor;

import java.text.ParseException;

public class ConstructorDemo {

    static int a=20;

    public ConstructorDemo(){
        System.out.println("inside default constructor");
    }

    ConstructorDemo(int a){
        System.out.println("a : "+a);
    }

    public static void main(String[] args) throws ParseException {
        ConstructorDemo demo=new ConstructorDemo(10);
    }
}
