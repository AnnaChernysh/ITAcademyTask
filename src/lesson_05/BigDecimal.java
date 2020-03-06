package lesson_05;
        /*Определить класс, который при инициализации принимает на вход 2 аргумента целого (byte,short,int,long)
        или вещественного типа(float,double)
        Задать перегруженные методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal.*/


public class BigDecimal{

    BigDecimal arg1;
    BigDecimal arg2;
    int intArg1;
    int intArg2;
    double doubleArg1;
    double doubleArg2;

    public class  newCount(int arg1, int arg2){
    this.arg1 = new BigDecimal(arg1);
    this.arg2 = new BigDecimal(arg2);
}
    public class  newCount(double i, double y){
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(doubleArg2);
    }
    public class  newCount(int arg1, double arg2){
        this.intArg1 = arg1;
        this.doubleArg1 = arg2;
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
    }
    public class  newCount(double arg2, int arg1){
        this.doubleArg2 = new BigDecimal(arg1);
        this.intArg1 = new BigDecimal(arg2);
    }

    public static void main(String[] args) {
        Sistem.out.println(new newCount(3,9) addAsBigDecimal());


    BigDecimal addAsBigDecimal(){
         return arg1.devide(arg2);
        }
int add asInte
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

