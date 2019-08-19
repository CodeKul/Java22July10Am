package abstraction;

public class CheckAbstractClass extends AbstractClass implements InterfaceDemo{

    @Override
    void showData() {

    }

    public static void main(String[] args) {
        CheckAbstractClass abstractClass=new CheckAbstractClass();
        abstractClass.showData();
    }

    @Override
    public void add() {

    }

}
