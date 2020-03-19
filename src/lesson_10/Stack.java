
package lesson_10;

/* Ввести с консоли число, занести его цифры в стек.
        Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
        •	Задать размер стека.
        •	Внести цифру в стек.
        •	Извлечь цифру из стека.
        Вывести число, у которого цифры идут в обратном порядке.
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Stack {

    private List<Integer> stack;
    private int top;
    private static final int SIZE = 10;

    {
        stack = new ArrayList<Integer>(SIZE);
    }

    private Stack(int size) {
    }

    private void push(int i) {
        stack.add(0, i);
    }

    private int pop() {
        if (!stack.isEmpty()) {
            int i = stack.get(0);
            stack.remove(0);
            return i;
        } else {
            return -1;
        }
    }

    private boolean isEmpty() {
        int index = 0;
        if (index == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        Stack myStack = new Stack(SIZE);
        Scanner scan = new Scanner(System.in);

        //Push
        System.out.println("Введите число");
        while (scan.hasNextInt()) {
            int i = scan.nextInt();
            myStack.push(i);
            System.out.println("Pushed " + i);
        }

        //Pop

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
            scan.next();


            System.out.println("Введите еще одно число");
            while (scan.hasNextInt()) {
                int i = scan.nextInt();
                myStack.push(i);
                System.out.println("Pushed " + i);
            }


            while (!myStack.isEmpty()) {
                System.out.println("Popped " + myStack.pop());
            }

        }
    }
}

