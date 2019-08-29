package multithreading;

public class MultithredDemo extends Thread {

    public void run(){

        for (int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello "+i);
        }

    }


    public static void main(String[] args) throws InterruptedException {

        MultithredDemo t1=new MultithredDemo();
        MultithredDemo t2 =new MultithredDemo();
        t1.start();
        t2.start();
        t1.setName("SAYALI");
        t2.setName("SHREYA");


        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }

}
