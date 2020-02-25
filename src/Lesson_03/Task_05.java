package Lesson_03;


import java.util.Arrays;

public class Task_05 {


    public static void main(String[] args) {

        int[][] a1 = new int[5][];
        int[][] a2 = new int[5][];

        a1[0] = new int[1];
        a1[1] = new int[2];
        a1[2] = new int[3];
        a1[3] = new int[4];
        a1[4] = new int[5];

        a2[0] = new int[1];
        a2[1] = new int[2];
        a2[2] = new int[3];
        a2[3] = new int[4];
        a2[4] = new int[5];

        boolean b = true;
        if (Arrays.deepEquals(new int[][]{a1[1]}, new int[][]{a2[1]})) {

            System.out.println(true);}
            else {
                System.out.println(false);

            }
        }
    }



