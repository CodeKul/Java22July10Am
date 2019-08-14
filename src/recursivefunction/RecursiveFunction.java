package recursivefunction;

import java.util.Scanner;

class RecursiveFunction {
    static int age;

    static void displayData() {

        System.out.print("Enter your age : ");
        Scanner scanner = new Scanner(System.in);
        age=scanner.nextInt();
        if (age>=18){
            System.out.println("welcome to vote");
        }
        else {
            displayData();
        }
        }


    public static void main(String[] args) {
        displayData();
    }
}
