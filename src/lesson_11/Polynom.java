
package lesson_11;

/*Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся
        в двух объектах HashMap в виде:
        Ключ: номер степени
        Значение: значение множителя

        Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8*/

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;


  public class Polynom {
      public static void main(String[] args) {
          Map<Integer, Integer> map = new HashMap<>();
          map.put(5, -3);
          map.put(1, 4);
          map.put(0, 2);

          public void addE( int power, int coefficient){
              if (power < 0) {
                  power = Math.abs(power);
              }
          }
          for (Entry<Integer, Integer> m : map.entrySet()) {
              if ((Integer) m.getKey() == power) {
                  map.put(power, m.getValue());
              }
          }
      }
  }

