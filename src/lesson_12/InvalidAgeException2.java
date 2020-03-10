package lesson_12;
/*Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
        Добавить в конструктор своего класса возможность указания сообщения.*/


    public class InvalidAgeException2 extends RuntimeException{
        InvalidAgeException2(String s){
            super(s);
        }
    }
    class TestException2{

        static void getvalid(int age) throws InvalidAgeException2 {
            if (age < 18)
                throw new InvalidAgeException2("not valid");
            else
                System.out.println("welcome!");
        }

        public static void main(String args[]) {
            try {
                getvalid(57);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

