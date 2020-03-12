package lesson_13;
/*
        Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
        в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре,
        а результирующая строка должна быть в верхнем.
*/

import java.util.Scanner;

public class Task_04 {

    static void printInitials(String name) {
        if (name.length() == 0)
            return;

        System.out.print(Character.toUpperCase(
                name.charAt(0)));

        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(""+ "." +Character.toUpperCase(
                        name.charAt(i + 1)));
    }

    public static void main(String args[]) {
        String name = "Носков Валентин Михайлович";
        printInitials(name);
    }
}