package lesson_13;
/*
Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
        Пример: aaabbcdeef ->abcdef
*/

public class Task_06 {

       public static String uni(String s){

        String str = new String();
        int len = s.length();

        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);

            if (str.indexOf(c) < 0)
            {
                str += c;
            }
        }

        return str;
    }

    public static void main(String[] args)
    {

        String s = "fgsfdjkfgdjhskflg";

        System.out.println(uni(s));
    }
}