package keywords;

public class CheckSuperKey extends SuperKeyDemo {
    int a=20;
    public CheckSuperKey() {
        super();
        System.out.println(
                "inside check super key const."
        );
    }

    void display(){
        System.out.println(" a "+super.a);
    }

    void showData(){
        display();
    }

    public static void main(String[] args) {
        CheckSuperKey superKey=new CheckSuperKey();
        superKey.showData();
    }

}
