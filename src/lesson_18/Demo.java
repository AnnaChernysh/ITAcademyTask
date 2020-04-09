package lesson_18;

    public class Demo {
        public static void main(String[] args) {
            GarbageDump gd = new GarbageDump();

            Factory factory = new Factory(gd);

            Scientist scientist = new Scientist(gd);


            Thread t1 = new Thread(factory);
            t1.start();
            Thread t2 = new Thread(scientist);
            t2.start();
        }
    }

