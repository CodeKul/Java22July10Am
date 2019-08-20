package stringdemo;

public class StringDemo {

    public static void main(String[] args) {

        String s="codekul";
        String s1=new String("CODEKUL");
        System.out.println(s.hashCode());
        String s2="codekul";
        System.out.println(s2.hashCode());

        //s=s.concat(" institute");
        System.out.println(s);
        //System.out.println(s.hashCode());

        if (s.equalsIgnoreCase(s1)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
