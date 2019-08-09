package polymorphism;

public class CheckPolymorphism extends PolymorphismDemo{

    int add(int a,int b){
        return a+b+100;
    }

    int add(){
        return 10+20;
    }

    public static void main(String[] args) {

        CheckPolymorphism checkPolymorphism=new CheckPolymorphism();
        System.out.println(
                checkPolymorphism.add()
        );

    }

}
