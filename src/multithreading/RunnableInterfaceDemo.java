package multithreading;

public class RunnableInterfaceDemo {


    public static void main(String[] args) {
        Runnable thread1 = () -> {

        };
        Thread thread = new Thread(thread1);
        thread.start();

    }

}
