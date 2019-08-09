package inhertancedemo;

public class CheckInheritance {

    int  sub(int a,int b){
        return a-b;
    }

    int add(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
        CheckInheritance inheritance=new CheckInheritance();
        inheritance.add(10,20);
    }

}
