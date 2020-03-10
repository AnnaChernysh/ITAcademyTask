package lesson_12;

/*    Бросить одно из существующих в JDK исключений,
        отловить его и выбросить своё собственное, указав в качестве причины отловленное.*/
public class Task_05 {

    public static void main(String args[]) throws NumberFormatException {
        try {
            int num = Integer.parseInt("abc");

            System.out.println(num);

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("The number entered is invalid", e);

        }
    }
}

