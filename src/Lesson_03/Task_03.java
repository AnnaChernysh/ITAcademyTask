package Lesson_03;

import java.util.Random;

public class Task_03 {
    public static void main (String[] args){
        Random random = new Random();
        double[] arr = new double[100];
        int i=0;
        arr[i]=(int) (100 * random.nextDouble());

            System.out.println(arr[i]);
// Находим максимальное и минимальное значения:
        double max = arr[0];
        double min = arr[0];

        for (double value : arr) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);

        // Среднее арифметическое
        double arg = 0;
        for (double v : arr) {
            arg += v;
        }
        arg /= arr.length;
        System.out.println("Среднее арифметическое  : " + arg);

    }
    }

