package Lesson_03;

import java.util.Arrays;
public class Task_04 {

           public static void main(String[] args) {
            int [] arr = new int[30];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 90) + 10;
            }
            System.out.println(Arrays.toString(arr));

            boolean flag = true;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]<=arr[i-1]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Массив является строго возрастающей последовательностью");
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью");
            }
        }
    }
