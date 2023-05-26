package grammer.threadTest;

class ThreadWithRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(10); // 0.01초간 스레드를 멈춘다.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Thread thread01 = new Thread(new ThreadWithRunnable());
        thread01.start();
    }
}
