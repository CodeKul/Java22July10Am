package innerclasses;

public class CheckInnerClass {

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass=new MemberInnerClass();
        MemberInnerClass.CheckMemberInnerClass checkMemberInnerClass
                =memberInnerClass.new CheckMemberInnerClass();
        String password=checkMemberInnerClass.getPassword();
        System.out.println(password);
    }
}
