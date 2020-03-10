package lesson_12;
        /*Объявите переменную со значением null. Вызовите метод у этой переменной.
        Отловите возникшее исключение.*/

public class Task_01 {
    public static void main(String[] args) throws Exception {
        try {
            String s = null;
            String m = null;
        } catch (NullPointerException e) {
            System.out.println(e);

        }
    }
}