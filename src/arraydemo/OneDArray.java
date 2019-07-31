package arraydemo;

import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {
        int sizeOfArray=0;
        int[] array={1,2,3,4,5};
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter the size of array : ");
        int array1[]={1,2,3,4,5};
        sizeOfArray=scanner.nextInt();
        int[] array2=new int[sizeOfArray];

        char[] ctr={'a','b','c','d','e'};
        String[] str={"abcd","xyz","pqr"};


       for (int i=0;i<array2.length;i++){
           System.out.print("enter array of "+i+":\t");
           array2[i]=scanner.nextInt();
       }

       for (int i=0;i<array2.length;i++){
           System.out.print("array2  : "+array2[i]+" ");
       }

       // System.out.println("array of 1 index : "+array[0]);

    }

}
