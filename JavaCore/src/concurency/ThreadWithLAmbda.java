package concurency;

public class ThreadWithLAmbda {
    public static void main(String[] args) {


        Thread t = new Thread(() -> {
            System.err.println("run  : " + Thread.currentThread().getName());
        });

        t.start();

        System.err.println("main : " + Thread.currentThread().getName());
    }
}
