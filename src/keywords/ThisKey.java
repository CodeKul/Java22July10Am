package keywords;

import java.util.Scanner;

public class ThisKey {

    int id;
    String name;

    ThisKey(int id, String name) {
        this.id=id;
        this.name=name;
        System.out.println("two parameters constructor");

    }

    public ThisKey() {
        this(10,"codekul");
        System.out.println("inside default const.");

    }

    public ThisKey(int id) {
        this();
        this.id = id;
        System.out.println("Single parameter constructor");
    }

    void showData(){
        this.display();
    }

    void display() {
        System.out.println(
                "id : " + id + "\n" +
                        "name : " + name

        );
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the values of id and name : ");
        ThisKey key = new ThisKey(scanner.nextInt());
        key.showData();
    }

}
