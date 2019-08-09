package inhertancedemo;

public class CheckMultilevel extends CheckInheritance {

    int div(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        CheckMultilevel multilevel=new CheckMultilevel();
        multilevel.div(10,20);
    }
}
