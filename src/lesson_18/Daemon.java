package lesson_18;

import java.util.Timer;


public class Daemon extends Thread {
    private static int sum = 0;

    static int getSum() {
        return sum;
    }

    synchronized void getSum(int sum) {
        MyThread.sum = sum;
    }

    public static void main(String[] args) {

        Daemon demon = new Daemon();
        Thread daemon = new Thread();
        daemon.setDaemon(true);
        daemon.start();
    }
    @Override
    public void run() {

        while (true) {
            Timer timer = new Timer("MyTimer");
            timer.scheduleAtFixedRate(new ThreadTimer(), 0, 5);

            System.out.println(getSum());
            try {
                Thread.sleep(5);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }
    }
}
