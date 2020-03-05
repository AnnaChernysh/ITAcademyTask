package lesson_05;
        /*Определить класс, который при инициализации принимает на вход 2 аргумента целого (byte,short,int,long)
        или вещественного типа(float,double)
        Задать перегруженные методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal.*/



public class BigDecimal{
        public static void main(String[] args) {
        double a = 3.8;
        double b = 5.9;

            BigDecimal bd1 = new BigDecimal(double a);
            BigDecimal bd2 = new BigDecimal(double b);


            public double sum(double a, double b){
            return a + b;
        }
            public BigDecimal sum (bd1, bd2){
            bd1 = bd1.add(bd2);
            System.out.println("BigDecimal1 = " + bd1);
        }
           public double multiply (double a, double b){
           return a * b;
        }
           public BigDecimal multiply(bd1, bd2){
           bd1 = bd1.multiply(bd2);
           System.out.println("BigDecimal1 = " + bd1);
        }
           public double substract(double a, double b){
           return a - b;
        }
          public BigDecimal substract (bd1, bd2) {
           bd1 = bd1.subtract(bd2);
           System.out.println("BigDecimal1 = " + bd1);
          }

            public double devide ( double a, double b){
            return a / b;
            }
            public BigDecimal devide (bd1, bd2){
                bd1 = bd1.divide(bd2);
                System.out.println("BigDecimal1 = " + bd1);

            }
        }

    private BigDecimal add(BigDecimal bd2) {
    }

