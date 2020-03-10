package lesson_12;
//Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
import java.util.Scanner;
import java.util.Arrays;

public class Task_02 {
    public static void main(String args[]) {
        int[] myArray = {4,6,8,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of element:");
            try {
            int element = sc.nextInt();
            System.out.println("Index is: "+myArray[element]);
            }
            catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid");

        }
    }
}


