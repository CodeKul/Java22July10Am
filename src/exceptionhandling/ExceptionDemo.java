package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

    private void checkArithExc(){

        try {
            int num = 10;
            int result = num / 0;
            System.out.println(result);
        }
        finally {
            System.out.println(restOfTheCode());
        }
    }

    private void checkNullExc(){

        try {
            String s = null;
            int result = s.length();
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(restOfTheCode());
        }
    }


    private void checkArrayIndxExc(){

        try {
            String[] s = new String[3];
            System.out.println(s[2]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(restOfTheCode());
        }
    }

    void showFileData() throws FileNotFoundException {

        FileInputStream inputStream=
                new FileInputStream("/home/melayer-01/c file/file.txt");

    }

    private String restOfTheCode()  {
        int a=1;
        if (a==0){
            throw new ArithmeticException("Num cannot divide by zero");
        }

        return "restOfTheCode";
    }

    public static void main(String[] args) {
        ExceptionDemo demo=new ExceptionDemo();
        demo.checkArrayIndxExc();
        try {
            demo.showFileData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
