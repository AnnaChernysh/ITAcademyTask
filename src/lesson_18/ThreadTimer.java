
package lesson_18;
import java.util.Timer;
import java.util.TimerTask;

    public class ThreadTimer extends TimerTask{

        private static int sum = 0;
        static int getSum()
        {
            return sum;
        }

        public static void main(String [] args) {
            Timer timer = new Timer("MyTimer");
            timer.scheduleAtFixedRate(new ThreadTimer(), 0, 5);
        }
        @Override
        public void run() {

            System.out.println(getSum());

        }

    }


