package lesson_15;
/*Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
        Для этого использовать рекурсию (пример рекурсии тут и тут).*/
import java.io.File;
public class Task_06 {

      public static void RecursPrint(File[] arr,int index,int level)
        {
            if(index == arr.length)
                return;

            if(arr[index].isFile())
                System.out.println(arr[index].getName());

            else if(arr[index].isDirectory())
            {
                System.out.println("[" + arr[index].getName() + "]");

                RecursPrint(arr[index].listFiles(), 0, level + 1);
            }

            RecursPrint(arr,++index, level);
        }

        public static void main(String[] args)
        {

            String maindirpath = "C:\\Program Files\\Java";

            File maindir = new File(maindirpath);

            if(maindir.exists() && maindir.isDirectory())
            {
                File arr[] = maindir.listFiles();

                System.out.println("");
                System.out.println("Files from main directory : " + maindir);
                System.out.println("");

                // Calling recursive method
                RecursPrint(arr,0,0);
            }
        }
    }

