package controlstatement;

public class WhileLoop {

    public static void main(String[] args) {
        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }

        System.out.println("value of i : "+i);
        do {
            System.out.println(i+" in do while");
            i++;
        }while (i<5);
    }
}
