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

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of number : ");
        int num=scanner.nextInt();
        IfElseDemo demo=new IfElseDemo();
        demo.checkIfElse(num);

    }

}
