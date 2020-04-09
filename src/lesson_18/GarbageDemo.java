package lesson_18;

    public class GarbageDemo {
        public static void main(String[] args) {
            GarbageDump garbageDump = new GarbageDump();
            Scientist scientist = new Scientist(garbageDump);
            Factory factory = new Factory(garbageDump);
            Thread t1 = new Thread(factory);
            t1.start();
            Thread t2 = new Thread(scientist);
            t2.start();
        }
    }
}
