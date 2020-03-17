package lesson_09;

public abstract class ClassForGenerics implements InterfaceforGenerics {


    public byte shortValue() {
        return 0;
    }

    public class GenericsType<T,t> {

        private T t;

        public T get() {
            return this.t;
        }

        public void set(T t1) {
            this.t = t1;
        }
    }


        }

