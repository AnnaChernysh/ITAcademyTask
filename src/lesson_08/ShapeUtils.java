package lesson_08;

public class ShapeUtils {
    Rectangle rect = new Rectangle();
   if(rect instanceof Rectangle)

    {
        System.out.println("Yes, rect is an instance of Rectangle.");
else
        System.out.println("No, rect is not an instance of Rectangle.");
    }

    Triangle tr = new Triangle();
   if(tr instanceof Triangle)

    {
        System.out.println("Yes, tr is an instance of Triangle.");
else
        System.out.println("No, tr is not an instance of Triangle.");
    }
}
