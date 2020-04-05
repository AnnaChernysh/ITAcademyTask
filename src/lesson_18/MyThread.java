package lesson_18;
/*Создать поток, который будет в цикле итерироваться от 1 до 10 000 000 и
        суммировать каждый четный элемент кратный 3. На каждой итерации, кратной 1 000 000,
        поток должен заснуть на 10мс. Вместе с суммирующим потоком запустить поток демон,
        который каждую пятую миллисекунду выводит в консоль текущее значение просуммированных элементов.*/


        public class MyThread extends Thread {

            public static int sum;

            public void run() {
                int sum=0;
                int even = 0;

                System.out.println("Thread " + this.getName() + " State:" + this.getState());
                for (int i=0; i<10000000; i++) {
                    if (i%2 == 0 && i % 3 == 0)
                        sum += i;

                    if (i % 1000000 == 0) {
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
                t.start();
                try {
                    t.join();
                } catch(InterruptedException e) {
                    System.err.println("Interrupted");
                }

                System.out.println("... End of executuion ");
            }
        }




