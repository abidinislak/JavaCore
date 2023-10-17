package concurency;

public class ThreadwithImplemnt implements Runnable {
    public static void main(String[] args) {
        new Thread(new ThreadwithImplemnt()).start();
        System.err.println("maim  :  " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.err.println(" run : " + Thread.currentThread().getName());
    }
}
