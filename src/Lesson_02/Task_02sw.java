package Lesson_02;

import java.util.Scanner;
public class Task_02sw {

            public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Введите целое число");
            int num = sc.nextInt();
            int x = num % 10;

            if (num%100>=11&&num%100<=14)
            {
                System.out.println(num+ " рублей");
            }
            else
            {
                switch (x)
                {
                    case 1:
                        System.out.println(num+ " рубль");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(num+ " рубля");
                        break;
                    default:
                        System.out.println(num+ " рублей");
                }
            }
        }


    }
