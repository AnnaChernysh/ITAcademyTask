package Lesson_03;

public class Task_07_while {

     public static int getFactorial(int number){
            int result = 1;
            while (number > 1) {
                result *= number--;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}

