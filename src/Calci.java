public class Calci {

    static int a=10;
    int b=20;

    static void add(){
        System.out.println("add : "+(10+20));
    }

    static void sub(){
        System.out.println("sub : "+(10-20));
    }

    static void mul(){
        System.out.println("mul : "+(10*20));
    }

     void div(){

        System.out.println("b : "+b);
        System.out.println("a : "+a);

        System.out.println("div : "+(10/20));
    }

    public static void main(String[] args) {
        Calci calci=new Calci();//syntax to initialise  object
        calci.div();
        System.out.println("a : "+a);
        System.out.println("b : "+calci.b);
        add();
        mul();

    }
}
