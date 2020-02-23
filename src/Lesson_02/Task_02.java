package Lesson_02;

    import java.util.Scanner;

    public class Task_02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите целое число");
            int num = sc.nextInt();
            int x = num % 10;

            if (num % 100 >= 11 && num % 100 <= 14) {
                System.out.println(num + " рублей");
            } else if (num % 10 == 1) {
                System.out.println(num + " рубль");
            } else if (num % 10 == 2 || num % 10 == 3 || num % 10 == 4) {
                System.out.println(num + " рубля");
            } else {
                System.out.println(num + " рублей");
            }
        }
    }


