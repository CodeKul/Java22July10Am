package innerclasses;

import abstraction.AbstractClass;
import abstraction.InterfaceDemo;

import java.util.Scanner;

public class AnonymousInnerClass {

/*
    public static StringBuilder reverseTheSentence(StringBuilder inputString)
    {
       // StringBuilder[] words=inputString.reverse().;
     */
/*   String outputString=null;
        StringBuilder builder = null;
        for(int i=0;i<words.length-1;i++)
        {
            outputString=outputString+words[i]+" ";
        }
*//*

        return builder;
    }
*/


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input string ");
        StringBuilder inputString=new StringBuilder(sc.nextLine());
        //StringBuilder outputString=reverseTheSentence(inputString);
        System.out.println("inputString:"+inputString);
        //System.out.println("output String:"+outputString);

      /*  AbstractClass abstractClass=new AbstractClass() {
            @Override
            public void showData() {
                System.out.println();
            }
        };
        abstractClass.showData();


        InterfaceDemo interfaceDemo=new InterfaceDemo() {
            @Override
            public void add() {

            }
        };
*/
    }

}
