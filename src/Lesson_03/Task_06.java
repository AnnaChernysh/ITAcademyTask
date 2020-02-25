package Lesson_03;

import java.io.IOException;

public class Task_06 {
    public static void main(String[] args) throws IOException {
        if (System.in.read() % 2 == 0) {
            System.out.println("Составное число");
        } else {
            System.out.println("Простое число");
        }
    }
}