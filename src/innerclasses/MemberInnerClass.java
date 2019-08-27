package innerclasses;

public class MemberInnerClass {

    private String password="123456";

    void showInMemberInnerClass(){
        System.out.println("inside showInMemberInnerClass");
    }

    class CheckMemberInnerClass{

        void showInCheckMemberInnerClass(){
            System.out.println("inside showInCheckMemberInnerClass");
            System.out.println("password : "+password);
        }

        String getPassword(){
            return password;
        }

    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass=new MemberInnerClass();
        MemberInnerClass.CheckMemberInnerClass checkMemberInnerClass
                =memberInnerClass.new CheckMemberInnerClass();
        checkMemberInnerClass.showInCheckMemberInnerClass();

        memberInnerClass.showInMemberInnerClass();
    }

}
