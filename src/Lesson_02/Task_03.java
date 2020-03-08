package Lesson_02;


import java.util.Scanner;

    public class Task_03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите год");

            int year = sc.nextInt();

            if(year%4==0 && year%100!=0 || year%400==0) {
                System.out.println (year + " - " + "високосный");
            }
            else {
                System.out.println (year + " - " + "не високосный");
            }

        }
    }




/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import java.util.Collections;

public class Task_03 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        sort(arr);

        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
                for(int i = 0; i <  arr.length; i--) {
            System.out.print(arr[i] + "  ");
        }
    }*/



