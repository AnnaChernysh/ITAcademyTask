package lesson_13;
//Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
// если строка начинается и заканчивается этим словом.
public class Task_03 {

    public static void main(String[] args) {
        String str1 = new String("Мама мыла раму");
        String word = "Мама";

        System.out.print("Проверяем, начинается ли строка со слова мама: ");
        System.out.println(str1.startsWith("Мама"));

        System.out.print("Проверяем, начинается ли строка со слова мыла: ");
        System.out.println(str1.startsWith("мыла"));

        System.out.print("Проверяем, заканчивается ли строка словом мама: ");
        System.out.println(str1.endsWith("Мама"));

        System.out.print("Проверяем, заканчивается ли строка словом раму: ");
        System.out.println(str1.endsWith("раму"));
}
}