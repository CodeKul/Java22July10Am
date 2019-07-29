package controlstatement;

import java.util.Scanner;

public class SwitchCaseDemo {

    String name=null;//null
    String name1="";//empty
    public static void main(String[] args) {
        int choice,a,b;
        System.out.println("1. Add\n" +
                "2. Sub\n" +
                "3. Div\n" +
                "4. Mul");

        System.out.print("Enter your choice : ");
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();

        switch (choice){

            case 1 :
                System.out.print("Enter values of a and b : ");
                a=scanner.nextInt();
                b=scanner.nextInt();
                System.out.println("add : "+(a+b));
                break;
            case 2 :
                System.out.print("Enter values of a and b : ");
                a=scanner.nextInt();
                b=scanner.nextInt();
                System.out.println("sub : "+(a-b));
                break;
            case 3 :
                System.out.print("Enter values of a and b : ");
                a=scanner.nextInt();
                b=scanner.nextInt();
                System.out.println("div : "+(a/b));
                break;
            case 4 :
                System.out.print("Enter values of a and b : ");
                a=scanner.nextInt();
                b=scanner.nextInt();
                System.out.println("mul : "+(a*b));
                break;
                default:
                    System.out.println("Invalid choice");

        }
    }
}
