package lesson_05;

import java.math.BigDecimal;

public class BigDecimal{

    BigDecimal arg1;
    BigDecimal arg2;
    int intArg1;
    int intArg2;
    double doubleArg1;
    double doubleArg2;

    public newCount(int arg1, int arg2){
    this.arg1 = new BigDecimal(arg1);
    this.arg2 = new BigDecimal(arg2);
}
    public newCount(double arg1, double arg2){
        this.doubleArg1 = new BigDecimal(doubleArg1);
        this.doubleArg2 = new BigDecimal(doubleArg2);
    }
    public newCount(int arg1, double arg2){
        this.intArg1 = arg1;
        this.doubleArg1 = arg2;
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(doubleArg2);
    }
    public newCount(double arg2, int arg1){
        this.doubleArg2 = arg2;
        this.intArg1 = arg1;
        this.arg1 = new BigDecimal(doubleArg2);
        this.arg2 = new BigDecimal(arg1);
            }

    public static void main(String[] args) {

    }

    public double add( doubleArg1, doubleArg2){
            return doubleArg1 + doubleArg2;
        }

    public BigDecimal add(BigDecimal arg1, BigDecimal arg2) {
        return arg1.add(arg2);
    }

    public double multiply (doubleArg1, doubleArg2){
            return doubleArg1 * doubleArg2;
        }

    public BigDecimal multiply (arg1, arg2){ return arg1.multiply(arg2); }

    public double substract ( doubleArg1, doubleArg2) {
            return doubleArg1 - doubleArg2;
        }

    public BigDecimal subtract(BigDecimal arg2, BigDecimal arg2) {
        return arg1.subtract(arg2);
    }

    public double devide ( doubleArg1, doubleArg2){
         return doubleArg1 / doubleArg2;
        }

    public BigDecimal divide(BigDecimal arg1, BigDecimal arg2) {
        return arg1.divide(arg2);

    }
}

