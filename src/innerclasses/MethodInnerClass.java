package innerclasses;

public class MethodInnerClass {

    void display(){

        class CheckMethodInnerClass{

            void showData(){

            }

        }

        CheckMethodInnerClass methodInnerClass=new CheckMethodInnerClass();
        //methodInnerClass.showData();

    }

    public static void main(String[] args) {

        MethodInnerClass innerClass=new MethodInnerClass();
        innerClass.display();

    }

}
