package lesson_13;
/*Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
        второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.*/

public class Task_01 {
    public static void main(String[] args) {
        String str1 = "Я учу ";
        String str2 = "Java";
        for (int i = 0; i < 20; i++) {
            System.out.println(str1 + str2);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(" Я упорно учу ").append("Java");
            System.out.println(sb);
        }
    }
}

