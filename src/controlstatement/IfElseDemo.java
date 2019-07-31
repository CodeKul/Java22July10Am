package controlstatement;


import java.util.Scanner;

public class IfElseDemo {

    private void checkIfElse(int num){
        if (num%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("Odd number");
        }
    }

    private void checkElseIf(int marks){

        if (marks<35)
        {
            System.out.println("fail");
        }
        else if (marks>=35 && marks<60){
            System.out.println("second class");
        }
        else if (marks>=60 && marks<75) {
            System.out.println("first class");
        }
        else if (marks>=75 && marks<=100){
            System.out.println("dist");
        }
        else {
            System.out.println("invalid marks");
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of marks : ");
        int num=scanner.nextInt();
        IfElseDemo demo=new IfElseDemo();
        //demo.checkIfElse(num);
        demo.checkElseIf(num);
    }

}
