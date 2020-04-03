package lesson_19;

public class DaemonThread extends Thread
    {
        public DaemonThread(String name){
            super(name);
        }

        public void run() {
            // Checking whether the thread is Daemon or not
            if (Thread.currentThread().isDaemon()) {
                System.out.println(getName() + " is Daemon thread");
            }
        }

        public static void main(String[] args) {

            DaemonThread t1 = new DaemonThread("t1");

            t1.setDaemon(true);

            t1.start();


        }
    }