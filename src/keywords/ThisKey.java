package keywords;

import java.util.Scanner;

public class ThisKey {

    int id;
    String name;

    ThisKey(int id, String name) {
        this();
        this.id=id;
        this.name=name;
    }

    public ThisKey() {
        System.out.println("inside default const.");
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
        ThisKey key = new ThisKey(scanner.nextInt(),scanner.next());
        key.showData();
    }

}
