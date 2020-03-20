
package lesson_10;

 /*Ввести с консоли число, занести его цифры в стек.
        Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
        •	Задать размер стека.
        •	Внести цифру в стек.
        •	Извлечь цифру из стека.
        Вывести число, у которого цифры идут в обратном порядке.
*/
import java.util.Scanner;

public class Stack {


   private int arr[];
   private int top;
   private int size;
   private int capacity;

    public Stack(int n)
    {
        size = n;
        capacity = 0;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size -1 ;
    }

    public int getSize()
    {
        return capacity ;
    }

    public void push(int i)
    {

        if(top + 1 < size )
            arr[++top] = i;
        capacity++ ;
    }
    public int pop() {
        if (!isEmpty()) {
            capacity--;
            return arr[top--];
        }
        return 0;
    }

        public static void main(String[] args) {

            System.out.println("Введите число ");
            int opt=0;
            int val;
            Stack stk = new Stack(opt);

            System.out.println("1. PUSH ");
            System.out.println("2. POP ");

            Scanner s = new Scanner(System.in);
            opt = s.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Введите число: ");
                        val = s.nextInt();
                        stk.push(val);
                        break;

                    case 2:
                        stk.pop();
                        break;
                }

                          }
        }



