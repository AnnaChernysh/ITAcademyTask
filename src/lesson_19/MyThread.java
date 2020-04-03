package lesson_19;
/*Создать поток, который будет в цикле итерироваться от 1 до 10 000 000 и
        суммировать каждый четный элемент кратный 3. На каждой итерации, кратной 1 000 000,
        поток должен заснуть на 10мс. Вместе с суммирующим потоком запустить поток демон,
        который каждую пятую миллисекунду выводит в консоль текущее значение просуммированных элементов.*/

    public class MyThread extends Thread {

        public void run() {
            int sum=0;
            int even = 0;

            System.out.println("Thread " + this.getName() + " State:" + this.getState());
            for (int i=0; i<10000000; i++) {
                if (even % 3 == 0)
                    sum = sum + even;
                System.out.print("" + sum);
                if (i == 1000000) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Sum: " + sum);
        }

                public static void main(String[] args) throws InterruptedException {
                   MyThread t = new MyThread();
                    Thread thread = new Thread(() -> {
                        System.out.println("New Thread:" + Thread.currentThread().getName());
                    });
                    DaemonThread t1 = new DaemonThread("t1");

                    t1.setDaemon(true);
                    t1.start();
                    t.start();
                    //thread.start();

                    System.out.println("... End of executuion ");

                }
            }


