package lesson_04;


import java.util.Scanner;

    public class ATM {

        public static void main(String args[]) {
            int amount;
            int note100 = 0;
            int note50 = 0;
            int note20 = 0;
            int count = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Введите сумму:");
            amount = sc.nextInt();


             if (amount % 10 != 0) {
                System.out.println("Ошибка! Правильно укажите сумму.");
                   }

                while (amount >= 100) {
                    note100 = amount / 100;
                    amount = amount % 100;
                    System.out.println("Количество купюр номинала 100:" + note100);
                    break;
                }
                while (amount >= 50) {
                    note50 = amount / 50;
                    amount = amount % 50;
                    System.out.println("Количество купюр номинала 50:" + note50);
                    break;
                }
                while (amount >= 20) {
                    note20 = amount / 20;
                    amount = amount % 20;
                    System.out.println("Количество купюр номинала 20: " + note20);
                    break;

                }
                count = note100 + note50 + note20;
                System.out.print("Общее кол-во выдаваемых купюр:" + count);
            }
        }


