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

    public class newCount(int arg1, int arg2){
    this.arg1 = new BigDecimal(arg1);
    this.arg2 = new BigDecimal(arg2);
}
    public class  newCount(double arg1, double arg2){
        this.doubleArg1 = new BigDecimal(arg1);
        this.doubleArg2 = new BigDecimal(doubleArg2);
    }
    public class  newCount(int arg1, double arg2){
        this.intArg1 = arg1;
        this.doubleArg1 = arg2;
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
    }
    public class  newCount(double arg2, int arg1){
        this.doubleArg2 = arg2;
        this.intArg1 = arg1;
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
            }

    public static void main(String[] args) {
        System.out.println(new newCount(3, 9)addAsBigDecimal());
    }

        public double sum ( doubleArg1, doubleArg2){
            return doubleArg1 + doubleArg2;
        }
        public BigDecimal sum (arg1, arg2){
            return arg1.add(arg2);
    }
        public double multiply (doubleArg1, doubleArg2){
            return doubleArg1 * doubleArg2;
        }
        public BigDecimal multiply (arg1, arg2){
            return arg1.multiply(arg2);

        }
        public double substract ( doubleArg1, doubleArg2){
            return doubleArg1 - doubleArg2;
        }
        public BigDecimal substract (arg1, arg2){
           return arg1.subtract(arg2);
                    }

        public double devide ( doubleArg1, doubleArg2){
            return doubleArg1 / doubleArg2;
        }
        public BigDecimal devide (arg1, arg2){
            return arg1.divide(arg2);

        }
    }

    private static Object addAsBigDecimal() {
    }

