package concurency;

public class Threadcustom extends Thread {


    public static void main(String[] args) {


        new Threadcustom().start();
        System.err.println("main  :  " + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.err.println("run : " + getName());
    }
}
