package Lesson_03;

public class Task_07 {
    public static int calculateFactorial(int x) {
        int number = 1;
        for (int i = 1; i <= x; i++) {
            number = number * i;
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(3));
    }
}

