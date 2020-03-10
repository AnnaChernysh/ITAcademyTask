package lesson_12;
        /*Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
        Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.*/

import java.io.IOException;

public class Task_06 {
    public static void main(String[] args) {

        try {
            int array[] = new int[10];
            array[10] = 30 / 0;

        } catch (ClassCastException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
