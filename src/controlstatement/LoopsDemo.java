package controlstatement;

public class LoopsDemo {

    static private void  forLoop(){

        for (int i=0;i<5;i++){
            System.out.println(" i :"+i);
        }

    }

  /*  1 2 3
    4 5 6
    7 8 9

    00,01,02
    10,11,12
    20,21,22  */
    static private void nestedFor(){

        for (int i=0;i<3;i++){

            for (int j=0;j<3;j++){

                System.out.print(i+""+j+"\t");

            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        nestedFor();
    /*    int a=10;
        int b=a++;//a=11 b=10
        int c=(++b)+(a++);//c=22 b=11 a=12
        int d=(c++)+(++b)+(--a);//d=45 c=23 b=12 a=11
        int e=(d++)+(--c)+(b++)+(++a);//e=69 d=46 c=22 b=13 a=12

        System.out.println("a : "+a);

        System.out.println("b : "+b);

        System.out.println("c : "+c);

        System.out.println("d : "+d);

        System.out.println("e : "+e);*/

        //shreya 10 11 23 44 88
        //shital 10,11,21,31,73



    }
}
